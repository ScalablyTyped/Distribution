package typings.reactNativeSnackbarComponent

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  class default ()
    extends Component[SnackbarComponentProps, js.Object, js.Any]
  
  type SnackbarComponent = Component[SnackbarComponentProps, js.Object, js.Any]
  
  @js.native
  trait SnackbarComponentProps extends StObject {
    
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
    implicit class SnackbarComponentPropsMutableBuilder[Self <: SnackbarComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setActionHandler(value: () => Unit): Self = StObject.set(x, "actionHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActionHandlerUndefined: Self = StObject.set(x, "actionHandler", js.undefined)
      
      @scala.inline
      def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      @scala.inline
      def setAutoHidingTime(value: Double): Self = StObject.set(x, "autoHidingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHidingTimeUndefined: Self = StObject.set(x, "autoHidingTime", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setDistanceCallback(value: () => Unit): Self = StObject.set(x, "distanceCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDistanceCallbackUndefined: Self = StObject.set(x, "distanceCallback", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMessageColor(value: String): Self = StObject.set(x, "messageColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageColorUndefined: Self = StObject.set(x, "messageColor", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTextMessage(value: String): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMessageUndefined: Self = StObject.set(x, "textMessage", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
