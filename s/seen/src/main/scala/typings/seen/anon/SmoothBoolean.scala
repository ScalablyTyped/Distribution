package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothBoolean extends js.Object {
  var smooth: js.UndefOr[Boolean] = js.undefined
}

object SmoothBoolean {
  @scala.inline
  def apply(smooth: js.UndefOr[Boolean] = js.undefined): SmoothBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothBoolean]
  }
}

