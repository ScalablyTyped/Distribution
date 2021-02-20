package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Data
import typings.reactNavigationStack.anon.DataUndefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationEventMap extends StObject {
  
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
  implicit class StackNavigationEventMapMutableBuilder[Self <: StackNavigationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGestureCancel(value: DataUndefined): Self = StObject.set(x, "gestureCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnd(value: DataUndefined): Self = StObject.set(x, "gestureEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureStart(value: DataUndefined): Self = StObject.set(x, "gestureStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnd(value: Data): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionStart(value: Data): Self = StObject.set(x, "transitionStart", value.asInstanceOf[js.Any])
  }
}
