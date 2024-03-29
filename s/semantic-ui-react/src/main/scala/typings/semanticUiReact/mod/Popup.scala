package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesPopupPopupMod.PopupComponent
import typings.semanticUiReact.distCommonjsModulesPopupPopupMod.PopupProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Popup")
@js.native
open class Popup protected () extends Component[PopupProps, ComponentState, Any] {
  def this(props: PopupProps) = this()
  def this(props: PopupProps, context: Any) = this()
}
object Popup {
  
  inline def apply: PopupComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Popup").asInstanceOf[PopupComponent]
}
