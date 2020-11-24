package typings.puppeteerLottie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifskiOptions extends js.Object {
  
  /**
    * Lower quality, but faster encode
    */
  var fast: js.UndefOr[Boolean] = js.native
  
  /**
    * Resize to max this height if width is set. Note that aspect ratio is not preserved.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * If true, looping is disabled
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * 1-100, but useful range is 50-100. Recommended to set to 100.
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * Resize to max this width if set
    */
  var width: js.UndefOr[Double] = js.native
}
object GifskiOptions {
  
  @scala.inline
  def apply(): GifskiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifskiOptions]
  }
  
  @scala.inline
  implicit class GifskiOptionsOps[Self <: GifskiOptions] (val x: Self) extends AnyVal {
    
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
    def setFast(value: Boolean): Self = this.set("fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFast: Self = this.set("fast", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
