package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusFinalizeBlockRequest extends StObject {
  
  /** ConsensusFinalizeBlockRequest data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusFinalizeBlockRequest {
  
  inline def apply(): IConsensusFinalizeBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFinalizeBlockRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusFinalizeBlockRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
