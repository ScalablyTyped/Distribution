package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.StateChange.Type
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateChange extends StObject {
  
  /** StateChange address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** StateChange type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
  
  /** StateChange value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IStateChange {
  
  inline def apply(): IStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChange]
  }
  
  extension [Self <: IStateChange](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
