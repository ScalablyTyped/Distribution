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
  
  inline def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: () => Unit,
    timeout: Double,
    visible: Boolean
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  
  extension [Self <: SnackbarProps](x: Self) {
    
    inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
    
    inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
    
    inline def setBottomNavigation(value: Boolean): Self = StObject.set(x, "bottomNavigation", value.asInstanceOf[js.Any])
    
    inline def setButton(value: ButtonProps): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    inline def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    
    inline def setStyle(value: Message): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
