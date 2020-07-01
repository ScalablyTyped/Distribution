package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSettings extends js.Object {
  var emulatedFormFactor: String
  var locale: String
  var onlyCategories: js.Object
}

object ConfigSettings {
  @scala.inline
  def apply(emulatedFormFactor: String, locale: String, onlyCategories: js.Object): ConfigSettings = {
    val __obj = js.Dynamic.literal(emulatedFormFactor = emulatedFormFactor.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onlyCategories = onlyCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSettings]
  }
}

