package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasureItemsOptions extends js.Object {
  
  /**
    * This option is passed through to the imagesLoaded library.
    * It allows you to wait for background images to load, in addition to <img> tags.
    */
  var background: js.UndefOr[Boolean | String] = js.native
  
  /**
    * If set to true, waits for images to load before measuring items and adding them to the Grid.
    * This may be necessary if you don't know the height of your images ahead of time.
    * Powered by imagesLoaded.
    */
  var measureImages: Boolean = js.native
}
object MeasureItemsOptions {
  
  @scala.inline
  def apply(measureImages: Boolean): MeasureItemsOptions = {
    val __obj = js.Dynamic.literal(measureImages = measureImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureItemsOptions]
  }
  
  @scala.inline
  implicit class MeasureItemsOptionsOps[Self <: MeasureItemsOptions] (val x: Self) extends AnyVal {
    
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
    def setMeasureImages(value: Boolean): Self = this.set("measureImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: Boolean | String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
  }
}
