package typings.sharepoint.SP.Utilities

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalInfo extends ClientValueObject {
  def get_department(): String
  def get_displayName(): String
  def get_email(): String
  def get_jobTitle(): String
  def get_loginName(): String
  def get_mobile(): String
  def get_principalId(): Double
  def get_principalType(): PrincipalType
  def get_sIPAddress(): String
}

object PrincipalInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_department: () => String,
    get_displayName: () => String,
    get_email: () => String,
    get_jobTitle: () => String,
    get_loginName: () => String,
    get_mobile: () => String,
    get_principalId: () => Double,
    get_principalType: () => PrincipalType,
    get_sIPAddress: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PrincipalInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_department = js.Any.fromFunction0(get_department), get_displayName = js.Any.fromFunction0(get_displayName), get_email = js.Any.fromFunction0(get_email), get_jobTitle = js.Any.fromFunction0(get_jobTitle), get_loginName = js.Any.fromFunction0(get_loginName), get_mobile = js.Any.fromFunction0(get_mobile), get_principalId = js.Any.fromFunction0(get_principalId), get_principalType = js.Any.fromFunction0(get_principalType), get_sIPAddress = js.Any.fromFunction0(get_sIPAddress), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PrincipalInfo]
  }
}

