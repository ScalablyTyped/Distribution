package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchableWithoutFeedbackPropsIOS extends js.Object {
  
  /**
    * *(Apple TV only)* TV preferred focus (see documentation for the View component).
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * enabled: If true, parallax effects are enabled.  Defaults to true.
    * shiftDistanceX: Defaults to 2.0.
    * shiftDistanceY: Defaults to 2.0.
    * tiltAngle: Defaults to 0.05.
    * magnification: Defaults to 1.0.
    * pressMagnification: Defaults to 1.0.
    * pressDuration: Defaults to 0.3.
    * pressDelay: Defaults to 0.0.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
}
object TouchableWithoutFeedbackPropsIOS {
  
  @scala.inline
  def apply(): TouchableWithoutFeedbackPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsIOS]
  }
  
  @scala.inline
  implicit class TouchableWithoutFeedbackPropsIOSOps[Self <: TouchableWithoutFeedbackPropsIOS] (val x: Self) extends AnyVal {
    
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
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
  }
}
