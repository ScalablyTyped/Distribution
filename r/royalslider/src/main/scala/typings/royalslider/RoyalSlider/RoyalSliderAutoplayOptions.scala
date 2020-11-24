package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoyalSliderAutoplayOptions extends js.Object {
  
  /**
    * Delay between items in ms. (default: 300)
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Enable autoplay or not. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Pause autoplay on hover. (default: true)
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Stop autoplay at first user action. (default: true)
    */
  var stopAtAction: js.UndefOr[Boolean] = js.native
}
object RoyalSliderAutoplayOptions {
  
  @scala.inline
  def apply(): RoyalSliderAutoplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderAutoplayOptions]
  }
  
  @scala.inline
  implicit class RoyalSliderAutoplayOptionsOps[Self <: RoyalSliderAutoplayOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    
    @scala.inline
    def setStopAtAction(value: Boolean): Self = this.set("stopAtAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopAtAction: Self = this.set("stopAtAction", js.undefined)
  }
}
