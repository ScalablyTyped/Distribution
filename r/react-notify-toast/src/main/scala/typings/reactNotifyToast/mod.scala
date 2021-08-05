package typings.reactNotifyToast

import typings.react.mod.Component
import typings.reactNotifyToast.reactNotifyToastStrings.custom
import typings.reactNotifyToast.reactNotifyToastStrings.error
import typings.reactNotifyToast.reactNotifyToastStrings.success
import typings.reactNotifyToast.reactNotifyToastStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notify-toast", JSImport.Default)
  @js.native
  class default protected () extends Notification {
    def this(props: NotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NotificationProps, context: js.Any) = this()
  }
  
  @JSImport("react-notify-toast", "Notification")
  @js.native
  class Notification protected ()
    extends Component[NotificationProps, js.Any, js.Any] {
    def this(props: NotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NotificationProps, context: js.Any) = this()
  }
  
  @JSImport("react-notify-toast", "notify")
  @js.native
  val notify_ : typings.reactNotifyToast.mod.reactNotifyToast = js.native
  
  trait NotificationProps extends StObject {
    
    var options: js.UndefOr[Options] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[js.Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
    
    var wrapperId: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setColors(value: js.Any): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWrapperId(value: String): Self = StObject.set(x, "wrapperId", value.asInstanceOf[js.Any])
      
      inline def setWrapperIdUndefined: Self = StObject.set(x, "wrapperId", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait reactNotifyToast extends StObject {
    
    def createShowQueue(): typings.reactNotifyToast.mod.reactNotifyToast = js.native
    
    def hide(): Unit = js.native
    
    def show(text: String): Unit = js.native
    def show(text: String, `type`: Unit, timeout: Double): Unit = js.native
    def show(text: String, `type`: Unit, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    def show(text: String, `type`: Unit, timeout: Unit, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: Double): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: Unit, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: Double): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: Unit, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: Double): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: Unit, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: Double): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: Unit, color: reactNotifyToastColor): Unit = js.native
  }
  
  trait reactNotifyToastColor extends StObject {
    
    var background: String
    
    var text: String
  }
  object reactNotifyToastColor {
    
    inline def apply(background: String, text: String): reactNotifyToastColor = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[reactNotifyToastColor]
    }
    
    extension [Self <: reactNotifyToastColor](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
