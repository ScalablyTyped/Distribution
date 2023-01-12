package typings.reactNativeSnackbarComponent

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SnackbarComponentProps, js.Object, Any]
  
  type SnackbarComponent = Component[SnackbarComponentProps, js.Object, Any]
  
  trait SnackbarComponentProps extends StObject {
    
    var accentColor: js.UndefOr[String] = js.undefined
    
    var actionHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var autoHidingTime: js.UndefOr[Double] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var distanceCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var messageColor: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var textMessage: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SnackbarComponentProps {
    
    inline def apply(): SnackbarComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackbarComponentProps] (val x: Self) extends AnyVal {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setActionHandler(value: () => Unit): Self = StObject.set(x, "actionHandler", js.Any.fromFunction0(value))
      
      inline def setActionHandlerUndefined: Self = StObject.set(x, "actionHandler", js.undefined)
      
      inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      inline def setAutoHidingTime(value: Double): Self = StObject.set(x, "autoHidingTime", value.asInstanceOf[js.Any])
      
      inline def setAutoHidingTimeUndefined: Self = StObject.set(x, "autoHidingTime", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setDistanceCallback(value: () => Unit): Self = StObject.set(x, "distanceCallback", js.Any.fromFunction0(value))
      
      inline def setDistanceCallbackUndefined: Self = StObject.set(x, "distanceCallback", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMessageColor(value: String): Self = StObject.set(x, "messageColor", value.asInstanceOf[js.Any])
      
      inline def setMessageColorUndefined: Self = StObject.set(x, "messageColor", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTextMessage(value: String): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
      
      inline def setTextMessageUndefined: Self = StObject.set(x, "textMessage", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
