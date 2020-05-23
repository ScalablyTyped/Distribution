package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UserCreationInformation")
@js.native
class UserCreationInformation ()
  extends typings.sharepoint.SP.UserCreationInformation {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_email(): String = js.native
  /* CompleteClass */
  override def get_loginName(): String = js.native
  /* CompleteClass */
  override def get_title(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_email(value: String): Unit = js.native
  /* CompleteClass */
  override def set_loginName(value: String): Unit = js.native
  /* CompleteClass */
  override def set_title(value: String): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

