package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusFinalizeBlockRequest extends StObject {
  
  /** ConsensusFinalizeBlockRequest data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IConsensusFinalizeBlockRequest {
  
  @scala.inline
  def apply(): IConsensusFinalizeBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFinalizeBlockRequest]
  }
  
  @scala.inline
  implicit class IConsensusFinalizeBlockRequestMutableBuilder[Self <: IConsensusFinalizeBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
