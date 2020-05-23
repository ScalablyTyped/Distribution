package typings.reactNativeDocumentPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filetype: js.Array[String]
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filetype: js.Array[String],
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(filetype = filetype.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

