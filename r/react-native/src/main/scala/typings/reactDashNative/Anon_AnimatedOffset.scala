package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedOffset extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var offset: Double
}

object Anon_AnimatedOffset {
  @scala.inline
  def apply(offset: Double, animated: js.UndefOr[Boolean] = js.undefined): Anon_AnimatedOffset = {
    val __obj = js.Dynamic.literal(offset = offset)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[Anon_AnimatedOffset]
  }
}

