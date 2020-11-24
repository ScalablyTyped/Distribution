package typings.rascal.anon

import typings.rascal.mod.ChannelPoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmPool extends js.Object {
  
  var confirmPool: js.UndefOr[ChannelPoolConfig] = js.native
  
  var regularPool: js.UndefOr[ChannelPoolConfig] = js.native
}
object ConfirmPool {
  
  @scala.inline
  def apply(): ConfirmPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPool]
  }
  
  @scala.inline
  implicit class ConfirmPoolOps[Self <: ConfirmPool] (val x: Self) extends AnyVal {
    
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
    def setConfirmPool(value: ChannelPoolConfig): Self = this.set("confirmPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmPool: Self = this.set("confirmPool", js.undefined)
    
    @scala.inline
    def setRegularPool(value: ChannelPoolConfig): Self = this.set("regularPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegularPool: Self = this.set("regularPool", js.undefined)
  }
}
