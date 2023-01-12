package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSummarizeBlockResponse extends StObject {
  
  /** ConsensusSummarizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  
  /** ConsensusSummarizeBlockResponse summary */
  var summary: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusSummarizeBlockResponse {
  
  inline def apply(): IConsensusSummarizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSummarizeBlockResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusSummarizeBlockResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: js.typedarray.Uint8Array): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
