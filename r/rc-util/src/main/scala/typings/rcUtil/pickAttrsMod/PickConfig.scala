package typings.rcUtil.pickAttrsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickConfig extends js.Object {
  
  var aria: js.UndefOr[Boolean] = js.native
  
  var attr: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Boolean] = js.native
}
object PickConfig {
  
  @scala.inline
  def apply(): PickConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConfig]
  }
  
  @scala.inline
  implicit class PickConfigOps[Self <: PickConfig] (val x: Self) extends AnyVal {
    
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
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setAttr(value: Boolean): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    
    @scala.inline
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
