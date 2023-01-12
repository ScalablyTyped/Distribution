package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBlockResponse extends StObject {
  
  /** GossipBlockResponse content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IGossipBlockResponse {
  
  inline def apply(): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGossipBlockResponse] (val x: Self) extends AnyVal {
    
    inline def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
