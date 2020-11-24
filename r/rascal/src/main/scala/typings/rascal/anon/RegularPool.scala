package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegularPool extends js.Object {
  
  var confirmPool: Autostart = js.native
  
  var regularPool: Autostart = js.native
}
object RegularPool {
  
  @scala.inline
  def apply(confirmPool: Autostart, regularPool: Autostart): RegularPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPool]
  }
  
  @scala.inline
  implicit class RegularPoolOps[Self <: RegularPool] (val x: Self) extends AnyVal {
    
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
    def setConfirmPool(value: Autostart): Self = this.set("confirmPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularPool(value: Autostart): Self = this.set("regularPool", value.asInstanceOf[js.Any])
  }
}
