package typings.reactDom

import typings.react.mod.ReactElement
import typings.reactDom.serverMod.global.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-dom/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToNodeStream(element: ReactElement): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToStaticMarkup(element: ReactElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticMarkup")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def renderToStaticNodeStream(element: ReactElement): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToString(element: ReactElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("react-dom/server", "version")
  @js.native
  val version: String = js.native
  
  object global {
    
    object NodeJS {
      
      // tslint:disable-next-line:no-empty-interface
      trait ReadableStream extends StObject
    }
  }
}
