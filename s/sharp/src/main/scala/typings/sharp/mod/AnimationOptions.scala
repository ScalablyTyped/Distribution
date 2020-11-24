package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends js.Object {
  
  /** List of delays between animation frames (in milliseconds), each value between 0 and 65535. (optional) */
  var delay: js.UndefOr[js.Array[Double]] = js.native
  
  /** Number of animation iterations, a value between 0 and 65535. Use 0 for infinite animation. (optional, default 0) */
  var loop: js.UndefOr[Double] = js.native
  
  /** Page height for animated output, a value greater than 0. (optional) */
  var pageHeight: js.UndefOr[Double] = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setDelayVarargs(value: Double*): Self = this.set("delay", js.Array(value :_*))
    
    @scala.inline
    def setDelay(value: js.Array[Double]): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
  }
}
