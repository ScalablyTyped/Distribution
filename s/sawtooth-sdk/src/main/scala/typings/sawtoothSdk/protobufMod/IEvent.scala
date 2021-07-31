package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent extends StObject {
  
  /** Event attributes */
  var attributes: js.UndefOr[js.Array[IAttribute] | Null] = js.undefined
  
  /** Event data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** Event eventType */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object IEvent {
  
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[IAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: IAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
