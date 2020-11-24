package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadProps[T /* <: TypeaheadModel */] extends js.Object {
  
  /* For localized accessibility: Should return a string indicating the number of results for screen readers.
    Receives the current results. */
  var a11yNumResults: js.UndefOr[js.Function0[Unit]] = js.native
  
  /* For localized accessibility: Should return a string indicating the number of selections for screen readers.
    Receives the current selections. */
  var a11yNumSelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  /* Specify menu alignment. The default value is justify, which makes the menu as wide as the input and truncates long values.
    Specifying left or right will align the menu to that side and the width will be determined by the length of menu item values. */
  var align: js.UndefOr[TypeaheadAlign] = js.native
  
  /* Allows the creation of new selections on the fly. Any new items will be added to the list of selections,
    but not the list of original options unless handled as such by Typeahead's parent.
    The newly added item will always be returned as an object even if the other options are simply strings,
    so be sure your onChange callback can handle this. */
  var allowNew: js.UndefOr[
    Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.native
  
  /* Autofocus the input when the component initially mounts. */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /* Whether to render the menu inline or attach to document.body. */
  var bodyContainer: js.UndefOr[Boolean] = js.native
  
  /* Specify the size of the input. */
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  
  /* Whether or not filtering should be case-sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /* Displays a button to clear the input when there are selections. */
  var clearButton: js.UndefOr[Boolean] = js.native
  
  /* The initial value displayed in the text input. */
  var defaultInputValue: js.UndefOr[String] = js.native
  
  /* Whether or not the menu is displayed upon initial render. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  /* Specify any pre-selected options. Use only if you want the component to be uncontrolled. */
  var defaultSelected: js.UndefOr[js.Array[T]] = js.native
  
  /* Whether to disable the input. Will also disable selections when multiple={true}. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /* Specify whether the menu should appear above the input. */
  var dropup: js.UndefOr[Boolean] = js.native
  
  /* Message displayed in the menu when there are no valid results.
    Passing a falsy value will hide the menu if no matches are found. */
  var emptyLabel: js.UndefOr[String] = js.native
  
  /* Either an array of fields in option to search, or a custom filtering callback. */
  var filterBy: js.UndefOr[
    js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.native
  
  /* Whether or not to automatically adjust the position of the menu when it reaches the viewport boundaries. */
  var flip: js.UndefOr[Boolean] = js.native
  
  /* Highlights the menu item if there is only one result and allows selecting that item by hitting enter.
    Does not work with allowNew. */
  var highlightOnlyResult: js.UndefOr[Boolean] = js.native
  
  /* An html id attribute, required for assistive technologies such as screen readers. */
  var id: js.UndefOr[String | Double] = js.native
  
  /* Whether the filter should ignore accents and other diacritical marks. */
  var ignoreDiacritics: js.UndefOr[Boolean] = js.native
  
  /* Props to be applied directly to the input. onBlur, onChange, onFocus, and onKeyDown are ignored. */
  var inputProps: js.UndefOr[InputProps] = js.native
  
  /* Bootstrap 4 only. Adds the `is-invalid` classname to the `form-control`. */
  var isInvalid: js.UndefOr[Boolean] = js.native
  
  /* Indicate whether an asynchronous data fetch is happening. */
  var isLoading: js.UndefOr[Boolean] = js.native
  
  /* Bootstrap 4 only. Adds the `is-valid` classname to the `form-control`. */
  var isValid: js.UndefOr[Boolean] = js.native
  
  /* Specify which option key to use for display or a render function.
    By default, the selector will use the label key. */
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  
  /* Maximum height of the dropdown menu. */
  var maxHeight: js.UndefOr[String] = js.native
  
  /* Maximum number of results to display by default. Mostly done for performance reasons
    so as not to render too many DOM nodes in the case of large data sets. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** @deprecated: Id applied to the top-level menu element. Required for accessibility. */
  var menuId: js.UndefOr[String] = js.native
  
  /* Number of input characters that must be entered before showing results. */
  var minLength: js.UndefOr[Double] = js.native
  
  /* Whether or not multiple selections are allowed. */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /* Provides the ability to specify a prefix before the user-entered text to indicate that the selection will be new. No-op unless allowNew={true}. */
  var newSelectionPrefix: js.UndefOr[String] = js.native
  
  /* Invoked when the input is blurred. Receives an event. */
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  /* Invoked whenever items are added or removed. Receives an array of the selected options. */
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.native
  
  /* Invoked when the input is focused. Receives an event. */
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  /* Invoked when the input value changes. Receives the string value of the input, as well as the original event. */
  var onInputChange: js.UndefOr[js.Function2[/* input */ String, /* e */ Event, Unit]] = js.native
  
  /* Invoked when a key is pressed. Receives an event. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  /** @deprecated: Invoked when the menu is hidden. */
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** @deprecated: Invoked when the menu is shown. */
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /*     Invoked when menu visibility changes. */
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.native
  
  /* Invoked when the pagination menu item is clicked. */
  var onPaginate: js.UndefOr[js.Function2[/* e */ Event, /* numResults */ Double, Unit]] = js.native
  
  /* Whether or not the menu should be displayed. undefined allows the component to control visibility,
    while true and false show and hide the menu, respectively. */
  var open: js.UndefOr[Boolean] = js.native
  
  /* Full set of options, including any pre-selected options. */
  var options: js.Array[T] = js.native
  
  /* Give user the ability to display additional results if the number of results exceeds maxResults. */
  var paginate: js.UndefOr[Boolean] = js.native
  
  /* Prompt displayed when large data sets are paginated. */
  var paginationText: js.UndefOr[String] = js.native
  
  /* Placeholder text for the input. */
  var placeholder: js.UndefOr[String] = js.native
  
  /* Whether to use fixed positioning for the menu, which is useful when rendering inside a
    container with overflow: hidden;. Uses absolute positioning by default. */
  var positionFixed: js.UndefOr[Boolean] = js.native
  
  /* Callback for custom menu rendering. */
  var renderMenu: js.UndefOr[
    js.Function3[
      /* results */ js.Array[TypeaheadResult[T]], 
      /* menuProps */ TypeaheadMenuProps[T], 
      /* state */ TypeaheadState[T], 
      ReactNode
    ]
  ] = js.native
  
  /* Provides a hook for customized rendering of menu item contents. */
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      ReactNode
    ]
  ] = js.native
  
  /* Provides a hook for customized rendering of tokens when multiple selections are enabled. */
  var renderToken: js.UndefOr[
    js.Function3[/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double, ReactNode]
  ] = js.native
  
  /** @deprecated: Allows selecting the hinted result by pressing enter. */
  var selectHintOnEnter: js.UndefOr[Boolean] = js.native
  
  /* The selected option(s) displayed in the input. Use this prop if you want to control the component via its parent. */
  var selected: js.UndefOr[js.Array[T]] = js.native
}
object TypeaheadProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](options: js.Array[T]): TypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadPropsOps[Self <: TypeaheadProps[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadProps[T]) extends AnyVal {
    
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
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yNumResults(value: () => Unit): Self = this.set("a11yNumResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteA11yNumResults: Self = this.set("a11yNumResults", js.undefined)
    
    @scala.inline
    def setA11yNumSelected(value: () => Unit): Self = this.set("a11yNumSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteA11yNumSelected: Self = this.set("a11yNumSelected", js.undefined)
    
    @scala.inline
    def setAlign(value: TypeaheadAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAllowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = this.set("allowNew", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = this.set("allowNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNew: Self = this.set("allowNew", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBodyContainer(value: Boolean): Self = this.set("bodyContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyContainer: Self = this.set("bodyContainer", js.undefined)
    
    @scala.inline
    def setBsSize(value: TypeaheadBsSizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    
    @scala.inline
    def setDefaultInputValue(value: String): Self = this.set("defaultInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultInputValue: Self = this.set("defaultInputValue", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultSelectedVarargs(value: T*): Self = this.set("defaultSelected", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelected(value: js.Array[T]): Self = this.set("defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelected: Self = this.set("defaultSelected", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDropup(value: Boolean): Self = this.set("dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropup: Self = this.set("dropup", js.undefined)
    
    @scala.inline
    def setEmptyLabel(value: String): Self = this.set("emptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyLabel: Self = this.set("emptyLabel", js.undefined)
    
    @scala.inline
    def setFilterByFunction2(value: (/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = this.set("filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterByVarargs(value: String*): Self = this.set("filterBy", js.Array(value :_*))
    
    @scala.inline
    def setFilterBy(
      value: js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = this.set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setHighlightOnlyResult(value: Boolean): Self = this.set("highlightOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightOnlyResult: Self = this.set("highlightOnlyResult", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreDiacritics(value: Boolean): Self = this.set("ignoreDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDiacritics: Self = this.set("ignoreDiacritics", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setIsInvalid(value: Boolean): Self = this.set("isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInvalid: Self = this.set("isInvalid", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = this.set("labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = this.set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuId: Self = this.set("menuId", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setNewSelectionPrefix(value: String): Self = this.set("newSelectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSelectionPrefix: Self = this.set("newSelectionPrefix", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: (/* input */ String, /* e */ Event) => Unit): Self = this.set("onInputChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ Event => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMenuHide(value: () => Unit): Self = this.set("onMenuHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMenuHide: Self = this.set("onMenuHide", js.undefined)
    
    @scala.inline
    def setOnMenuShow(value: () => Unit): Self = this.set("onMenuShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMenuShow: Self = this.set("onMenuShow", js.undefined)
    
    @scala.inline
    def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = this.set("onMenuToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMenuToggle: Self = this.set("onMenuToggle", js.undefined)
    
    @scala.inline
    def setOnPaginate(value: (/* e */ Event, /* numResults */ Double) => Unit): Self = this.set("onPaginate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPaginate: Self = this.set("onPaginate", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPaginate(value: Boolean): Self = this.set("paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    
    @scala.inline
    def setPaginationText(value: String): Self = this.set("paginationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationText: Self = this.set("paginationText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPositionFixed(value: Boolean): Self = this.set("positionFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionFixed: Self = this.set("positionFixed", js.undefined)
    
    @scala.inline
    def setRenderMenu(
      value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ TypeaheadMenuProps[T], /* state */ TypeaheadState[T]) => ReactNode
    ): Self = this.set("renderMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderMenu: Self = this.set("renderMenu", js.undefined)
    
    @scala.inline
    def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = this.set("renderMenuItemChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderMenuItemChildren: Self = this.set("renderMenuItemChildren", js.undefined)
    
    @scala.inline
    def setRenderToken(value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode): Self = this.set("renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderToken: Self = this.set("renderToken", js.undefined)
    
    @scala.inline
    def setSelectHintOnEnter(value: Boolean): Self = this.set("selectHintOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectHintOnEnter: Self = this.set("selectHintOnEnter", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
