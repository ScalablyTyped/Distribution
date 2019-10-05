package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowHeaderStyle extends js.Object {
  var backgroundColor: js.Any
  var innerBorderColor: js.Any
  var outerBorderColor: js.Any
}

object RowHeaderStyle {
  @scala.inline
  def apply(backgroundColor: js.Any, innerBorderColor: js.Any, outerBorderColor: js.Any): RowHeaderStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, innerBorderColor = innerBorderColor, outerBorderColor = outerBorderColor)
  
    __obj.asInstanceOf[RowHeaderStyle]
  }
}

