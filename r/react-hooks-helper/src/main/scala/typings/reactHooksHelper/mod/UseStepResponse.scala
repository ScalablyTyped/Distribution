package typings.reactHooksHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseStepResponse extends js.Object {
  
  var autoAdvanceDuration: Double = js.native
  
  var index: Double = js.native
  
  var isPaused: Boolean = js.native
  
  var navigation: NavigationProps = js.native
  
  var step: Double = js.native
}
object UseStepResponse {
  
  @scala.inline
  def apply(
    autoAdvanceDuration: Double,
    index: Double,
    isPaused: Boolean,
    navigation: NavigationProps,
    step: Double
  ): UseStepResponse = {
    val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepResponse]
  }
  
  @scala.inline
  implicit class UseStepResponseOps[Self <: UseStepResponse] (val x: Self) extends AnyVal {
    
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
    def setAutoAdvanceDuration(value: Double): Self = this.set("autoAdvanceDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationProps): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
