package typings.reactWidgets

import typings.react.mod.RefObject
import typings.reactWidgets.anon.Focus
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseTabTrapMod {
  
  @JSImport("react-widgets/cjs/useTabTrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[Element]): Focus = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Focus]
  inline def default(ref: RefObject[Element], selector: String): Focus = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Focus]
}
