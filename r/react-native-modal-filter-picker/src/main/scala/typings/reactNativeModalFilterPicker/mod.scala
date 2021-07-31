package typings.reactNativeModalFilterPicker

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.KeyboardAvoidingView
import typings.reactNative.mod.ListViewProps
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
  class default[T /* <: ModalFilterPickerOption */] ()
    extends Component[ModalFilterPickerProps[T], js.Object, js.Any]
  
  type ModalFilterPicker[T /* <: ModalFilterPickerOption */] = Component[ModalFilterPickerProps[T], js.Object, js.Any]
  
  trait ModalFilterPickerOption extends StObject {
    
    var key: String
    
    var label: String
  }
  object ModalFilterPickerOption {
    
    @scala.inline
    def apply(key: String, label: String): ModalFilterPickerOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalFilterPickerOption]
    }
    
    @scala.inline
    implicit class ModalFilterPickerOptionMutableBuilder[Self <: ModalFilterPickerOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
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
    
    var keyboardShouldPersistTaps: js.UndefOr[never | always | handle] = js.undefined
    
    var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var listViewProps: js.UndefOr[Partial[ListViewProps | FlatListProps[T]]] = js.undefined
    
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
    
    @scala.inline
    def apply[T /* <: ModalFilterPickerOption */](onCancel: () => Unit, onSelect: String => Unit, options: js.Array[T]): ModalFilterPickerProps[T] = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalFilterPickerProps[T]]
    }
    
    @scala.inline
    implicit class ModalFilterPickerPropsMutableBuilder[Self <: ModalFilterPickerProps[?], T /* <: ModalFilterPickerOption */] (val x: Self & ModalFilterPickerProps[T]) extends AnyVal {
      
      @scala.inline
      def setAndroidUnderlineColor(value: String): Self = StObject.set(x, "androidUnderlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUnderlineColorUndefined: Self = StObject.set(x, "androidUnderlineColor", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCancelButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cancelButtonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonStyleNull: Self = StObject.set(x, "cancelButtonStyle", null)
      
      @scala.inline
      def setCancelButtonStyleUndefined: Self = StObject.set(x, "cancelButtonStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelButtonTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonTextStyleNull: Self = StObject.set(x, "cancelButtonTextStyle", null)
      
      @scala.inline
      def setCancelButtonTextStyleUndefined: Self = StObject.set(x, "cancelButtonTextStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      @scala.inline
      def setCancelContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cancelContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelContainerStyleNull: Self = StObject.set(x, "cancelContainerStyle", null)
      
      @scala.inline
      def setCancelContainerStyleUndefined: Self = StObject.set(x, "cancelContainerStyle", js.undefined)
      
      @scala.inline
      def setFilterTextInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "filterTextInputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTextInputContainerStyleNull: Self = StObject.set(x, "filterTextInputContainerStyle", null)
      
      @scala.inline
      def setFilterTextInputContainerStyleUndefined: Self = StObject.set(x, "filterTextInputContainerStyle", js.undefined)
      
      @scala.inline
      def setFilterTextInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "filterTextInputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTextInputStyleNull: Self = StObject.set(x, "filterTextInputStyle", null)
      
      @scala.inline
      def setFilterTextInputStyleUndefined: Self = StObject.set(x, "filterTextInputStyle", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: never | always | handle): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setListContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListContainerStyleNull: Self = StObject.set(x, "listContainerStyle", null)
      
      @scala.inline
      def setListContainerStyleUndefined: Self = StObject.set(x, "listContainerStyle", js.undefined)
      
      @scala.inline
      def setListViewProps(value: Partial[ListViewProps | FlatListProps[T]]): Self = StObject.set(x, "listViewProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListViewPropsUndefined: Self = StObject.set(x, "listViewProps", js.undefined)
      
      @scala.inline
      def setModal(value: ModalProps): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setNoResultsText(value: String): Self = StObject.set(x, "noResultsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsTextUndefined: Self = StObject.set(x, "noResultsText", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "optionTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionTextStyleNull: Self = StObject.set(x, "optionTextStyle", null)
      
      @scala.inline
      def setOptionTextStyleUndefined: Self = StObject.set(x, "optionTextStyle", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOverlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextColor(value: String): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      @scala.inline
      def setRenderCancelButton(value: () => Element): Self = StObject.set(x, "renderCancelButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderCancelButtonUndefined: Self = StObject.set(x, "renderCancelButton", js.undefined)
      
      @scala.inline
      def setRenderList(value: () => Element): Self = StObject.set(x, "renderList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderListUndefined: Self = StObject.set(x, "renderList", js.undefined)
      
      @scala.inline
      def setRenderOption(value: (/* option */ T, /* isSelected */ Boolean) => Element): Self = StObject.set(x, "renderOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
      
      @scala.inline
      def setSelectedOption(value: String): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedOptionTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "selectedOptionTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedOptionTextStyleNull: Self = StObject.set(x, "selectedOptionTextStyle", null)
      
      @scala.inline
      def setSelectedOptionTextStyleUndefined: Self = StObject.set(x, "selectedOptionTextStyle", js.undefined)
      
      @scala.inline
      def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
      
      @scala.inline
      def setShowFilter(value: Boolean): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
      
      @scala.inline
      def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
