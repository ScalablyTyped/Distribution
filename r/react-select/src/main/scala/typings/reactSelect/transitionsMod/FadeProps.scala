package typings.reactSelect.transitionsMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-select.react-select/src/animated/transitions.BaseTransition & {  component :react.react.ComponentType<any>,   duration :number} */
@js.native
trait FadeProps extends js.Object {
  
  var component: ComponentType[_] = js.native
  
  var duration: Double = js.native
  
  /** Whether we are in a transition. */
  var in: Boolean = js.native
  
  /** Function to be called once transition finishes. */
  var onExited: fn = js.native
}
object FadeProps {
  
  @scala.inline
  def apply(component: ComponentType[_], duration: Double, in: Boolean, onExited: () => Unit): FadeProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[FadeProps]
  }
  
  @scala.inline
  implicit class FadePropsOps[Self <: FadeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExited(value: () => Unit): Self = this.set("onExited", js.Any.fromFunction0(value))
  }
}
