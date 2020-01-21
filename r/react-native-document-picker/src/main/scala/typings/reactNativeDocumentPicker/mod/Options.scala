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
  def apply(filetype: js.Array[String], left: Int | Double = null, top: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal(filetype = filetype.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

