package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedHeight extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_AnimatedHeight {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    animated: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AnimatedHeight = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[Anon_AnimatedHeight]
  }
}

