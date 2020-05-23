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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    initialVelocity: js.UndefOr[Double] = js.undefined,
    property: String = null,
    springDamping: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialVelocity)) __obj.updateDynamic("initialVelocity")(initialVelocity.get.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (!js.isUndefined(springDamping)) __obj.updateDynamic("springDamping")(springDamping.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
}

