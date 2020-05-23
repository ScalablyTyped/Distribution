package typings.sharepoint.global.SP.Taxonomy

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
@js.native
class TaxonomyFieldValue ()
  extends typings.sharepoint.SP.Taxonomy.TaxonomyFieldValue {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_label(): String = js.native
  /* CompleteClass */
  override def get_termGuid(): Guid = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def get_wssId(): Double = js.native
  /* CompleteClass */
  override def set_label(value: String): Unit = js.native
  /* CompleteClass */
  override def set_termGuid(value: Guid): Unit = js.native
  /* CompleteClass */
  override def set_wssId(value: Double): Unit = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

