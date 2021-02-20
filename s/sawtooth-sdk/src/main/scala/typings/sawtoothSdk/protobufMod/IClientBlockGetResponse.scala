package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBlockGetResponse extends StObject {
  
  /** ClientBlockGetResponse block */
  var block: js.UndefOr[IBlock | Null] = js.native
  
  /** ClientBlockGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientBlockGetResponse {
  
  @scala.inline
  def apply(): IClientBlockGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetResponse]
  }
  
  @scala.inline
  implicit class IClientBlockGetResponseMutableBuilder[Self <: IClientBlockGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: IBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
