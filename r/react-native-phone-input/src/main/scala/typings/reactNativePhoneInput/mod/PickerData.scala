package typings.reactNativePhoneInput.mod

import typings.reactNative.mod.ImageRequireSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerData extends js.Object {
  var dialCode: String = js.native
  var image: ImageRequireSource = js.native
  var iso2: String = js.native
  var key: Double = js.native
  var label: String = js.native
}

object PickerData {
  @scala.inline
  def apply(dialCode: String, image: ImageRequireSource, iso2: String, key: Double, label: String): PickerData = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerData]
  }
  @scala.inline
  implicit class PickerDataOps[Self <: PickerData] (val x: Self) extends AnyVal {
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
    def setDialCode(value: String): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: ImageRequireSource): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

