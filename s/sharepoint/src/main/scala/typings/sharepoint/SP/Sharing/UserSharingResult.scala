package typings.sharepoint.SP.Sharing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSharingResult extends ClientValueObject {
  def get_allowedRoles(): js.Array[Role] = js.native
  def get_currentRole(): Role = js.native
  def get_isUserKnown(): Boolean = js.native
  def get_message(): String = js.native
  def get_status(): Boolean = js.native
  def get_user(): String = js.native
}

object UserSharingResult {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_allowedRoles: () => js.Array[Role],
    get_currentRole: () => Role,
    get_isUserKnown: () => Boolean,
    get_message: () => String,
    get_status: () => Boolean,
    get_typeId: () => String,
    get_user: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserSharingResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_allowedRoles = js.Any.fromFunction0(get_allowedRoles), get_currentRole = js.Any.fromFunction0(get_currentRole), get_isUserKnown = js.Any.fromFunction0(get_isUserKnown), get_message = js.Any.fromFunction0(get_message), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_user = js.Any.fromFunction0(get_user), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserSharingResult]
  }
  @scala.inline
  implicit class UserSharingResultOps[Self <: UserSharingResult] (val x: Self) extends AnyVal {
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
    def setGet_allowedRoles(value: () => js.Array[Role]): Self = this.set("get_allowedRoles", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_currentRole(value: () => Role): Self = this.set("get_currentRole", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_isUserKnown(value: () => Boolean): Self = this.set("get_isUserKnown", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_message(value: () => String): Self = this.set("get_message", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_status(value: () => Boolean): Self = this.set("get_status", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_user(value: () => String): Self = this.set("get_user", js.Any.fromFunction0(value))
  }
  
}

