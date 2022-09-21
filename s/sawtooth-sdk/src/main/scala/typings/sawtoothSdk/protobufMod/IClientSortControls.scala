package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientSortControls extends StObject {
  
  /** ClientSortControls keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientSortControls reverse */
  var reverse: js.UndefOr[Boolean | Null] = js.undefined
}
object IClientSortControls {
  
  inline def apply(): IClientSortControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientSortControls]
  }
  
  extension [Self <: IClientSortControls](x: Self) {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseNull: Self = StObject.set(x, "reverse", null)
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
