package typings.royalslider.RoyalSlider

import typings.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoyalSliderThumbsOptions extends js.Object {
  
  /**
    * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
    */
  var appendSpan: js.UndefOr[Boolean] = js.native
  
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowLeft: js.UndefOr[JQuery] = js.native
  
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowRight: js.UndefOr[JQuery] = js.native
  
  /**
    * Thumbnails arrows. (default: true)
    */
  var arrows: js.UndefOr[Boolean] = js.native
  
  /**
    * Auto hide thumbnails arrows on hover. (default: false)
    */
  var arrowsAutoHide: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically centers container with thumbs if there are small number of items (default: true)
    */
  var autoCenter: js.UndefOr[Boolean] = js.native
  
  /**
    * Thumbnails mouse drag. (default: true)
    */
  var drag: js.UndefOr[Boolean] = js.native
  
  /**
    * Margin that equals thumbs spacing for first and last item. (default: true)
    */
  var firstMargin: js.UndefOr[Boolean] = js.native
  
  /**
    * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
    */
  var fitInViewport: js.UndefOr[Boolean] = js.native
  
  /**
    * 'horizontal' or 'vertical'. (default: 'horizontal')
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * Spacing between thumbs. (default: 4)
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * Thumbnails touch. (default: true)
    */
  var touch: js.UndefOr[Boolean] = js.native
  
  /**
    * Thumbnails transition speed. (default: 600)
    */
  var transitionSpeed: js.UndefOr[Double] = js.native
}
object RoyalSliderThumbsOptions {
  
  @scala.inline
  def apply(): RoyalSliderThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderThumbsOptions]
  }
  
  @scala.inline
  implicit class RoyalSliderThumbsOptionsOps[Self <: RoyalSliderThumbsOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendSpan(value: Boolean): Self = this.set("appendSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendSpan: Self = this.set("appendSpan", js.undefined)
    
    @scala.inline
    def setArrowLeft(value: JQuery): Self = this.set("arrowLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowLeft: Self = this.set("arrowLeft", js.undefined)
    
    @scala.inline
    def setArrowRight(value: JQuery): Self = this.set("arrowRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowRight: Self = this.set("arrowRight", js.undefined)
    
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    
    @scala.inline
    def setArrowsAutoHide(value: Boolean): Self = this.set("arrowsAutoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowsAutoHide: Self = this.set("arrowsAutoHide", js.undefined)
    
    @scala.inline
    def setAutoCenter(value: Boolean): Self = this.set("autoCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCenter: Self = this.set("autoCenter", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setFirstMargin(value: Boolean): Self = this.set("firstMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstMargin: Self = this.set("firstMargin", js.undefined)
    
    @scala.inline
    def setFitInViewport(value: Boolean): Self = this.set("fitInViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitInViewport: Self = this.set("fitInViewport", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
  }
}
