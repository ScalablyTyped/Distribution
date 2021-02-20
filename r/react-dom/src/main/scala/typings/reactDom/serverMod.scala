package typings.reactDom

import typings.react.mod.ReactElement
import typings.reactDom.serverMod.global.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-dom/server", "renderToNodeStream")
  @js.native
  def renderToNodeStream(element: ReactElement): ReadableStream = js.native
  
  @JSImport("react-dom/server", "renderToStaticMarkup")
  @js.native
  def renderToStaticMarkup(element: ReactElement): String = js.native
  
  @JSImport("react-dom/server", "renderToStaticNodeStream")
  @js.native
  def renderToStaticNodeStream(element: ReactElement): ReadableStream = js.native
  
  @JSImport("react-dom/server", "renderToString")
  @js.native
  def renderToString(element: ReactElement): String = js.native
  
  @JSImport("react-dom/server", "version")
  @js.native
  val version: String = js.native
  
  object global {
    
    object NodeJS {
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait ReadableStream extends StObject
    }
  }
}
