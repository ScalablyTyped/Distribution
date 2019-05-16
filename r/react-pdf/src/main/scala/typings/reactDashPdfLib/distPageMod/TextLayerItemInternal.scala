package typings
package reactDashPdfLib.distPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextLayerItemInternal extends js.Object {
  var fontName: java.lang.String
  var itemIndex: scala.Double
  var page: PDFPageItem
  var rotate: js.UndefOr[
    reactDashPdfLib.reactDashPdfLibNumbers.`0` | reactDashPdfLib.reactDashPdfLibNumbers.`90` | reactDashPdfLib.reactDashPdfLibNumbers.`180` | reactDashPdfLib.reactDashPdfLibNumbers.`270`
  ] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var str: java.lang.String
  var transform: js.Array[scala.Double]
  var width: scala.Double
}

object TextLayerItemInternal {
  @scala.inline
  def apply(
    fontName: java.lang.String,
    itemIndex: scala.Double,
    page: PDFPageItem,
    str: java.lang.String,
    transform: js.Array[scala.Double],
    width: scala.Double,
    rotate: reactDashPdfLib.reactDashPdfLibNumbers.`0` | reactDashPdfLib.reactDashPdfLibNumbers.`90` | reactDashPdfLib.reactDashPdfLibNumbers.`180` | reactDashPdfLib.reactDashPdfLibNumbers.`270` = null,
    scale: scala.Int | scala.Double = null
  ): TextLayerItemInternal = {
    val __obj = js.Dynamic.literal(fontName = fontName, itemIndex = itemIndex, page = page, str = str, transform = transform, width = width)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayerItemInternal]
  }
}

