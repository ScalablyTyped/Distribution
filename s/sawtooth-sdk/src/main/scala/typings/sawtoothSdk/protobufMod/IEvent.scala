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
  
  inline def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  
  extension [Self <: IEvent](x: Self) {
    
    inline def setAttributes(value: js.Array[IAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: IAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
