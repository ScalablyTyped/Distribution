package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationAnim extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var initialVelocity: js.UndefOr[scala.Double] = js.undefined
   //LayoutAnimationTypes
  var property: js.UndefOr[java.lang.String] = js.undefined
  var springDamping: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutAnimationAnim {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    initialVelocity: scala.Int | scala.Double = null,
    property: java.lang.String = null,
    springDamping: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (initialVelocity != null) __obj.updateDynamic("initialVelocity")(initialVelocity.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (springDamping != null) __obj.updateDynamic("springDamping")(springDamping.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
}

