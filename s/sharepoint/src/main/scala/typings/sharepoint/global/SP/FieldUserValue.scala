package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldUserValue")
@js.native
class FieldUserValue ()
  extends typings.sharepoint.SP.FieldUserValue {
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
  override def get_lookupId(): Double = js.native
  /* CompleteClass */
  override def get_lookupValue(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_lookupId(value: Double): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

/* static members */
@JSGlobal("SP.FieldUserValue")
@js.native
object FieldUserValue extends js.Object {
  def fromUser(userName: String): typings.sharepoint.SP.FieldUserValue = js.native
}

