package typings.reactWidgets

import typings.reactWidgets.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseDropdownToggleMod {
  
  @JSImport("react-widgets/cjs/useDropdownToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(isOpen: Boolean, onToggle: js.Function1[/* isOpen */ Boolean, Unit]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(isOpen.asInstanceOf[js.Any], onToggle.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def default(isOpen: Unit, onToggle: js.Function1[/* isOpen */ Boolean, Unit]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(isOpen.asInstanceOf[js.Any], onToggle.asInstanceOf[js.Any])).asInstanceOf[Call]
}
