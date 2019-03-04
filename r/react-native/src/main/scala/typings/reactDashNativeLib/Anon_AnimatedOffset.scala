package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedOffset extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var offset: scala.Double
}

object Anon_AnimatedOffset {
  @scala.inline
  def apply(offset: scala.Double, animated: js.UndefOr[scala.Boolean] = js.undefined): Anon_AnimatedOffset = {
    val __obj = js.Dynamic.literal(offset = offset)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[Anon_AnimatedOffset]
  }
}

