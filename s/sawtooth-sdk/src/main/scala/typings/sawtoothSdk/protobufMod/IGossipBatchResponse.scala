package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBatchResponse extends StObject {
  
  /** GossipBatchResponse content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IGossipBatchResponse {
  
  inline def apply(): IGossipBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchResponse]
  }
  
  extension [Self <: IGossipBatchResponse](x: Self) {
    
    inline def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
