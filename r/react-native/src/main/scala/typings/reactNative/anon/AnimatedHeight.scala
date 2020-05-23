package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedHeight extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object AnimatedHeight {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double, animated: js.UndefOr[Boolean] = js.undefined): AnimatedHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedHeight]
  }
}

