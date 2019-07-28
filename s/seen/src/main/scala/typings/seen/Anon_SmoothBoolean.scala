package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SmoothBoolean extends js.Object {
  var smooth: js.UndefOr[Boolean] = js.undefined
}

object Anon_SmoothBoolean {
  @scala.inline
  def apply(smooth: js.UndefOr[Boolean] = js.undefined): Anon_SmoothBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    __obj.asInstanceOf[Anon_SmoothBoolean]
  }
}

