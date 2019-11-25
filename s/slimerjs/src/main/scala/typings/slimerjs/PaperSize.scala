package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaperSize extends js.Object {
  var border: String
  var format: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object PaperSize {
  @scala.inline
  def apply(
    border: String,
    format: String = null,
    height: String = null,
    margin: js.Any = null,
    orientation: String = null,
    width: String = null
  ): PaperSize = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaperSize]
  }
}

