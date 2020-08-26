package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var backgroundColor: js.Any = js.native
  var elementClickBorderColor: js.Any = js.native
  var elementClickColor: js.Any = js.native
  var eyeBrowBorderColor: js.Any = js.native
  var eyeBrowColor: js.Any = js.native
  var eyeBrowHoverBorderColor: js.Any = js.native
  var eyeBrowHoverColor: js.Any = js.native
  var font: js.Any = js.native
  var fontSize: js.Any = js.native
  var fontWeight: js.Any = js.native
  var innerBorderColor: js.Any = js.native
  var menuBorderColor: js.Any = js.native
  var menuColor: js.Any = js.native
  var menuHoverBorderColor: js.Any = js.native
  var menuHoverColor: js.Any = js.native
  var outerBorderColor: js.Any = js.native
  var resizeBorderColor: js.Any = js.native
  var resizeColor: js.Any = js.native
  var resizeHoverBorderColor: js.Any = js.native
  var resizeHoverColor: js.Any = js.native
  var textColor: js.Any = js.native
}

object Header {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    elementClickBorderColor: js.Any,
    elementClickColor: js.Any,
    eyeBrowBorderColor: js.Any,
    eyeBrowColor: js.Any,
    eyeBrowHoverBorderColor: js.Any,
    eyeBrowHoverColor: js.Any,
    font: js.Any,
    fontSize: js.Any,
    fontWeight: js.Any,
    innerBorderColor: js.Any,
    menuBorderColor: js.Any,
    menuColor: js.Any,
    menuHoverBorderColor: js.Any,
    menuHoverColor: js.Any,
    outerBorderColor: js.Any,
    resizeBorderColor: js.Any,
    resizeColor: js.Any,
    resizeHoverBorderColor: js.Any,
    resizeHoverColor: js.Any,
    textColor: js.Any
  ): Header = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], elementClickBorderColor = elementClickBorderColor.asInstanceOf[js.Any], elementClickColor = elementClickColor.asInstanceOf[js.Any], eyeBrowBorderColor = eyeBrowBorderColor.asInstanceOf[js.Any], eyeBrowColor = eyeBrowColor.asInstanceOf[js.Any], eyeBrowHoverBorderColor = eyeBrowHoverBorderColor.asInstanceOf[js.Any], eyeBrowHoverColor = eyeBrowHoverColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], menuBorderColor = menuBorderColor.asInstanceOf[js.Any], menuColor = menuColor.asInstanceOf[js.Any], menuHoverBorderColor = menuHoverBorderColor.asInstanceOf[js.Any], menuHoverColor = menuHoverColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], resizeBorderColor = resizeBorderColor.asInstanceOf[js.Any], resizeColor = resizeColor.asInstanceOf[js.Any], resizeHoverBorderColor = resizeHoverBorderColor.asInstanceOf[js.Any], resizeHoverColor = resizeHoverColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
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
    def setElementClickBorderColor(value: js.Any): Self = this.set("elementClickBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementClickColor(value: js.Any): Self = this.set("elementClickColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEyeBrowBorderColor(value: js.Any): Self = this.set("eyeBrowBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEyeBrowColor(value: js.Any): Self = this.set("eyeBrowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEyeBrowHoverBorderColor(value: js.Any): Self = this.set("eyeBrowHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEyeBrowHoverColor(value: js.Any): Self = this.set("eyeBrowHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: js.Any): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: js.Any): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerBorderColor(value: js.Any): Self = this.set("innerBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuBorderColor(value: js.Any): Self = this.set("menuBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuColor(value: js.Any): Self = this.set("menuColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuHoverBorderColor(value: js.Any): Self = this.set("menuHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuHoverColor(value: js.Any): Self = this.set("menuHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterBorderColor(value: js.Any): Self = this.set("outerBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeBorderColor(value: js.Any): Self = this.set("resizeBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeColor(value: js.Any): Self = this.set("resizeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeHoverBorderColor(value: js.Any): Self = this.set("resizeHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeHoverColor(value: js.Any): Self = this.set("resizeHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: js.Any): Self = this.set("textColor", value.asInstanceOf[js.Any])
  }
  
}

