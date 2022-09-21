package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.transitionGroupMod.TransitionGroupProps
import typings.semanticUiReact.transitionTransitionMod.TransitionComponent
import typings.semanticUiReact.transitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Transition")
@js.native
open class Transition protected () extends Component[TransitionProps, ComponentState, Any] {
  def this(props: TransitionProps) = this()
  def this(props: TransitionProps, context: Any) = this()
}
object Transition extends Shortcut {
  
  @JSImport("semantic-ui-react", "Transition")
  @js.native
  val ^ : TransitionComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Transition.Group")
  @js.native
  open class Group protected () extends Component[TransitionGroupProps, ComponentState, Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: Any) = this()
  }
  
  type _To = TransitionComponent
  
  /* This means you don't have to write `^`, but can instead just say `Transition.foo` */
  override def _to: TransitionComponent = ^
}
