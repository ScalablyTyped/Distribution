package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSGestureEvent extends UIEvent {
  val MSGESTURE_FLAG_BEGIN: scala.Double = js.native
  val MSGESTURE_FLAG_CANCEL: scala.Double = js.native
  val MSGESTURE_FLAG_END: scala.Double = js.native
  val MSGESTURE_FLAG_INERTIA: scala.Double = js.native
  val MSGESTURE_FLAG_NONE: scala.Double = js.native
  val clientX: scala.Double = js.native
  val clientY: scala.Double = js.native
  val expansion: scala.Double = js.native
  val gestureObject: js.Any = js.native
  val hwTimestamp: scala.Double = js.native
  val offsetX: scala.Double = js.native
  val offsetY: scala.Double = js.native
  val rotation: scala.Double = js.native
  val scale: scala.Double = js.native
  val screenX: scala.Double = js.native
  val screenY: scala.Double = js.native
  val translationX: scala.Double = js.native
  val translationY: scala.Double = js.native
  val velocityAngular: scala.Double = js.native
  val velocityExpansion: scala.Double = js.native
  val velocityX: scala.Double = js.native
  val velocityY: scala.Double = js.native
  def initGestureEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    offsetXArg: scala.Double,
    offsetYArg: scala.Double,
    translationXArg: scala.Double,
    translationYArg: scala.Double,
    scaleArg: scala.Double,
    expansionArg: scala.Double,
    rotationArg: scala.Double,
    velocityXArg: scala.Double,
    velocityYArg: scala.Double,
    velocityExpansionArg: scala.Double,
    velocityAngularArg: scala.Double,
    hwTimestampArg: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("MSGestureEvent")
@js.native
class MSGestureEventCls () extends MSGestureEvent

@JSGlobal("MSGestureEvent")
@js.native
object MSGestureEvent
  extends org.scalablytyped.runtime.Instantiable0[MSGestureEvent] {
  val MSGESTURE_FLAG_BEGIN: scala.Double = js.native
  val MSGESTURE_FLAG_CANCEL: scala.Double = js.native
  val MSGESTURE_FLAG_END: scala.Double = js.native
  val MSGESTURE_FLAG_INERTIA: scala.Double = js.native
  val MSGESTURE_FLAG_NONE: scala.Double = js.native
}

