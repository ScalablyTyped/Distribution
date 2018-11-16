package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GestureResponderHandlers extends js.Object {
  /**
       * Called for every touch move on the View when it is not the responder: does this view want to "claim" touch responsiveness?
       */
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Boolean]] = js.undefined
  /**
       * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
       * where the deepest node is called first.
       * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
       * This is desirable in most cases, because it makes sure all controls and buttons are usable.
       *
       * However, sometimes a parent will want to make sure that it becomes responder.
       * This can be handled by using the capture phase.
       * Before the responder system bubbles up from the deepest component,
       * it will do a capture phase, firing on*ShouldSetResponderCapture.
       * So if a parent View wants to prevent the child from becoming responder on a touch start,
       * it should have a onStartShouldSetResponderCapture handler which returns true.
       */
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Boolean]] = js.undefined
  /**
       * If the View returns true and attempts to become the responder, one of the following will happen:
       */
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * The View is now responding for touch events.
       * This is the time to highlight and show the user what is happening
       */
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * If the view is responding, the following handlers can be called:
       */
  
  /**
       * The user is moving their finger
       */
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * Something else is the responder right now and will not release it
       */
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * Fired at the end of the touch, ie "touchUp"
       */
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * The responder has been taken from the View.
       * Might be taken by other views after a call to onResponderTerminationRequest,
       * or might be taken by the OS without asking (happens with control center/ notification center on iOS)
       */
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       *  Something else wants to become responder.
       *  Should this view release the responder? Returning true allows release
       */
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Boolean]] = js.undefined
  /**
       * A view can become the touch responder by implementing the correct negotiation methods.
       * There are two methods to ask the view if it wants to become responder:
       */
  
  /**
       * Does this view want to become responder on the start of a touch?
       */
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Boolean]] = js.undefined
  /**
       * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
       * where the deepest node is called first.
       * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
       * This is desirable in most cases, because it makes sure all controls and buttons are usable.
       *
       * However, sometimes a parent will want to make sure that it becomes responder.
       * This can be handled by using the capture phase.
       * Before the responder system bubbles up from the deepest component,
       * it will do a capture phase, firing on*ShouldSetResponderCapture.
       * So if a parent View wants to prevent the child from becoming responder on a touch start,
       * it should have a onStartShouldSetResponderCapture handler which returns true.
       */
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Boolean]] = js.undefined
}

