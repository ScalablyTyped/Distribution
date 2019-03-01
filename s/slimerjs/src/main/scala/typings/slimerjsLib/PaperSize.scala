package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaperSize extends js.Object {
  var border: java.lang.String
  var format: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PaperSize {
  @scala.inline
  def apply(
    border: java.lang.String,
    format: java.lang.String = null,
    height: java.lang.String = null,
    margin: js.Any = null,
    orientation: java.lang.String = null,
    width: java.lang.String = null
  ): PaperSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("border")(border)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PaperSize]
  }
}

