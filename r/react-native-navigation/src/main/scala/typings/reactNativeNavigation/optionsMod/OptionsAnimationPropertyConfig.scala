package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsAnimationPropertyConfig extends js.Object {
  
  /**
    * Animation duration
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Animate from this value, ex. 0
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * Animation interplation
    */
  var interpolation: js.UndefOr[Interpolation] = js.native
  
  /**
    * Animation delay
    * @default 0
    */
  var startDelay: js.UndefOr[Double] = js.native
  
  /**
    * Animate to this value, ex. 1
    */
  var to: js.UndefOr[Double] = js.native
}
object OptionsAnimationPropertyConfig {
  
  @scala.inline
  def apply(): OptionsAnimationPropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsAnimationPropertyConfig]
  }
  
  @scala.inline
  implicit class OptionsAnimationPropertyConfigOps[Self <: OptionsAnimationPropertyConfig] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Interpolation): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
