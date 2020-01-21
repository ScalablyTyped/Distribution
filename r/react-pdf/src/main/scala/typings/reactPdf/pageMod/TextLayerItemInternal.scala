package typings.reactPdf.pageMod

import typings.reactPdf.reactPdfNumbers.`0`
import typings.reactPdf.reactPdfNumbers.`180`
import typings.reactPdf.reactPdfNumbers.`270`
import typings.reactPdf.reactPdfNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextLayerItemInternal extends js.Object {
  var fontName: String
  var itemIndex: Double
  var page: PDFPageItem
  var rotate: js.UndefOr[`0` | `90` | `180` | `270`] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var str: String
  var transform: js.Array[Double]
  var width: Double
}

object TextLayerItemInternal {
  @scala.inline
  def apply(
    fontName: String,
    itemIndex: Double,
    page: PDFPageItem,
    str: String,
    transform: js.Array[Double],
    width: Double,
    rotate: `0` | `90` | `180` | `270` = null,
    scale: Int | Double = null
  ): TextLayerItemInternal = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayerItemInternal]
  }
}

