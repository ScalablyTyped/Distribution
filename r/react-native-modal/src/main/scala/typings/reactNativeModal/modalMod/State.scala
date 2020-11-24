package typings.reactNativeModal.modalMod

import typings.reactNative.mod.Animated.ValueXY
import typings.reactNativeModal.typesMod.OrNull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var deviceHeight: Double = js.native
  
  var deviceWidth: Double = js.native
  
  var isSwipeable: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var pan: OrNull[ValueXY] = js.native
  
  var showContent: Boolean = js.native
}
object State {
  
  @scala.inline
  def apply(
    deviceHeight: Double,
    deviceWidth: Double,
    isSwipeable: Boolean,
    isVisible: Boolean,
    showContent: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isSwipeable = isSwipeable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDeviceHeight(value: Double): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceWidth(value: Double): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSwipeable(value: Boolean): Self = this.set("isSwipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowContent(value: Boolean): Self = this.set("showContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPan(value: OrNull[ValueXY]): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanNull: Self = this.set("pan", null)
  }
}
