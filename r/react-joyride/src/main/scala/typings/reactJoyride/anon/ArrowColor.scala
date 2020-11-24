package typings.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowColor extends js.Object {
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var beaconSize: js.UndefOr[Double] = js.native
  
  var overlayColor: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var spotlightShadow: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ArrowColor {
  
  @scala.inline
  def apply(): ArrowColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowColor]
  }
  
  @scala.inline
  implicit class ArrowColorOps[Self <: ArrowColor] (val x: Self) extends AnyVal {
    
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
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBeaconSize(value: Double): Self = this.set("beaconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconSize: Self = this.set("beaconSize", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setSpotlightShadow(value: String): Self = this.set("spotlightShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotlightShadow: Self = this.set("spotlightShadow", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
