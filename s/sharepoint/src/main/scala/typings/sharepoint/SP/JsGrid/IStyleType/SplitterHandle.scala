package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterHandle
  extends typings.sharepoint.SP.JsGrid.IStyleType {
  var backgroundColor: js.Any
  var gripLowerColor: js.Any
  var gripUpperColor: js.Any
  var innerBorderColor: js.Any
  var leftInnerBorderColor: js.Any
  var outerBorderColor: js.Any
}

object SplitterHandle {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    gripLowerColor: js.Any,
    gripUpperColor: js.Any,
    innerBorderColor: js.Any,
    leftInnerBorderColor: js.Any,
    outerBorderColor: js.Any
  ): SplitterHandle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], gripLowerColor = gripLowerColor.asInstanceOf[js.Any], gripUpperColor = gripUpperColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterHandle]
  }
}

