package typings.ssimJs.anon

import typings.ssimJs.typesMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mssim extends js.Object {
  
  var mssim: Double = js.native
  
  var performance: Double = js.native
  
  var ssim_map: Matrix = js.native
}
object Mssim {
  
  @scala.inline
  def apply(mssim: Double, performance: Double, ssim_map: Matrix): Mssim = {
    val __obj = js.Dynamic.literal(mssim = mssim.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], ssim_map = ssim_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mssim]
  }
  
  @scala.inline
  implicit class MssimOps[Self <: Mssim] (val x: Self) extends AnyVal {
    
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
    def setMssim(value: Double): Self = this.set("mssim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance(value: Double): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsim_map(value: Matrix): Self = this.set("ssim_map", value.asInstanceOf[js.Any])
  }
}
