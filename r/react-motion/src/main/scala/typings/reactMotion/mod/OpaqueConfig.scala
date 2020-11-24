package typings.reactMotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueConfig extends js.Object {
  
  var damping: Double = js.native
  
  var precision: Double = js.native
  
  var stiffness: Double = js.native
  
  var `val`: Double = js.native
}
object OpaqueConfig {
  
  @scala.inline
  def apply(damping: Double, precision: Double, stiffness: Double, `val`: Double): OpaqueConfig = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueConfig]
  }
  
  @scala.inline
  implicit class OpaqueConfigOps[Self <: OpaqueConfig] (val x: Self) extends AnyVal {
    
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: Double): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
