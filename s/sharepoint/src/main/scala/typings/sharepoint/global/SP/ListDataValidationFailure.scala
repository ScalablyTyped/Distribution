package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListDataValidationFailure")
@js.native
class ListDataValidationFailure ()
  extends typings.sharepoint.SP.ListDataValidationFailure {
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
  override def get_displayName(): String = js.native
  /* CompleteClass */
  override def get_message(): String = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_reason(): typings.sharepoint.SP.ListDataValidationFailureReason = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def get_validationType(): typings.sharepoint.SP.ListDataValidationType = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

