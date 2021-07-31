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
  
  @scala.inline
  def apply(): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockResponse]
  }
  
  @scala.inline
  implicit class IGossipBlockResponseMutableBuilder[Self <: IGossipBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
