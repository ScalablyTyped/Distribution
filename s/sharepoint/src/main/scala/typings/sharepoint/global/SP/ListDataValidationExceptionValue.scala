package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListDataValidationExceptionValue")
@js.native
class ListDataValidationExceptionValue ()
  extends typings.sharepoint.SP.ListDataValidationExceptionValue {
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
  override def get_fieldFailures(): js.Array[typings.sharepoint.SP.ListDataValidationFailure] = js.native
  /* CompleteClass */
  override def get_itemFailure(): typings.sharepoint.SP.ListDataValidationFailure = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

