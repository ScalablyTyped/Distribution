package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomError = typings.std.Error
  
  type EvaluateFn[T] = java.lang.String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  
  type EvaluateFnReturnType[T /* <: typings.puppeteer.mod.EvaluateFn[_] */] = js.Any
  
  type EventType = java.lang.String | js.Symbol
  
  type Handler[T] = js.Function1[/* event */ js.UndefOr[T], scala.Unit]
  
  type Headers = typings.std.Record[java.lang.String, java.lang.String]
  
  type LayoutDimension = java.lang.String | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typings.puppeteer.mod.JSONArray
    - typings.puppeteer.mod.JSONObject
  */
  type Serializable = typings.puppeteer.mod._Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  
  type SerializableOrJSHandle = typings.puppeteer.mod.Serializable | typings.puppeteer.mod.JSHandle[js.Any]
  
  /**
    * TimeoutError is emitted whenever certain operations are terminated due to timeout.
    *
    * Example operations are {@link Page.waitForSelector | page.waitForSelector}
    * or {@link PuppeteerNode.launch | puppeteer.launch}.
    */
  type TimeoutError = typings.puppeteer.mod.CustomError
  
  type UnwrapElementHandle[X] = X
  
  type WrapElementHandle[X] = X | typings.puppeteer.mod.ElementHandle[X]
  
  @scala.inline
  def clearCustomQueryHandlers(): scala.Unit = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def connect(): js.Promise[typings.puppeteer.mod.Browser] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[typings.puppeteer.mod.Browser]]
  @scala.inline
  def connect(options: typings.puppeteer.mod.ConnectOptions): js.Promise[typings.puppeteer.mod.Browser] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.puppeteer.mod.Browser]]
  
  @scala.inline
  def createBrowserFetcher(): typings.puppeteer.mod.BrowserFetcher = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")().asInstanceOf[typings.puppeteer.mod.BrowserFetcher]
  @scala.inline
  def createBrowserFetcher(options: typings.puppeteer.mod.FetcherOptions): typings.puppeteer.mod.BrowserFetcher = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteer.mod.BrowserFetcher]
  
  @scala.inline
  def customQueryHandlerNames(): js.Array[java.lang.String] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def defaultArgs(): js.Array[java.lang.String] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def defaultArgs(options: typings.puppeteer.mod.ChromeArgOptions): js.Array[java.lang.String] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def executablePath(): java.lang.String = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def launch(): js.Promise[typings.puppeteer.mod.Browser] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[typings.puppeteer.mod.Browser]]
  @scala.inline
  def launch(options: typings.puppeteer.mod.LaunchOptions): js.Promise[typings.puppeteer.mod.Browser] = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.puppeteer.mod.Browser]]
  
  @scala.inline
  def product: typings.puppeteer.mod.Product_ = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].selectDynamic("product").asInstanceOf[typings.puppeteer.mod.Product_]
  
  @scala.inline
  def registerCustomQueryHandler(name: java.lang.String, queryHandler: typings.puppeteer.mod.CustomQueryHandler): scala.Unit = (typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], queryHandler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unregisterCustomQueryHandler(name: java.lang.String): scala.Unit = typings.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
