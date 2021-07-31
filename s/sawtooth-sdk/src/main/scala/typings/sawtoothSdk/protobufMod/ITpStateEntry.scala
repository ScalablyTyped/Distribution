package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateEntry extends StObject {
  
  /** TpStateEntry address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** TpStateEntry data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}
object ITpStateEntry {
  
  @scala.inline
  def apply(): ITpStateEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateEntry]
  }
  
  @scala.inline
  implicit class ITpStateEntryMutableBuilder[Self <: ITpStateEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
