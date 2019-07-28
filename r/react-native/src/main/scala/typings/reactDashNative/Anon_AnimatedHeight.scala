package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedHeight extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Anon_AnimatedHeight {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double, animated: js.UndefOr[Boolean] = js.undefined): Anon_AnimatedHeight = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[Anon_AnimatedHeight]
  }
}

