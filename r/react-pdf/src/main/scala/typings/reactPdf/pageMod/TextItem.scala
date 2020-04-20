package typings.reactPdf.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextItem extends js.Object {
  var dir: String
  var fontName: String
  var height: Double
  var str: String
  var transform: js.Array[Double]
  var width: Double
}

object TextItem {
  @scala.inline
  def apply(
    dir: String,
    fontName: String,
    height: Double,
    str: String,
    transform: js.Array[Double],
    width: Double
  ): TextItem = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextItem]
  }
}

