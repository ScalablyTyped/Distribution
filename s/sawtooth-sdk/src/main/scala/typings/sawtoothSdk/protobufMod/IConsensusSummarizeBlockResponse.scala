package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusSummarizeBlockResponse extends StObject {
  
  /** ConsensusSummarizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  
  /** ConsensusSummarizeBlockResponse summary */
  var summary: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusSummarizeBlockResponse {
  
  @scala.inline
  def apply(): IConsensusSummarizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSummarizeBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusSummarizeBlockResponseMutableBuilder[Self <: IConsensusSummarizeBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSummary(value: Uint8Array): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
