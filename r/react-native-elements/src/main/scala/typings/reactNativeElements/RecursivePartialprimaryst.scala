package typings.reactNativeElements

import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  primary  :string,   secondary  :string,   success  :string,   error  :string,   warning  :string}> */
trait RecursivePartialprimaryst extends js.Object {
  var error: js.UndefOr[RecursivePartial[String]] = js.undefined
  var primary: js.UndefOr[RecursivePartial[String]] = js.undefined
  var secondary: js.UndefOr[RecursivePartial[String]] = js.undefined
  var success: js.UndefOr[RecursivePartial[String]] = js.undefined
  var warning: js.UndefOr[RecursivePartial[String]] = js.undefined
}

object RecursivePartialprimaryst {
  @scala.inline
  def apply(
    error: RecursivePartial[String] = null,
    primary: RecursivePartial[String] = null,
    secondary: RecursivePartial[String] = null,
    success: RecursivePartial[String] = null,
    warning: RecursivePartial[String] = null
  ): RecursivePartialprimaryst = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialprimaryst]
  }
}

