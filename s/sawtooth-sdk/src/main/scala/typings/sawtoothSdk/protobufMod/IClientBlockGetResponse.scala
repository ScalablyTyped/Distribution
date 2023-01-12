package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockGetResponse extends StObject {
  
  /** ClientBlockGetResponse block */
  var block: js.UndefOr[IBlock | Null] = js.undefined
  
  /** ClientBlockGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBlockGetResponse {
  
  inline def apply(): IClientBlockGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBlockGetResponse] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: IBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
