package typings.reactNativeMaterialRipple.anon

import typings.reactNative.mod.Animated.CompositeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onRippleAnimation: js.UndefOr[
    js.Function2[/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit], Unit]
  ] = js.native
  
  var rippleCentered: js.UndefOr[Boolean] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var rippleContainerBorderRadius: js.UndefOr[Double] = js.native
  
  var rippleDuration: js.UndefOr[Double] = js.native
  
  var rippleFades: js.UndefOr[Boolean] = js.native
  
  var rippleOpacity: js.UndefOr[Double] = js.native
  
  var rippleSequential: js.UndefOr[Boolean] = js.native
  
  var rippleSize: js.UndefOr[Double] = js.native
}
object Disabled {
  
  @scala.inline
  def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnRippleAnimation(value: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Unit): Self = this.set("onRippleAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRippleAnimation: Self = this.set("onRippleAnimation", js.undefined)
    
    @scala.inline
    def setRippleCentered(value: Boolean): Self = this.set("rippleCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleCentered: Self = this.set("rippleCentered", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    
    @scala.inline
    def setRippleContainerBorderRadius(value: Double): Self = this.set("rippleContainerBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleContainerBorderRadius: Self = this.set("rippleContainerBorderRadius", js.undefined)
    
    @scala.inline
    def setRippleDuration(value: Double): Self = this.set("rippleDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleDuration: Self = this.set("rippleDuration", js.undefined)
    
    @scala.inline
    def setRippleFades(value: Boolean): Self = this.set("rippleFades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleFades: Self = this.set("rippleFades", js.undefined)
    
    @scala.inline
    def setRippleOpacity(value: Double): Self = this.set("rippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleOpacity: Self = this.set("rippleOpacity", js.undefined)
    
    @scala.inline
    def setRippleSequential(value: Boolean): Self = this.set("rippleSequential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleSequential: Self = this.set("rippleSequential", js.undefined)
    
    @scala.inline
    def setRippleSize(value: Double): Self = this.set("rippleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleSize: Self = this.set("rippleSize", js.undefined)
  }
}
