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
    val __obj = js.Dynamic.literal(dialCode = dialCode, image = image, iso2 = iso2, key = key, label = label)
  
    __obj.asInstanceOf[PickerData]
  }
}

