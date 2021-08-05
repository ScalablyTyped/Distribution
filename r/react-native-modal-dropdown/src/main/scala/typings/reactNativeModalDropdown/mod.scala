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
    
    inline def apply[T](): ModalDropdownProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDropdownProps[T]]
    }
    
    extension [Self <: ModalDropdownProps[?], T](x: Self & ModalDropdownProps[T]) {
      
      inline def setAdjustFrame(value: /* positionStyle */ PositionStyle => PositionStyle): Self = StObject.set(x, "adjustFrame", js.Any.fromFunction1(value))
      
      inline def setAdjustFrameUndefined: Self = StObject.set(x, "adjustFrame", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownStyleNull: Self = StObject.set(x, "dropdownStyle", null)
      
      inline def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      inline def setDropdownTextHighlightStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "dropdownTextHighlightStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownTextHighlightStyleNull: Self = StObject.set(x, "dropdownTextHighlightStyle", null)
      
      inline def setDropdownTextHighlightStyleUndefined: Self = StObject.set(x, "dropdownTextHighlightStyle", js.undefined)
      
      inline def setDropdownTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "dropdownTextStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownTextStyleNull: Self = StObject.set(x, "dropdownTextStyle", null)
      
      inline def setDropdownTextStyleUndefined: Self = StObject.set(x, "dropdownTextStyle", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setOnDropdownWillHide(value: () => Unit | Boolean): Self = StObject.set(x, "onDropdownWillHide", js.Any.fromFunction0(value))
      
      inline def setOnDropdownWillHideUndefined: Self = StObject.set(x, "onDropdownWillHide", js.undefined)
      
      inline def setOnDropdownWillShow(value: () => Unit | Boolean): Self = StObject.set(x, "onDropdownWillShow", js.Any.fromFunction0(value))
      
      inline def setOnDropdownWillShowUndefined: Self = StObject.set(x, "onDropdownWillShow", js.undefined)
      
      inline def setOnSelect(value: (/* index */ String, /* option */ T) => Unit | Boolean): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setRenderButtonText(value: /* text */ String => String): Self = StObject.set(x, "renderButtonText", js.Any.fromFunction1(value))
      
      inline def setRenderButtonTextUndefined: Self = StObject.set(x, "renderButtonText", js.undefined)
      
      inline def setRenderRow(value: (/* option */ T, /* index */ String, /* isSelected */ Boolean) => ReactNode): Self = StObject.set(x, "renderRow", js.Any.fromFunction3(value))
      
      inline def setRenderRowUndefined: Self = StObject.set(x, "renderRow", js.undefined)
      
      inline def setRenderSeparator(
        value: (/* sectionID */ String, /* index */ String, /* adjacentRowHighlighted */ Boolean) => ReactNode
      ): Self = StObject.set(x, "renderSeparator", js.Any.fromFunction3(value))
      
      inline def setRenderSeparatorUndefined: Self = StObject.set(x, "renderSeparator", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
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
    
    inline def apply(): PositionStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionStyle]
    }
    
    extension [Self <: PositionStyle](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
