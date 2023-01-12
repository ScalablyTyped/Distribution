package typings.reactNativeModalFilterPicker

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.KeyboardAvoidingView
import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typings.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typings.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal-filter-picker", JSImport.Default)
  @js.native
  open class default[T /* <: ModalFilterPickerOption */] ()
    extends Component[ModalFilterPickerProps[T], js.Object, Any]
  
  type ModalFilterPicker[T /* <: ModalFilterPickerOption */] = Component[ModalFilterPickerProps[T], js.Object, Any]
  
  trait ModalFilterPickerOption extends StObject {
    
    var key: String
    
    var label: String
  }
  object ModalFilterPickerOption {
    
    inline def apply(key: String, label: String): ModalFilterPickerOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalFilterPickerOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalFilterPickerOption] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModalFilterPickerProps[T /* <: ModalFilterPickerOption */] extends StObject {
    
    var androidUnderlineColor: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var cancelButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    var cancelButtonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var cancelContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var filterTextInputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var filterTextInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var flatListProps: js.UndefOr[Partial[FlatListProps[T]]] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[never | always | handle] = js.undefined
    
    var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var modal: js.UndefOr[ModalProps] = js.undefined
    
    var noResultsText: js.UndefOr[String] = js.undefined
    
    def onCancel(): Unit
    
    def onSelect(key: String): Unit
    
    var optionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var options: js.Array[T]
    
    // styling props
    var overlayStyle: js.UndefOr[StyleProp[KeyboardAvoidingView | ViewStyle]] = js.undefined
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var placeholderTextColor: js.UndefOr[String] = js.undefined
    
    var renderCancelButton: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var renderList: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var renderOption: js.UndefOr[js.Function2[/* option */ T, /* isSelected */ Boolean, Element]] = js.undefined
    
    var selectedOption: js.UndefOr[String] = js.undefined
    
    var selectedOptionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var showFilter: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ModalFilterPickerProps {
    
    inline def apply[T /* <: ModalFilterPickerOption */](onCancel: () => Unit, onSelect: String => Unit, options: js.Array[T]): ModalFilterPickerProps[T] = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalFilterPickerProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalFilterPickerProps[?], T /* <: ModalFilterPickerOption */] (val x: Self & ModalFilterPickerProps[T]) extends AnyVal {
      
      inline def setAndroidUnderlineColor(value: String): Self = StObject.set(x, "androidUnderlineColor", value.asInstanceOf[js.Any])
      
      inline def setAndroidUnderlineColorUndefined: Self = StObject.set(x, "androidUnderlineColor", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCancelButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cancelButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonStyleNull: Self = StObject.set(x, "cancelButtonStyle", null)
      
      inline def setCancelButtonStyleUndefined: Self = StObject.set(x, "cancelButtonStyle", js.undefined)
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelButtonTextStyle", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextStyleNull: Self = StObject.set(x, "cancelButtonTextStyle", null)
      
      inline def setCancelButtonTextStyleUndefined: Self = StObject.set(x, "cancelButtonTextStyle", js.undefined)
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setCancelContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cancelContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setCancelContainerStyleNull: Self = StObject.set(x, "cancelContainerStyle", null)
      
      inline def setCancelContainerStyleUndefined: Self = StObject.set(x, "cancelContainerStyle", js.undefined)
      
      inline def setFilterTextInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "filterTextInputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setFilterTextInputContainerStyleNull: Self = StObject.set(x, "filterTextInputContainerStyle", null)
      
      inline def setFilterTextInputContainerStyleUndefined: Self = StObject.set(x, "filterTextInputContainerStyle", js.undefined)
      
      inline def setFilterTextInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "filterTextInputStyle", value.asInstanceOf[js.Any])
      
      inline def setFilterTextInputStyleNull: Self = StObject.set(x, "filterTextInputStyle", null)
      
      inline def setFilterTextInputStyleUndefined: Self = StObject.set(x, "filterTextInputStyle", js.undefined)
      
      inline def setFlatListProps(value: Partial[FlatListProps[T]]): Self = StObject.set(x, "flatListProps", value.asInstanceOf[js.Any])
      
      inline def setFlatListPropsUndefined: Self = StObject.set(x, "flatListProps", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: never | always | handle): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setListContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setListContainerStyleNull: Self = StObject.set(x, "listContainerStyle", null)
      
      inline def setListContainerStyleUndefined: Self = StObject.set(x, "listContainerStyle", js.undefined)
      
      inline def setModal(value: ModalProps): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setNoResultsText(value: String): Self = StObject.set(x, "noResultsText", value.asInstanceOf[js.Any])
      
      inline def setNoResultsTextUndefined: Self = StObject.set(x, "noResultsText", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOptionTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "optionTextStyle", value.asInstanceOf[js.Any])
      
      inline def setOptionTextStyleNull: Self = StObject.set(x, "optionTextStyle", null)
      
      inline def setOptionTextStyleUndefined: Self = StObject.set(x, "optionTextStyle", js.undefined)
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOverlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColor(value: String): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setRenderCancelButton(value: () => Element): Self = StObject.set(x, "renderCancelButton", js.Any.fromFunction0(value))
      
      inline def setRenderCancelButtonUndefined: Self = StObject.set(x, "renderCancelButton", js.undefined)
      
      inline def setRenderList(value: () => Element): Self = StObject.set(x, "renderList", js.Any.fromFunction0(value))
      
      inline def setRenderListUndefined: Self = StObject.set(x, "renderList", js.undefined)
      
      inline def setRenderOption(value: (/* option */ T, /* isSelected */ Boolean) => Element): Self = StObject.set(x, "renderOption", js.Any.fromFunction2(value))
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
      
      inline def setSelectedOption(value: String): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "selectedOptionTextStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionTextStyleNull: Self = StObject.set(x, "selectedOptionTextStyle", null)
      
      inline def setSelectedOptionTextStyleUndefined: Self = StObject.set(x, "selectedOptionTextStyle", js.undefined)
      
      inline def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
      
      inline def setShowFilter(value: Boolean): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      inline def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
      
      inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
