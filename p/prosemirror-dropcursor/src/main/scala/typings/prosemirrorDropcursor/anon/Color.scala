package typings.prosemirrorDropcursor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String | Null] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object Color {
  @scala.inline
  def apply(color: js.UndefOr[Null | String] = js.undefined, width: js.UndefOr[Null | Double] = js.undefined): Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

