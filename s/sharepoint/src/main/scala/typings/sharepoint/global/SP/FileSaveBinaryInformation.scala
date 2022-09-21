package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.FileSaveBinaryInformation")
@js.native
open class FileSaveBinaryInformation ()
  extends StObject
     with typings.sharepoint.SP.FileSaveBinaryInformation {
  
  /* CompleteClass */
  override def customFromJson(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  override def customWriteToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(obj: Any): Unit = js.native
  
  /* CompleteClass */
  override def get_checkRequiredFields(): Boolean = js.native
  
  /* CompleteClass */
  override def get_content(): typings.sharepoint.SP.Base64EncodedByteArray = js.native
  
  /* CompleteClass */
  override def get_eTag(): String = js.native
  
  /* CompleteClass */
  override def get_fieldValues(): Any = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def set_checkRequiredFields(value: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def set_content(value: typings.sharepoint.SP.Base64EncodedByteArray): Unit = js.native
  
  /* CompleteClass */
  override def set_eTag(value: String): Unit = js.native
  
  /* CompleteClass */
  override def set_fieldValues(value: Any): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
