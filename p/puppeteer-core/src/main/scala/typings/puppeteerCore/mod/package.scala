package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.mod.^
import typings.std.Capitalize
import typings.std.Element
import typings.std.Lowercase
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_INTERCEPT_RESOLUTION_PRIORITY: /* 0 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERCEPT_RESOLUTION_PRIORITY").asInstanceOf[/* 0 */ Double]

inline def EVALUATION_SCRIPT_URL: /* "pptr://__puppeteer_evaluation_script__" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVALUATION_SCRIPT_URL").asInstanceOf[/* "pptr://__puppeteer_evaluation_script__" */ String]

inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]

inline def connect(options: ConnectOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def createBrowserFetcher(options: BrowserFetcherOptions): BrowserFetcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserFetcher]

inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]

inline def defaultArgs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")().asInstanceOf[js.Array[String]]
inline def defaultArgs(options: BrowserLaunchArgumentOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def devices: DevicesMap = ^.asInstanceOf[js.Dynamic].selectDynamic("devices").asInstanceOf[DevicesMap]

inline def executablePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")().asInstanceOf[String]
inline def executablePath(channel: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")(channel.asInstanceOf[js.Any]).asInstanceOf[String]

inline def launch(): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[Browser]]
inline def launch(options: PuppeteerLaunchOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

type Awaitable[T] = T | js.Thenable[T]

type DevicesMap = StringDictionary[Device]

type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]

type EventType = String | js.Symbol

type FlattenHandle[T] = Any

/* Rewritten from type alias, can be one of: 
  - typings.puppeteerCore.mod.HandleFor[T]
  - typings.puppeteerCore.mod.JSHandle[T]
  - T
*/
type HandleOr[T] = _HandleOr[T] | T

type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]

type InnerParams[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: puppeteer-core.puppeteer-core.FlattenHandle<T[K]>}
  */ typings.puppeteerCore.puppeteerCoreStrings.InnerParams & TopLevel[T]

type InterceptResolutionStrategy = InterceptResolutionAction

type NodeFor[Selector /* <: String */] = Element | (/* import warning: importer.ImportType#apply Failed type conversion: std.SVGElementTagNameMap[Selector] */ js.Any)

type PaperFormat = Uppercase[LowerCasePaperFormat] | Capitalize[LowerCasePaperFormat] | LowerCasePaperFormat

type ResourceType = Lowercase[typings.devtoolsProtocol.mod.Protocol.Network.ResourceType]

type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
