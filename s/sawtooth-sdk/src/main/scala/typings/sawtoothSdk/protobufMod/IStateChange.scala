package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.StateChange.Type
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateChange extends StObject {
  
  /** StateChange address */
  var address: js.UndefOr[String | Null] = js.native
  
  /** StateChange type */
  var `type`: js.UndefOr[Type | Null] = js.native
  
  /** StateChange value */
  var value: js.UndefOr[Uint8Array | Null] = js.native
}
object IStateChange {
  
  @scala.inline
  def apply(): IStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChange]
  }
  
  @scala.inline
  implicit class IStateChangeMutableBuilder[Self <: IStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
