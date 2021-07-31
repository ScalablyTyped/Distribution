package typings.reactDom

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStreamMod {
  
  @JSImport("react-dom/node-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def renderToStaticStream(element: ReactElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticStream")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def renderToStream(element: ReactElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStream")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("react-dom/node-stream", "version")
  @js.native
  val version: String = js.native
}
