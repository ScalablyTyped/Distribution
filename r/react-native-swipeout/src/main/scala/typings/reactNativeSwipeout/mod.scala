package typings.reactNativeSwipeout

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  class default ()
    extends Component[SwipeoutProperties, js.Any, js.Any]
  
  type Swipeout = Component[SwipeoutProperties, js.Any, js.Any]
  
  trait SwipeoutButtonProperties extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Element] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: js.UndefOr[
        typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object SwipeoutButtonProperties {
    
    inline def apply(): SwipeoutButtonProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProperties]
    }
    
    extension [Self <: SwipeoutButtonProperties](x: Self) {
      
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
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  trait SwipeoutProperties extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var buttonWidth: js.UndefOr[Double] = js.undefined
    
    var close: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
    
    var onClose: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.undefined
    
    var onOpen: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.undefined
    
    var openLeft: js.UndefOr[Boolean] = js.undefined
    
    var openRight: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
    
    var rowId: js.UndefOr[Double] = js.undefined
    
    var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.undefined
    
    var sectionId: js.UndefOr[Double] = js.undefined
    
    var sensitivity: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SwipeoutProperties {
    
    inline def apply(): SwipeoutProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutProperties]
    }
    
    extension [Self <: SwipeoutProperties](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
      
      inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLeft(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      inline def setOnClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction3(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpenLeft(value: Boolean): Self = StObject.set(x, "openLeft", value.asInstanceOf[js.Any])
      
      inline def setOpenLeftUndefined: Self = StObject.set(x, "openLeft", js.undefined)
      
      inline def setOpenRight(value: Boolean): Self = StObject.set(x, "openRight", value.asInstanceOf[js.Any])
      
      inline def setOpenRightUndefined: Self = StObject.set(x, "openRight", js.undefined)
      
      inline def setRight(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      inline def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
      
      inline def setScroll(value: /* scrollEnabled */ Boolean => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSectionId(value: Double): Self = StObject.set(x, "sectionId", value.asInstanceOf[js.Any])
      
      inline def setSectionIdUndefined: Self = StObject.set(x, "sectionId", js.undefined)
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
