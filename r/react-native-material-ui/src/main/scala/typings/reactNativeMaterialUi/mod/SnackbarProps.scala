package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnackbarProps extends StObject {
  
  var actionText: js.UndefOr[String] = js.undefined
  
  var bottomNavigation: Boolean
  
  var button: js.UndefOr[ButtonProps] = js.undefined
  
  var message: String
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def onRequestClose(): Unit
  
  var style: js.UndefOr[Message] = js.undefined
  
  var timeout: Double
  
  var visible: Boolean
}
object SnackbarProps {
  
  @scala.inline
  def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: () => Unit,
    timeout: Double,
    visible: Boolean
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  
  @scala.inline
  implicit class SnackbarPropsMutableBuilder[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
    
    @scala.inline
    def setBottomNavigation(value: Boolean): Self = StObject.set(x, "bottomNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: ButtonProps): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: Message): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
