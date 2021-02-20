package typings.reactNativeSwipeout

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  class default ()
    extends Component[SwipeoutProperties, js.Any, js.Any]
  
  type Swipeout = Component[SwipeoutProperties, js.Any, js.Any]
  
  @js.native
  trait SwipeoutButtonProperties extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[Element] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var text: js.UndefOr[ReactNode] = js.native
    
    var `type`: js.UndefOr[
        typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ] = js.native
    
    var underlayColor: js.UndefOr[String] = js.native
  }
  object SwipeoutButtonProperties {
    
    @scala.inline
    def apply(): SwipeoutButtonProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProperties]
    }
    
    @scala.inline
    implicit class SwipeoutButtonPropertiesMutableBuilder[Self <: SwipeoutButtonProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(
        value: typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait SwipeoutProperties extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var buttonWidth: js.UndefOr[Double] = js.native
    
    var close: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.native
    
    var onClose: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.native
    
    var onOpen: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.native
    
    var openLeft: js.UndefOr[Boolean] = js.native
    
    var openRight: js.UndefOr[Boolean] = js.native
    
    var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.native
    
    var rowId: js.UndefOr[Double] = js.native
    
    var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.native
    
    var sectionId: js.UndefOr[Double] = js.native
    
    var sensitivity: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object SwipeoutProperties {
    
    @scala.inline
    def apply(): SwipeoutProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutProperties]
    }
    
    @scala.inline
    implicit class SwipeoutPropertiesMutableBuilder[Self <: SwipeoutProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
      
      @scala.inline
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLeft(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpenLeft(value: Boolean): Self = StObject.set(x, "openLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenLeftUndefined: Self = StObject.set(x, "openLeft", js.undefined)
      
      @scala.inline
      def setOpenRight(value: Boolean): Self = StObject.set(x, "openRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenRightUndefined: Self = StObject.set(x, "openRight", js.undefined)
      
      @scala.inline
      def setRight(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
      
      @scala.inline
      def setScroll(value: /* scrollEnabled */ Boolean => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSectionId(value: Double): Self = StObject.set(x, "sectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionIdUndefined: Self = StObject.set(x, "sectionId", js.undefined)
      
      @scala.inline
      def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
