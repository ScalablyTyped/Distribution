package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoyalSliderDeeplinkingOptions extends js.Object {
  
  /**
    * Automatically change URL after transition and listen for hash change. (default: false)
    */
  var change: js.UndefOr[Boolean] = js.native
  
  /**
    * Linking to slides by appending #SLIDE_INDEX to url.Slides count starts from 1. If change is set to false hash is only read once, after page load. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefix that will be added to hash. For example if you set it to 'gallery-', hash would look like this: #gallery-5 (default: '')
    */
  var prefix: js.UndefOr[String] = js.native
}
object RoyalSliderDeeplinkingOptions {
  
  @scala.inline
  def apply(): RoyalSliderDeeplinkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderDeeplinkingOptions]
  }
  
  @scala.inline
  implicit class RoyalSliderDeeplinkingOptionsOps[Self <: RoyalSliderDeeplinkingOptions] (val x: Self) extends AnyVal {
    
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
    def setChange(value: Boolean): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
