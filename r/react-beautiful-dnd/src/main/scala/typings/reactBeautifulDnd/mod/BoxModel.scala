package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxModel extends js.Object {
  // for your own consumption
  var border: Spacing
  // content + padding + border
  var borderBox: Rect
  // content
  var contentBox: Rect
  var margin: Spacing
  // content + padding + border + margin
  var marginBox: Rect
  var padding: Spacing
  // content + padding
  var paddingBox: Rect
}

object BoxModel {
  @scala.inline
  def apply(
    border: Spacing,
    borderBox: Rect,
    contentBox: Rect,
    margin: Spacing,
    marginBox: Rect,
    padding: Spacing,
    paddingBox: Rect
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderBox = borderBox.asInstanceOf[js.Any], contentBox = contentBox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBox = marginBox.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingBox = paddingBox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoxModel]
  }
}

