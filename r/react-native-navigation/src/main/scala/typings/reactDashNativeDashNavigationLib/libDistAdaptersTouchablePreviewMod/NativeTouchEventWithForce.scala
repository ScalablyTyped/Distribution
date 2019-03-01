package typings
package reactDashNativeDashNavigationLib.libDistAdaptersTouchablePreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTouchEventWithForce
  extends reactDashNativeLib.reactDashNativeMod.NativeTouchEvent {
  var force: scala.Double
}

object NativeTouchEventWithForce {
  @scala.inline
  def apply(
    changedTouches: js.Array[reactDashNativeLib.reactDashNativeMod.NativeTouchEvent],
    force: scala.Double,
    identifier: java.lang.String,
    locationX: scala.Double,
    locationY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    target: java.lang.String,
    timestamp: scala.Double,
    touches: js.Array[reactDashNativeLib.reactDashNativeMod.NativeTouchEvent]
  ): NativeTouchEventWithForce = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedTouches")(changedTouches)
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("locationX")(locationX)
    __obj.updateDynamic("locationY")(locationY)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[NativeTouchEventWithForce]
  }
}

