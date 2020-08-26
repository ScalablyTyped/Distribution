package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterHandle
  extends typings.sharepoint.SP.JsGrid.IStyleType {
  var backgroundColor: js.Any = js.native
  var gripLowerColor: js.Any = js.native
  var gripUpperColor: js.Any = js.native
  var innerBorderColor: js.Any = js.native
  var leftInnerBorderColor: js.Any = js.native
  var outerBorderColor: js.Any = js.native
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
  @scala.inline
  implicit class SplitterHandleOps[Self <: SplitterHandle] (val x: Self) extends AnyVal {
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
    def setGripLowerColor(value: js.Any): Self = this.set("gripLowerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setGripUpperColor(value: js.Any): Self = this.set("gripUpperColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerBorderColor(value: js.Any): Self = this.set("innerBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftInnerBorderColor(value: js.Any): Self = this.set("leftInnerBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterBorderColor(value: js.Any): Self = this.set("outerBorderColor", value.asInstanceOf[js.Any])
  }
  
}

