package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.GestureResponderEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps extends js.Object {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  def onPress(event: GestureResponderEvent): Unit = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pointerEvents: js.UndefOr[String] = js.native
  
  var showOverlay: js.UndefOr[Boolean] = js.native
  
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(onPress: GestureResponderEvent => Unit): OverlayProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
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
    def setOnPress(value: GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setShowOverlay(value: Boolean): Self = this.set("showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
