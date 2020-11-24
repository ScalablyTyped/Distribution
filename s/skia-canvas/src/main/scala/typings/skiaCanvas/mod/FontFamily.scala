package typings.skiaCanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFamily extends js.Object {
  
  var family: String = js.native
  
  var styles: js.Array[String] = js.native
  
  var weights: js.Array[Double] = js.native
  
  var widths: js.Array[String] = js.native
}
object FontFamily {
  
  @scala.inline
  def apply(family: String, styles: js.Array[String], weights: js.Array[Double], widths: js.Array[String]): FontFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit class FontFamilyOps[Self <: FontFamily] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightsVarargs(value: Double*): Self = this.set("weights", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: js.Array[Double]): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsVarargs(value: String*): Self = this.set("widths", js.Array(value :_*))
    
    @scala.inline
    def setWidths(value: js.Array[String]): Self = this.set("widths", value.asInstanceOf[js.Any])
  }
}
