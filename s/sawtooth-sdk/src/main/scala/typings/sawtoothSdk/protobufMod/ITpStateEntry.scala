package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateEntry extends js.Object {
  
  /** TpStateEntry address */
  var address: js.UndefOr[String | Null] = js.native
  
  /** TpStateEntry data */
  var data: js.UndefOr[Uint8Array | Null] = js.native
}
object ITpStateEntry {
  
  @scala.inline
  def apply(): ITpStateEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateEntry]
  }
  
  @scala.inline
  implicit class ITpStateEntryOps[Self <: ITpStateEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
}
