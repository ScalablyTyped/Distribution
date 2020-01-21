package typings.removeMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGfm extends js.Object {
  var gfm: js.UndefOr[Boolean] = js.undefined
  var stripListLeaders: js.UndefOr[Boolean] = js.undefined
}

object AnonGfm {
  @scala.inline
  def apply(gfm: js.UndefOr[Boolean] = js.undefined, stripListLeaders: js.UndefOr[Boolean] = js.undefined): AnonGfm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (!js.isUndefined(stripListLeaders)) __obj.updateDynamic("stripListLeaders")(stripListLeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGfm]
  }
}

