package typings.securePassword.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memlimit extends js.Object {
  
  var memlimit: js.UndefOr[Double] = js.native
  
  var opslimit: js.UndefOr[Double] = js.native
}
object Memlimit {
  
  @scala.inline
  def apply(): Memlimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Memlimit]
  }
  
  @scala.inline
  implicit class MemlimitOps[Self <: Memlimit] (val x: Self) extends AnyVal {
    
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
    def setMemlimit(value: Double): Self = this.set("memlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemlimit: Self = this.set("memlimit", js.undefined)
    
    @scala.inline
    def setOpslimit(value: Double): Self = this.set("opslimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpslimit: Self = this.set("opslimit", js.undefined)
  }
}
