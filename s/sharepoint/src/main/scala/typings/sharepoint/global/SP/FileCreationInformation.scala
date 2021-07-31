package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.FileCreationInformation")
@js.native
class FileCreationInformation ()
  extends StObject
     with typings.sharepoint.SP.FileCreationInformation {
  
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
  override def get_content(): typings.sharepoint.SP.Base64EncodedByteArray = js.native
  
  /* CompleteClass */
  override def get_overwrite(): Boolean = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def get_url(): String = js.native
  
  /* CompleteClass */
  override def set_content(value: typings.sharepoint.SP.Base64EncodedByteArray): Unit = js.native
  
  /* CompleteClass */
  override def set_overwrite(value: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def set_url(value: String): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
