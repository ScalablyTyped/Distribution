package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxModel extends js.Object {
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box]
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box]
  var height: scala.Double
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box]
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box]
  var width: scala.Double
}

object BoxModel {
  @scala.inline
  def apply(
    border: js.Array[Box],
    content: js.Array[Box],
    height: scala.Double,
    margin: js.Array[Box],
    padding: js.Array[Box],
    width: scala.Double
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border, content = content, height = height, margin = margin, padding = padding, width = width)
  
    __obj.asInstanceOf[BoxModel]
  }
}

