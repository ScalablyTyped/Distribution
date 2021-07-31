package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.transitionGroupMod.TransitionGroupComponent
import typings.semanticUiReact.transitionGroupMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "TransitionGroup")
@js.native
class TransitionGroup protected ()
  extends Component[TransitionGroupProps, ComponentState, js.Any] {
  def this(props: TransitionGroupProps) = this()
  def this(props: TransitionGroupProps, context: js.Any) = this()
}
object TransitionGroup {
  
  @scala.inline
  def apply: TransitionGroupComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("TransitionGroup").asInstanceOf[TransitionGroupComponent]
}
