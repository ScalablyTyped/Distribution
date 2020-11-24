package typings.shevyjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontScalePresets extends js.Object {
  
  var augmentedFourth: Scale = js.native
  
  var majorSecond: Scale = js.native
  
  var majorThird: Scale = js.native
  
  var minorThird: Scale = js.native
  
  var perfectFourth: Scale = js.native
}
object FontScalePresets {
  
  @scala.inline
  def apply(
    augmentedFourth: Scale,
    majorSecond: Scale,
    majorThird: Scale,
    minorThird: Scale,
    perfectFourth: Scale
  ): FontScalePresets = {
    val __obj = js.Dynamic.literal(augmentedFourth = augmentedFourth.asInstanceOf[js.Any], majorSecond = majorSecond.asInstanceOf[js.Any], majorThird = majorThird.asInstanceOf[js.Any], minorThird = minorThird.asInstanceOf[js.Any], perfectFourth = perfectFourth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontScalePresets]
  }
  
  @scala.inline
  implicit class FontScalePresetsOps[Self <: FontScalePresets] (val x: Self) extends AnyVal {
    
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
    def setAugmentedFourthVarargs(value: Factor*): Self = this.set("augmentedFourth", js.Array(value :_*))
    
    @scala.inline
    def setAugmentedFourth(value: Scale): Self = this.set("augmentedFourth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorSecondVarargs(value: Factor*): Self = this.set("majorSecond", js.Array(value :_*))
    
    @scala.inline
    def setMajorSecond(value: Scale): Self = this.set("majorSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorThirdVarargs(value: Factor*): Self = this.set("majorThird", js.Array(value :_*))
    
    @scala.inline
    def setMajorThird(value: Scale): Self = this.set("majorThird", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorThirdVarargs(value: Factor*): Self = this.set("minorThird", js.Array(value :_*))
    
    @scala.inline
    def setMinorThird(value: Scale): Self = this.set("minorThird", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfectFourthVarargs(value: Factor*): Self = this.set("perfectFourth", js.Array(value :_*))
    
    @scala.inline
    def setPerfectFourth(value: Scale): Self = this.set("perfectFourth", value.asInstanceOf[js.Any])
  }
}
