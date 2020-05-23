package typings.sharepoint.SP.Sharing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSharingResult extends ClientValueObject {
  def get_allowedRoles(): js.Array[Role]
  def get_currentRole(): Role
  def get_isUserKnown(): Boolean
  def get_message(): String
  def get_status(): Boolean
  def get_user(): String
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
}

