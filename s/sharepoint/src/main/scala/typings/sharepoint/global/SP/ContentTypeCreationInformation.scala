package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ContentTypeCreationInformation")
@js.native
class ContentTypeCreationInformation ()
  extends typings.sharepoint.SP.ContentTypeCreationInformation {
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
  override def get_description(): String = js.native
  /* CompleteClass */
  override def get_group(): String = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_parentContentType(): typings.sharepoint.SP.ContentType = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_description(value: String): Unit = js.native
  /* CompleteClass */
  override def set_group(value: String): Unit = js.native
  /* CompleteClass */
  override def set_name(value: String): Unit = js.native
  /* CompleteClass */
  override def set_parentContentType(value: typings.sharepoint.SP.ContentType): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

