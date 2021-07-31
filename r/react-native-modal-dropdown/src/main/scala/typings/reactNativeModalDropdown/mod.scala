package typings.reactNativeModalDropdown

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.always
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.handled
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal-dropdown", JSImport.Default)
  @js.native
  class default[T] () extends ModalDropdown[T]
  
  @js.native
  trait ModalDropdown[T]
    extends Component[ModalDropdownProps[T], js.Object, js.Any] {
    
    def hide(): Unit = js.native
    
    def select(index: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait ModalDropdownProps[T]
    extends StObject
       with ViewProps {
    
    var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, PositionStyle]] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var defaultIndex: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dropdownTextHighlightStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var dropdownTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[always | never | handled] = js.undefined
    
    var onDropdownWillHide: js.UndefOr[js.Function0[Unit | Boolean]] = js.undefined
    
    var onDropdownWillShow: js.UndefOr[js.Function0[Unit | Boolean]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* index */ String, /* option */ T, Unit | Boolean]] = js.undefined
    
    var options: js.UndefOr[js.Array[T]] = js.undefined
    
    var renderButtonText: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var renderRow: js.UndefOr[
        js.Function3[/* option */ T, /* index */ String, /* isSelected */ Boolean, ReactNode]
      ] = js.undefined
    
    var renderSeparator: js.UndefOr[
        js.Function3[
          /* sectionID */ String, 
          /* index */ String, 
          /* adjacentRowHighlighted */ Boolean, 
          ReactNode
        ]
      ] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object ModalDropdownProps {
    
    @scala.inline
    def apply[T](): ModalDropdownProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDropdownProps[T]]
    }
    
    @scala.inline
    implicit class ModalDropdownPropsMutableBuilder[Self <: ModalDropdownProps[?], T] (val x: Self & ModalDropdownProps[T]) extends AnyVal {
      
      @scala.inline
      def setAdjustFrame(value: /* positionStyle */ PositionStyle => PositionStyle): Self = StObject.set(x, "adjustFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdjustFrameUndefined: Self = StObject.set(x, "adjustFrame", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleNull: Self = StObject.set(x, "dropdownStyle", null)
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setDropdownTextHighlightStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "dropdownTextHighlightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownTextHighlightStyleNull: Self = StObject.set(x, "dropdownTextHighlightStyle", null)
      
      @scala.inline
      def setDropdownTextHighlightStyleUndefined: Self = StObject.set(x, "dropdownTextHighlightStyle", js.undefined)
      
      @scala.inline
      def setDropdownTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "dropdownTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownTextStyleNull: Self = StObject.set(x, "dropdownTextStyle", null)
      
      @scala.inline
      def setDropdownTextStyleUndefined: Self = StObject.set(x, "dropdownTextStyle", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setOnDropdownWillHide(value: () => Unit | Boolean): Self = StObject.set(x, "onDropdownWillHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDropdownWillHideUndefined: Self = StObject.set(x, "onDropdownWillHide", js.undefined)
      
      @scala.inline
      def setOnDropdownWillShow(value: () => Unit | Boolean): Self = StObject.set(x, "onDropdownWillShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDropdownWillShowUndefined: Self = StObject.set(x, "onDropdownWillShow", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* index */ String, /* option */ T) => Unit | Boolean): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setRenderButtonText(value: /* text */ String => String): Self = StObject.set(x, "renderButtonText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderButtonTextUndefined: Self = StObject.set(x, "renderButtonText", js.undefined)
      
      @scala.inline
      def setRenderRow(value: (/* option */ T, /* index */ String, /* isSelected */ Boolean) => ReactNode): Self = StObject.set(x, "renderRow", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderRowUndefined: Self = StObject.set(x, "renderRow", js.undefined)
      
      @scala.inline
      def setRenderSeparator(
        value: (/* sectionID */ String, /* index */ String, /* adjacentRowHighlighted */ Boolean) => ReactNode
      ): Self = StObject.set(x, "renderSeparator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderSeparatorUndefined: Self = StObject.set(x, "renderSeparator", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  trait PositionStyle extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PositionStyle {
    
    @scala.inline
    def apply(): PositionStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionStyle]
    }
    
    @scala.inline
    implicit class PositionStyleMutableBuilder[Self <: PositionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
