package typings.reactDashSelect.srcAnimatedTransitionsMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/animated/transitions.BaseTransition & {  component  :react.react.ComponentType<any>,   duration  :number} */
trait FadeProps extends js.Object {
  var component: ComponentType[_]
  var duration: Double
  /** Whether we are in a transition. */
  var in: Boolean
  /** Function to be called once transition finishes. */
  var onExited: fn
}

object FadeProps {
  @scala.inline
  def apply(component: ComponentType[_], duration: Double, in: Boolean, onExited: () => Unit): FadeProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
  
    __obj.asInstanceOf[FadeProps]
  }
}

