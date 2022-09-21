package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.TimeZoneInformation")
@js.native
open class TimeZoneInformation ()
  extends StObject
     with typings.sharepoint.SP.TimeZoneInformation {
  
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
  override def get_bias(): Double = js.native
  
  /* CompleteClass */
  override def get_daylightBias(): Double = js.native
  
  /* CompleteClass */
  override def get_standardBias(): Double = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
