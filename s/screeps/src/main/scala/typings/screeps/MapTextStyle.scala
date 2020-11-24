package typings.screeps

import typings.screeps.screepsStrings.center
import typings.screeps.screepsStrings.left
import typings.screeps.screepsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTextStyle extends js.Object {
  
  /**
    * Text align, either center, left, or right. Default is center.
    */
  var align: js.UndefOr[center | left | right] = js.native
  
  /**
    * Background color in the following format: #ffffff (hex triplet). Default is undefined (no background). When background is enabled, text vertical align is set to middle (default is baseline).
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Background rectangle padding, default is 2.
    */
  var backgroundPadding: js.UndefOr[Double] = js.native
  
  /**
    * Font color in the following format: #ffffff (hex triplet). Default is #ffffff.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * The font family, default is sans-serif
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * The font size in game coordinates, default is 10
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * The font style ('normal', 'italic' or 'oblique')
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * The font variant ('normal' or 'small-caps')
    */
  var fontVariant: js.UndefOr[String] = js.native
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Stroke color in the following format: #ffffff (hex triplet). Default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.native
  
  /**
    * Stroke width, default is 0.15.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}
object MapTextStyle {
  
  @scala.inline
  def apply(): MapTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTextStyle]
  }
  
  @scala.inline
  implicit class MapTextStyleOps[Self <: MapTextStyle] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: center | left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Double): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPadding: Self = this.set("backgroundPadding", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
