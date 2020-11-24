package typings.scryptAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var N: js.UndefOr[Double] = js.native
  
  var dkLen: Double = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var interruptStep: js.UndefOr[Double] = js.native
  
  var logN: js.UndefOr[Double] = js.native
  
  var p: Double = js.native
  
  var r: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(dkLen: Double, p: Double, r: Double): Options = {
    val __obj = js.Dynamic.literal(dkLen = dkLen.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDkLen(value: Double): Self = this.set("dkLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = this.set("N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setInterruptStep(value: Double): Self = this.set("interruptStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterruptStep: Self = this.set("interruptStep", js.undefined)
    
    @scala.inline
    def setLogN(value: Double): Self = this.set("logN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogN: Self = this.set("logN", js.undefined)
  }
}
