package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.FieldUserValue")
@js.native
class FieldUserValue ()
  extends StObject
     with typings.sharepoint.SP.FieldUserValue {
  
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
object FieldUserValue {
  
  @JSGlobal("SP.FieldUserValue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromUser(userName: String): typings.sharepoint.SP.FieldUserValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUser")(userName.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.FieldUserValue]
}
