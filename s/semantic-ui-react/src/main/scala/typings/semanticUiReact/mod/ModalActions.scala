package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.modalActionsMod.ModalActionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "ModalActions")
@js.native
open class ModalActions protected () extends Component[ModalActionsProps, ComponentState, Any] {
  def this(props: ModalActionsProps) = this()
  def this(props: ModalActionsProps, context: Any) = this()
}
object ModalActions {
  
  inline def apply: ComponentClass[ModalActionsProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("ModalActions").asInstanceOf[ComponentClass[ModalActionsProps, ComponentState]]
}
