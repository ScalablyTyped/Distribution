package typings.reactToastify.typesMod

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastTransitionProps extends js.Object {
  
  var appear: Boolean = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  def done(): Unit = js.native
  
  var in: Boolean = js.native
  
  var nodeRef: RefObject[HTMLElement] = js.native
  
  var position: ToastPosition | String = js.native
  
  var preventExitTransition: Boolean = js.native
}
object ToastTransitionProps {
  
  @scala.inline
  def apply(
    appear: Boolean,
    done: () => Unit,
    in: Boolean,
    nodeRef: RefObject[HTMLElement],
    position: ToastPosition | String,
    preventExitTransition: Boolean
  ): ToastTransitionProps = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], done = js.Any.fromFunction0(done), in = in.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTransitionProps]
  }
  
  @scala.inline
  implicit class ToastTransitionPropsOps[Self <: ToastTransitionProps] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRef(value: RefObject[HTMLElement]): Self = this.set("nodeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: ToastPosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventExitTransition(value: Boolean): Self = this.set("preventExitTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
