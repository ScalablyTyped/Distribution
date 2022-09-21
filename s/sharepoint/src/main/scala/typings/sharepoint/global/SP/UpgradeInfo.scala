package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UpgradeInfo")
@js.native
open class UpgradeInfo ()
  extends StObject
     with typings.sharepoint.SP.UpgradeInfo {
  
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
  override def get_errorFile(): String = js.native
  
  /* CompleteClass */
  override def get_errors(): Double = js.native
  
  /* CompleteClass */
  override def get_lastUpdated(): js.Date = js.native
  
  /* CompleteClass */
  override def get_logFile(): String = js.native
  
  /* CompleteClass */
  override def get_requestDate(): js.Date = js.native
  
  /* CompleteClass */
  override def get_retryCount(): Double = js.native
  
  /* CompleteClass */
  override def get_startTime(): js.Date = js.native
  
  /* CompleteClass */
  override def get_status(): typings.sharepoint.SP.UpgradeStatus = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def get_upgradeType(): typings.sharepoint.SP.UpgradeType = js.native
  
  /* CompleteClass */
  override def get_warnings(): Double = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
