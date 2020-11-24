package typings.reactNativeSnackbarComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarComponentProps extends js.Object {
  
  var accentColor: js.UndefOr[String] = js.native
  
  var actionHandler: js.UndefOr[js.Function0[Unit]] = js.native
  
  var actionText: js.UndefOr[String] = js.native
  
  var autoHidingTime: js.UndefOr[Double] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var bottom: js.UndefOr[Double] = js.native
  
  var distanceCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var messageColor: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var right: js.UndefOr[Double] = js.native
  
  var textMessage: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object SnackbarComponentProps {
  
  @scala.inline
  def apply(): SnackbarComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackbarComponentProps]
  }
  
  @scala.inline
  implicit class SnackbarComponentPropsOps[Self <: SnackbarComponentProps] (val x: Self) extends AnyVal {
    
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
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    
    @scala.inline
    def setActionHandler(value: () => Unit): Self = this.set("actionHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActionHandler: Self = this.set("actionHandler", js.undefined)
    
    @scala.inline
    def setActionText(value: String): Self = this.set("actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionText: Self = this.set("actionText", js.undefined)
    
    @scala.inline
    def setAutoHidingTime(value: Double): Self = this.set("autoHidingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHidingTime: Self = this.set("autoHidingTime", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setDistanceCallback(value: () => Unit): Self = this.set("distanceCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDistanceCallback: Self = this.set("distanceCallback", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMessageColor(value: String): Self = this.set("messageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageColor: Self = this.set("messageColor", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTextMessage(value: String): Self = this.set("textMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMessage: Self = this.set("textMessage", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
