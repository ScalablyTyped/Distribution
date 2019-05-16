package typings
package reactDashPdfLib.distPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextItem extends js.Object {
  var dir: java.lang.String
  var fontName: java.lang.String
  var height: scala.Double
  var str: java.lang.String
  var transform: js.Array[scala.Double]
  var width: scala.Double
}

object TextItem {
  @scala.inline
  def apply(
    dir: java.lang.String,
    fontName: java.lang.String,
    height: scala.Double,
    str: java.lang.String,
    transform: js.Array[scala.Double],
    width: scala.Double
  ): TextItem = {
    val __obj = js.Dynamic.literal(dir = dir, fontName = fontName, height = height, str = str, transform = transform, width = width)
  
    __obj.asInstanceOf[TextItem]
  }
}

