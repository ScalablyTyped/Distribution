package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KH extends js.Object {
  
  var KH: Capacity = js.native
  
  var KH2O: `8` = js.native
  
  var XKH2O: `9` = js.native
}
object KH {
  
  @scala.inline
  def apply(KH: Capacity, KH2O: `8`, XKH2O: `9`): KH = {
    val __obj = js.Dynamic.literal(KH = KH.asInstanceOf[js.Any], KH2O = KH2O.asInstanceOf[js.Any], XKH2O = XKH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[KH]
  }
  
  @scala.inline
  implicit class KHOps[Self <: KH] (val x: Self) extends AnyVal {
    
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
    def setKH(value: Capacity): Self = this.set("KH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKH2O(value: `8`): Self = this.set("KH2O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXKH2O(value: `9`): Self = this.set("XKH2O", value.asInstanceOf[js.Any])
  }
}
