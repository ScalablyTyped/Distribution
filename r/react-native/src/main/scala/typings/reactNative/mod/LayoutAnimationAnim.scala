package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationAnim extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var initialVelocity: js.UndefOr[Double] = js.undefined
   //LayoutAnimationTypes
  var property: js.UndefOr[String] = js.undefined
  var springDamping: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LayoutAnimationAnim {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    initialVelocity: Int | Double = null,
    property: String = null,
    springDamping: Int | Double = null,
    `type`: String = null
  ): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (initialVelocity != null) __obj.updateDynamic("initialVelocity")(initialVelocity.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (springDamping != null) __obj.updateDynamic("springDamping")(springDamping.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
}

