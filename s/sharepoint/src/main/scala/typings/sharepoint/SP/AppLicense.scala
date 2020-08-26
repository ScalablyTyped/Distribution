package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLicense extends ClientValueObject {
  def get_rawXMLLicenseToken(): String = js.native
}

object AppLicense {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_rawXMLLicenseToken: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AppLicense = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_rawXMLLicenseToken = js.Any.fromFunction0(get_rawXMLLicenseToken), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AppLicense]
  }
  @scala.inline
  implicit class AppLicenseOps[Self <: AppLicense] (val x: Self) extends AnyVal {
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
    def setGet_rawXMLLicenseToken(value: () => String): Self = this.set("get_rawXMLLicenseToken", js.Any.fromFunction0(value))
  }
  
}

