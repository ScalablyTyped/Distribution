package typings.rcSwipeout

import typings.rcSwipeout.anon.BackgroundColor
import typings.rcSwipeout.propTypesMod.IPropTypes
import typings.rcSwipeout.rcSwipeoutStrings.delete
import typings.rcSwipeout.rcSwipeoutStrings.primary
import typings.rcSwipeout.rcSwipeoutStrings.secondary
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeoutNativeMod {
  
  @JSImport("rc-swipeout/lib/Swipeout.native", JSImport.Default)
  @js.native
  class default protected () extends Swipeout {
    def this(props: js.Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      inline def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      inline def onOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onOpen")().asInstanceOf[Unit]
    }
  }
  
  trait SwipeButttonType extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Element] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[typings.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object SwipeButttonType {
    
    inline def apply(): SwipeButttonType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeButttonType]
    }
    
    extension [Self <: SwipeButttonType](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: typings.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait Swipeout
    extends Component[IPropTypes, js.Any, js.Any] {
    
    def renderCustomButton(button: js.Any): BackgroundColor = js.native
  }
}
