package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HAdjustmentFactor extends js.Object {
  
  var hAdjustmentFactor: Double = js.native
  
  var height: Double = js.native
  
  var vAdjustmentFactor: Double = js.native
  
  var width: Double = js.native
}
object HAdjustmentFactor {
  
  @scala.inline
  def apply(hAdjustmentFactor: Double, height: Double, vAdjustmentFactor: Double, width: Double): HAdjustmentFactor = {
    val __obj = js.Dynamic.literal(hAdjustmentFactor = hAdjustmentFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], vAdjustmentFactor = vAdjustmentFactor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HAdjustmentFactor]
  }
  
  @scala.inline
  implicit class HAdjustmentFactorOps[Self <: HAdjustmentFactor] (val x: Self) extends AnyVal {
    
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
    def setHAdjustmentFactor(value: Double): Self = this.set("hAdjustmentFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAdjustmentFactor(value: Double): Self = this.set("vAdjustmentFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
