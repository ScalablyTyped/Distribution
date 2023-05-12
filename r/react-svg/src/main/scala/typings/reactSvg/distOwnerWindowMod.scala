package typings.reactSvg

import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOwnerWindowMod {
  
  @JSImport("react-svg/dist/owner-window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Window & (/* globalThis */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Window & (/* globalThis */ Any)]
  inline def default(node: Node): Window & (/* globalThis */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window & (/* globalThis */ Any)]
}
