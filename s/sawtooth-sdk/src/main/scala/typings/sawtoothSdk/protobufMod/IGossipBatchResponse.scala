package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipBatchResponse extends StObject {
  
  /** GossipBatchResponse content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
}
object IGossipBatchResponse {
  
  @scala.inline
  def apply(): IGossipBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchResponse]
  }
  
  @scala.inline
  implicit class IGossipBatchResponseMutableBuilder[Self <: IGossipBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
