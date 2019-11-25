package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxModel extends js.Object {
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box]
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box]
  var height: Double
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box]
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box]
  var width: Double
}

object BoxModel {
  @scala.inline
  def apply(
    border: js.Array[Box],
    content: js.Array[Box],
    height: Double,
    margin: js.Array[Box],
    padding: js.Array[Box],
    width: Double
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoxModel]
  }
}

