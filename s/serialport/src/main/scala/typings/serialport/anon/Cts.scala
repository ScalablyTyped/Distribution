package typings.serialport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cts extends js.Object {
  
  var cts: Boolean = js.native
  
  var dcd: Boolean = js.native
  
  var dsr: Boolean = js.native
}
object Cts {
  
  @scala.inline
  def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): Cts = {
    val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cts]
  }
  
  @scala.inline
  implicit class CtsOps[Self <: Cts] (val x: Self) extends AnyVal {
    
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
    def setCts(value: Boolean): Self = this.set("cts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDcd(value: Boolean): Self = this.set("dcd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsr(value: Boolean): Self = this.set("dsr", value.asInstanceOf[js.Any])
  }
}
