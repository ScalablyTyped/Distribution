package typings.raty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryRatyRoundingOptions extends js.Object {
  
  var down: Double = js.native
  
  var full: Double = js.native
  
  var up: Double = js.native
}
object JQueryRatyRoundingOptions {
  
  @scala.inline
  def apply(down: Double, full: Double, up: Double): JQueryRatyRoundingOptions = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRatyRoundingOptions]
  }
  
  @scala.inline
  implicit class JQueryRatyRoundingOptionsOps[Self <: JQueryRatyRoundingOptions] (val x: Self) extends AnyVal {
    
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
    def setDown(value: Double): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: Double): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Double): Self = this.set("up", value.asInstanceOf[js.Any])
  }
}
