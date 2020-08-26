package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var buttonActiveTextColor: String = js.native
  var buttonTextColor: String = js.native
  var headerTextColor: String = js.native
  var labelColor: String = js.native
  var previewBorderColor: String = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    buttonActiveTextColor: String,
    buttonTextColor: String,
    headerTextColor: String,
    labelColor: String,
    previewBorderColor: String
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], buttonActiveTextColor = buttonActiveTextColor.asInstanceOf[js.Any], buttonTextColor = buttonTextColor.asInstanceOf[js.Any], headerTextColor = headerTextColor.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], previewBorderColor = previewBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonActiveTextColor(value: String): Self = this.set("buttonActiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextColor(value: String): Self = this.set("buttonTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTextColor(value: String): Self = this.set("headerTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewBorderColor(value: String): Self = this.set("previewBorderColor", value.asInstanceOf[js.Any])
  }
  
}

