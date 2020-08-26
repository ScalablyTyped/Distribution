package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell
  extends typings.sharepoint.SP.JsGrid.IStyleType {
  /** -> CSS background-color */
  var backgroundColor: js.Any = js.native
  /** -> CSS font-family */
  var font: js.Any = js.native
  /** -> CSS font-size */
  var fontSize: js.Any = js.native
  /** -> CSS font-style */
  var fontStyle: js.Any = js.native
  /** -> CSS font-weight */
  var fontWeight: js.Any = js.native
  /** -> CSS text-align */
  var textAlign: js.Any = js.native
  /** -> CSS color */
  var textColor: js.Any = js.native
}

object Cell {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    font: js.Any,
    fontSize: js.Any,
    fontStyle: js.Any,
    fontWeight: js.Any,
    textAlign: js.Any,
    textColor: js.Any
  ): Cell = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: js.Any): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: js.Any): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: js.Any): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: js.Any): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: js.Any): Self = this.set("textColor", value.asInstanceOf[js.Any])
  }
  
}

