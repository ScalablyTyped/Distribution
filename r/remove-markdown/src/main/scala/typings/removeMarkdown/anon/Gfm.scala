package typings.removeMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gfm extends js.Object {
  var gfm: js.UndefOr[Boolean] = js.undefined
  var stripListLeaders: js.UndefOr[Boolean] = js.undefined
}

object Gfm {
  @scala.inline
  def apply(gfm: js.UndefOr[Boolean] = js.undefined, stripListLeaders: js.UndefOr[Boolean] = js.undefined): Gfm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripListLeaders)) __obj.updateDynamic("stripListLeaders")(stripListLeaders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gfm]
  }
}

