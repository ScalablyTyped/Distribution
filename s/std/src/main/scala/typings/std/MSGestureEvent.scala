package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MSGestureEvent is a proprietary interface specific to Internet Explorer and Microsoft Edge which represents events that occur due to touch gestures. Events using this interface include MSGestureStart, MSGestureEnd, MSGestureTap, MSGestureHold, MSGestureChange, and MSInertiaStart. */
@js.native
trait MSGestureEvent extends UIEvent {
  val MSGESTURE_FLAG_BEGIN: Double = js.native
  val MSGESTURE_FLAG_CANCEL: Double = js.native
  val MSGESTURE_FLAG_END: Double = js.native
  val MSGESTURE_FLAG_INERTIA: Double = js.native
  val MSGESTURE_FLAG_NONE: Double = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val expansion: Double = js.native
  val gestureObject: js.Any = js.native
  val hwTimestamp: Double = js.native
  val offsetX: Double = js.native
  val offsetY: Double = js.native
  val rotation: Double = js.native
  val scale: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val translationX: Double = js.native
  val translationY: Double = js.native
  val velocityAngular: Double = js.native
  val velocityExpansion: Double = js.native
  val velocityX: Double = js.native
  val velocityY: Double = js.native
  def initGestureEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    offsetXArg: Double,
    offsetYArg: Double,
    translationXArg: Double,
    translationYArg: Double,
    scaleArg: Double,
    expansionArg: Double,
    rotationArg: Double,
    velocityXArg: Double,
    velocityYArg: Double,
    velocityExpansionArg: Double,
    velocityAngularArg: Double,
    hwTimestampArg: Double
  ): Unit = js.native
}

