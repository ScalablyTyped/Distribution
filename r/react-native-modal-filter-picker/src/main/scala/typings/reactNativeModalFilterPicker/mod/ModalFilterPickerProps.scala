package typings.reactNativeModalFilterPicker.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalFilterPickerProps[T /* <: ModalFilterPickerOption */] extends js.Object {
  
  var androidUnderlineColor: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var cancelButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var cancelButtonText: js.UndefOr[String] = js.native
  
  var cancelButtonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var cancelContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var filterTextInputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var filterTextInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var keyboardShouldPersistTaps: js.UndefOr[never | always | handle] = js.native
  
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var listViewProps: js.UndefOr[Partial[ListViewProps | FlatListProps[T]]] = js.native
  
  var modal: js.UndefOr[ModalProps] = js.native
  
  var noResultsText: js.UndefOr[String] = js.native
  
  def onCancel(): Unit = js.native
  
  def onSelect(key: String): Unit = js.native
  
  var optionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var options: js.Array[T] = js.native
  
  // styling props
  var overlayStyle: js.UndefOr[StyleProp[KeyboardAvoidingView | ViewStyle]] = js.native
  
  var placeholderText: js.UndefOr[String] = js.native
  
  var placeholderTextColor: js.UndefOr[String] = js.native
  
  var renderCancelButton: js.UndefOr[js.Function0[Element]] = js.native
  
  var renderList: js.UndefOr[js.Function0[Element]] = js.native
  
  var renderOption: js.UndefOr[js.Function2[/* option */ T, /* isSelected */ Boolean, Element]] = js.native
  
  var selectedOption: js.UndefOr[String] = js.native
  
  var selectedOptionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var showFilter: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ModalFilterPickerProps {
  
  @scala.inline
  def apply[T /* <: ModalFilterPickerOption */](onCancel: () => Unit, onSelect: String => Unit, options: js.Array[T]): ModalFilterPickerProps[T] = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFilterPickerProps[T]]
  }
  
  @scala.inline
  implicit class ModalFilterPickerPropsOps[Self <: ModalFilterPickerProps[_], T /* <: ModalFilterPickerOption */] (val x: Self with ModalFilterPickerProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelect(value: String => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUnderlineColor(value: String): Self = this.set("androidUnderlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidUnderlineColor: Self = this.set("androidUnderlineColor", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCancelButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("cancelButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonStyle: Self = this.set("cancelButtonStyle", js.undefined)
    
    @scala.inline
    def setCancelButtonStyleNull: Self = this.set("cancelButtonStyle", null)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setCancelButtonTextStyle(value: StyleProp[TextStyle]): Self = this.set("cancelButtonTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonTextStyle: Self = this.set("cancelButtonTextStyle", js.undefined)
    
    @scala.inline
    def setCancelButtonTextStyleNull: Self = this.set("cancelButtonTextStyle", null)
    
    @scala.inline
    def setCancelContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("cancelContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelContainerStyle: Self = this.set("cancelContainerStyle", js.undefined)
    
    @scala.inline
    def setCancelContainerStyleNull: Self = this.set("cancelContainerStyle", null)
    
    @scala.inline
    def setFilterTextInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("filterTextInputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterTextInputContainerStyle: Self = this.set("filterTextInputContainerStyle", js.undefined)
    
    @scala.inline
    def setFilterTextInputContainerStyleNull: Self = this.set("filterTextInputContainerStyle", null)
    
    @scala.inline
    def setFilterTextInputStyle(value: StyleProp[TextStyle]): Self = this.set("filterTextInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterTextInputStyle: Self = this.set("filterTextInputStyle", js.undefined)
    
    @scala.inline
    def setFilterTextInputStyleNull: Self = this.set("filterTextInputStyle", null)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: never | always | handle): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setListContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("listContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListContainerStyle: Self = this.set("listContainerStyle", js.undefined)
    
    @scala.inline
    def setListContainerStyleNull: Self = this.set("listContainerStyle", null)
    
    @scala.inline
    def setListViewProps(value: Partial[ListViewProps | FlatListProps[T]]): Self = this.set("listViewProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListViewProps: Self = this.set("listViewProps", js.undefined)
    
    @scala.inline
    def setModal(value: ModalProps): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setNoResultsText(value: String): Self = this.set("noResultsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultsText: Self = this.set("noResultsText", js.undefined)
    
    @scala.inline
    def setOptionTextStyle(value: StyleProp[TextStyle]): Self = this.set("optionTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionTextStyle: Self = this.set("optionTextStyle", js.undefined)
    
    @scala.inline
    def setOptionTextStyleNull: Self = this.set("optionTextStyle", null)
    
    @scala.inline
    def setOverlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setPlaceholderTextColor(value: String): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    
    @scala.inline
    def setRenderCancelButton(value: () => Element): Self = this.set("renderCancelButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderCancelButton: Self = this.set("renderCancelButton", js.undefined)
    
    @scala.inline
    def setRenderList(value: () => Element): Self = this.set("renderList", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderList: Self = this.set("renderList", js.undefined)
    
    @scala.inline
    def setRenderOption(value: (/* option */ T, /* isSelected */ Boolean) => Element): Self = this.set("renderOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderOption: Self = this.set("renderOption", js.undefined)
    
    @scala.inline
    def setSelectedOption(value: String): Self = this.set("selectedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedOption: Self = this.set("selectedOption", js.undefined)
    
    @scala.inline
    def setSelectedOptionTextStyle(value: StyleProp[TextStyle]): Self = this.set("selectedOptionTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedOptionTextStyle: Self = this.set("selectedOptionTextStyle", js.undefined)
    
    @scala.inline
    def setSelectedOptionTextStyleNull: Self = this.set("selectedOptionTextStyle", null)
    
    @scala.inline
    def setShowFilter(value: Boolean): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: StyleProp[TextStyle]): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTextStyleNull: Self = this.set("titleTextStyle", null)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
