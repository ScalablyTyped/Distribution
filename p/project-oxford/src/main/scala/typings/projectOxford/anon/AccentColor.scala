package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccentColor extends js.Object {
  
  var accentColor: String = js.native
  
  var dominantColorBackground: String = js.native
  
  var dominantColorForeground: String = js.native
  
  var dominantColors: js.Array[String] = js.native
  
  var isBWImg: Boolean = js.native
}
object AccentColor {
  
  @scala.inline
  def apply(
    accentColor: String,
    dominantColorBackground: String,
    dominantColorForeground: String,
    dominantColors: js.Array[String],
    isBWImg: Boolean
  ): AccentColor = {
    val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], dominantColorBackground = dominantColorBackground.asInstanceOf[js.Any], dominantColorForeground = dominantColorForeground.asInstanceOf[js.Any], dominantColors = dominantColors.asInstanceOf[js.Any], isBWImg = isBWImg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentColor]
  }
  
  @scala.inline
  implicit class AccentColorOps[Self <: AccentColor] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorBackground(value: String): Self = this.set("dominantColorBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorForeground(value: String): Self = this.set("dominantColorForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorsVarargs(value: String*): Self = this.set("dominantColors", js.Array(value :_*))
    
    @scala.inline
    def setDominantColors(value: js.Array[String]): Self = this.set("dominantColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBWImg(value: Boolean): Self = this.set("isBWImg", value.asInstanceOf[js.Any])
  }
}
