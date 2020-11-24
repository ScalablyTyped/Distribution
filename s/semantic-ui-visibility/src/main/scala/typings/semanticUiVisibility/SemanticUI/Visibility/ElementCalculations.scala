package typings.semanticUiVisibility.SemanticUI.Visibility

import typings.jquery.JQueryCoordinates
import typings.semanticUiVisibility.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCalculations extends ElementPosition {
  
  var bottom: Double = js.native
  
  var bottomPassed: Boolean = js.native
  
  var bottomVisible: Boolean = js.native
  
  var margin: js.UndefOr[Bottom] = js.native
  
  var offScreen: Boolean = js.native
  
  var onScreen: Boolean = js.native
  
  var passing: Boolean = js.native
  
  var percentagePassed: Double = js.native
  
  var pixelsPassed: Double = js.native
  
  var top: Double = js.native
  
  var topPassed: Boolean = js.native
  
  var topVisible: Boolean = js.native
}
object ElementCalculations {
  
  @scala.inline
  def apply(
    bottom: Double,
    bottomPassed: Boolean,
    bottomVisible: Boolean,
    fits: Boolean,
    height: Double,
    offScreen: Boolean,
    offset: JQueryCoordinates,
    onScreen: Boolean,
    passing: Boolean,
    percentagePassed: Double,
    pixelsPassed: Double,
    top: Double,
    topPassed: Boolean,
    topVisible: Boolean,
    width: Double
  ): ElementCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCalculations]
  }
  
  @scala.inline
  implicit class ElementCalculationsOps[Self <: ElementCalculations] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPassed(value: Boolean): Self = this.set("bottomPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomVisible(value: Boolean): Self = this.set("bottomVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffScreen(value: Boolean): Self = this.set("offScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreen(value: Boolean): Self = this.set("onScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassing(value: Boolean): Self = this.set("passing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentagePassed(value: Double): Self = this.set("percentagePassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsPassed(value: Double): Self = this.set("pixelsPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPassed(value: Boolean): Self = this.set("topPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopVisible(value: Boolean): Self = this.set("topVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
}
