package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Data
import typings.reactNavigationStack.anon.DataUndefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationEventMap extends js.Object {
  
  /**
    * Event which fires when navigation gesture is canceled.
    */
  var gestureCancel: DataUndefined = js.native
  
  /**
    * Event which fires when navigation gesture is completed.
    */
  var gestureEnd: DataUndefined = js.native
  
  /**
    * Event which fires when navigation gesture starts.
    */
  var gestureStart: DataUndefined = js.native
  
  /**
    * Event which fires when a transition animation ends.
    */
  var transitionEnd: Data = js.native
  
  /**
    * Event which fires when a transition animation starts.
    */
  var transitionStart: Data = js.native
}
object StackNavigationEventMap {
  
  @scala.inline
  def apply(
    gestureCancel: DataUndefined,
    gestureEnd: DataUndefined,
    gestureStart: DataUndefined,
    transitionEnd: Data,
    transitionStart: Data
  ): StackNavigationEventMap = {
    val __obj = js.Dynamic.literal(gestureCancel = gestureCancel.asInstanceOf[js.Any], gestureEnd = gestureEnd.asInstanceOf[js.Any], gestureStart = gestureStart.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationEventMap]
  }
  
  @scala.inline
  implicit class StackNavigationEventMapOps[Self <: StackNavigationEventMap] (val x: Self) extends AnyVal {
    
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
    def setGestureCancel(value: DataUndefined): Self = this.set("gestureCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnd(value: DataUndefined): Self = this.set("gestureEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureStart(value: DataUndefined): Self = this.set("gestureStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnd(value: Data): Self = this.set("transitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionStart(value: Data): Self = this.set("transitionStart", value.asInstanceOf[js.Any])
  }
}
