package typings.reactNativeResponsiveDimensions.mod

import typings.reactNative.mod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectParams extends js.Object {
  
  var screen: ScaledSize = js.native
  
  var window: ScaledSize = js.native
}
object EffectParams {
  
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): EffectParams = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParams]
  }
  
  @scala.inline
  implicit class EffectParamsOps[Self <: EffectParams] (val x: Self) extends AnyVal {
    
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
    def setScreen(value: ScaledSize): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: ScaledSize): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
