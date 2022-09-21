package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateEntry extends StObject {
  
  /** TpStateEntry address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** TpStateEntry data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object ITpStateEntry {
  
  inline def apply(): ITpStateEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateEntry]
  }
  
  extension [Self <: ITpStateEntry](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
