package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpOptions
  extends OutputOptions
     with AnimationOptions {
  
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[Double] = js.native
  
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.native
  
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[Boolean] = js.native
  
  /** Level of CPU effort to reduce file size, integer 0-6 (optional, default 4) */
  var reductionEffort: js.UndefOr[Double] = js.native
  
  /** Use high quality chroma subsampling (optional, default false) */
  var smartSubsample: js.UndefOr[Boolean] = js.native
}
object WebpOptions {
  
  @scala.inline
  def apply(): WebpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpOptions]
  }
  
  @scala.inline
  implicit class WebpOptionsOps[Self <: WebpOptions] (val x: Self) extends AnyVal {
    
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
    def setAlphaQuality(value: Double): Self = this.set("alphaQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaQuality: Self = this.set("alphaQuality", js.undefined)
    
    @scala.inline
    def setLossless(value: Boolean): Self = this.set("lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossless: Self = this.set("lossless", js.undefined)
    
    @scala.inline
    def setNearLossless(value: Boolean): Self = this.set("nearLossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearLossless: Self = this.set("nearLossless", js.undefined)
    
    @scala.inline
    def setReductionEffort(value: Double): Self = this.set("reductionEffort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReductionEffort: Self = this.set("reductionEffort", js.undefined)
    
    @scala.inline
    def setSmartSubsample(value: Boolean): Self = this.set("smartSubsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartSubsample: Self = this.set("smartSubsample", js.undefined)
  }
}
