package typings.scriptableIos.Contact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumbers extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var localizedLabel: js.UndefOr[String] = js.native
  var value: String = js.native
}

object PhoneNumbers {
  @scala.inline
  def apply(value: String): PhoneNumbers = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumbers]
  }
  @scala.inline
  implicit class PhoneNumbersOps[Self <: PhoneNumbers] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLocalizedLabel(value: String): Self = this.set("localizedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedLabel: Self = this.set("localizedLabel", js.undefined)
  }
  
}

