package typings.reactDashNativeDashPhoneDashInput.reactDashNativeDashPhoneDashInputMod

import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerData extends js.Object {
  var dialCode: String
  var image: ImageRequireSource
  var iso2: String
  var key: Double
  var label: String
}

object PickerData {
  @scala.inline
  def apply(dialCode: String, image: ImageRequireSource, iso2: String, key: Double, label: String): PickerData = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickerData]
  }
}

