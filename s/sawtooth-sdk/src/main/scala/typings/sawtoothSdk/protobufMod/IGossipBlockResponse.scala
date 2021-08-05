package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBlockResponse extends StObject {
  
  /** GossipBlockResponse content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IGossipBlockResponse {
  
  inline def apply(): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockResponse]
  }
  
  extension [Self <: IGossipBlockResponse](x: Self) {
    
    inline def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
