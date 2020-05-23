package typings.sharepoint.SP.Sharing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRoleAssignment extends ClientValueObject {
  def get_role(): Role
  def get_userId(): String
  def set_role(value: Role): Unit
  def set_userId(value: String): Unit
}

object UserRoleAssignment {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_role: () => Role,
    get_typeId: () => String,
    get_userId: () => String,
    set_role: Role => Unit,
    set_userId: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserRoleAssignment = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_role = js.Any.fromFunction0(get_role), get_typeId = js.Any.fromFunction0(get_typeId), get_userId = js.Any.fromFunction0(get_userId), set_role = js.Any.fromFunction1(set_role), set_userId = js.Any.fromFunction1(set_userId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserRoleAssignment]
  }
}

