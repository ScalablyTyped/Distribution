package typings.rcUtil

import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomFindDOMNodeMod {
  
  @JSImport("rc-util/es/Dom/findDOMNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](node: ReactInstance): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](node: HTMLElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](node: SVGElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isDOM(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOM")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
