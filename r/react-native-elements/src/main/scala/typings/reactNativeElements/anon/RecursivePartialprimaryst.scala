package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}> */
@js.native
trait RecursivePartialprimaryst extends js.Object {
  var error: js.UndefOr[RecursivePartial[String]] = js.native
  var primary: js.UndefOr[RecursivePartial[String]] = js.native
  var secondary: js.UndefOr[RecursivePartial[String]] = js.native
  var success: js.UndefOr[RecursivePartial[String]] = js.native
  var warning: js.UndefOr[RecursivePartial[String]] = js.native
}

object RecursivePartialprimaryst {
  @scala.inline
  def apply(): RecursivePartialprimaryst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialprimaryst]
  }
  @scala.inline
  implicit class RecursivePartialprimarystOps[Self <: RecursivePartialprimaryst] (val x: Self) extends AnyVal {
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
    def setError(value: RecursivePartial[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setPrimary(value: RecursivePartial[String]): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSecondary(value: RecursivePartial[String]): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSuccess(value: RecursivePartial[String]): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWarning(value: RecursivePartial[String]): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

