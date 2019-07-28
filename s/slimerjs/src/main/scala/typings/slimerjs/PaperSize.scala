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
    val __obj = js.Dynamic.literal(border = border)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PaperSize]
  }
}

