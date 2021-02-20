package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBlockGetByIdRequest extends StObject {
  
  /** ClientBlockGetByIdRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.native
}
object IClientBlockGetByIdRequest {
  
  @scala.inline
  def apply(): IClientBlockGetByIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByIdRequest]
  }
  
  @scala.inline
  implicit class IClientBlockGetByIdRequestMutableBuilder[Self <: IClientBlockGetByIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: String): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
