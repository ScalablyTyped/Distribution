package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdInfo extends ClientValueObject {
  def get_nameId(): String = js.native
  def get_nameIdIssuer(): String = js.native
}

object UserIdInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_nameId: () => String,
    get_nameIdIssuer: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserIdInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_nameId = js.Any.fromFunction0(get_nameId), get_nameIdIssuer = js.Any.fromFunction0(get_nameIdIssuer), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserIdInfo]
  }
  @scala.inline
  implicit class UserIdInfoOps[Self <: UserIdInfo] (val x: Self) extends AnyVal {
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
    def setGet_nameId(value: () => String): Self = this.set("get_nameId", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_nameIdIssuer(value: () => String): Self = this.set("get_nameIdIssuer", js.Any.fromFunction0(value))
  }
  
}

