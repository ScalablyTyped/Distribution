package typings.rcUtil

import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findDOMNodeMod {
  
  @JSImport("rc-util/lib/Dom/findDOMNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](node: ReactInstance): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](node: HTMLElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
}
