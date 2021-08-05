package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.confirmConfirmMod.ConfirmProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Confirm")
@js.native
class Confirm protected ()
  extends Component[ConfirmProps, ComponentState, js.Any] {
  def this(props: ConfirmProps) = this()
  def this(props: ConfirmProps, context: js.Any) = this()
}
object Confirm {
  
  inline def apply: ComponentClass[ConfirmProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Confirm").asInstanceOf[ComponentClass[ConfirmProps, ComponentState]]
}
