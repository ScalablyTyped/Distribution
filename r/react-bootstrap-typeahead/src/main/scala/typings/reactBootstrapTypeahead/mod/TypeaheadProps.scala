package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadProps[T /* <: TypeaheadModel */] extends StObject {
  
  /* For localized accessibility: Should return a string indicating the number of results for screen readers.
    Receives the current results. */
  var a11yNumResults: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /* For localized accessibility: Should return a string indicating the number of selections for screen readers.
    Receives the current selections. */
  var a11yNumSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /* Specify menu alignment. The default value is justify, which makes the menu as wide as the input and truncates long values.
    Specifying left or right will align the menu to that side and the width will be determined by the length of menu item values. */
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  
  /* Allows the creation of new selections on the fly. Any new items will be added to the list of selections,
    but not the list of original options unless handled as such by Typeahead's parent.
    The newly added item will always be returned as an object even if the other options are simply strings,
    so be sure your onChange callback can handle this. */
  var allowNew: js.UndefOr[
    Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.undefined
  
  /* Autofocus the input when the component initially mounts. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /* Whether to render the menu inline or attach to document.body. */
  var bodyContainer: js.UndefOr[Boolean] = js.undefined
  
  /* Specify the size of the input. */
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  
  /* Whether or not filtering should be case-sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /* Displays a button to clear the input when there are selections. */
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  /* The initial value displayed in the text input. */
  var defaultInputValue: js.UndefOr[String] = js.undefined
  
  /* Whether or not the menu is displayed upon initial render. */
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  
  /* Specify any pre-selected options. Use only if you want the component to be uncontrolled. */
  var defaultSelected: js.UndefOr[js.Array[T]] = js.undefined
  
  /* Whether to disable the input. Will also disable selections when multiple={true}. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /* Specify whether the menu should appear above the input. */
  var dropup: js.UndefOr[Boolean] = js.undefined
  
  /* Message displayed in the menu when there are no valid results.
    Passing a falsy value will hide the menu if no matches are found. */
  var emptyLabel: js.UndefOr[String] = js.undefined
  
  /* Either an array of fields in option to search, or a custom filtering callback. */
  var filterBy: js.UndefOr[
    js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.undefined
  
  /* Whether or not to automatically adjust the position of the menu when it reaches the viewport boundaries. */
  var flip: js.UndefOr[Boolean] = js.undefined
  
  /* Highlights the menu item if there is only one result and allows selecting that item by hitting enter.
    Does not work with allowNew. */
  var highlightOnlyResult: js.UndefOr[Boolean] = js.undefined
  
  /* An html id attribute, required for assistive technologies such as screen readers. */
  var id: js.UndefOr[String | Double] = js.undefined
  
  /* Whether the filter should ignore accents and other diacritical marks. */
  var ignoreDiacritics: js.UndefOr[Boolean] = js.undefined
  
  /* Props to be applied directly to the input. onBlur, onChange, onFocus, and onKeyDown are ignored. */
  var inputProps: js.UndefOr[InputProps] = js.undefined
  
  /* Bootstrap 4 only. Adds the `is-invalid` classname to the `form-control`. */
  var isInvalid: js.UndefOr[Boolean] = js.undefined
  
  /* Indicate whether an asynchronous data fetch is happening. */
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  /* Bootstrap 4 only. Adds the `is-valid` classname to the `form-control`. */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /* Specify which option key to use for display or a render function.
    By default, the selector will use the label key. */
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  
  /* Maximum height of the dropdown menu. */
  var maxHeight: js.UndefOr[String] = js.undefined
  
  /* Maximum number of results to display by default. Mostly done for performance reasons
    so as not to render too many DOM nodes in the case of large data sets. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** @deprecated: Id applied to the top-level menu element. Required for accessibility. */
  var menuId: js.UndefOr[String] = js.undefined
  
  /* Number of input characters that must be entered before showing results. */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /* Whether or not multiple selections are allowed. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /* Provides the ability to specify a prefix before the user-entered text to indicate that the selection will be new. No-op unless allowNew={true}. */
  var newSelectionPrefix: js.UndefOr[String] = js.undefined
  
  /* Invoked when the input is blurred. Receives an event. */
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  /* Invoked whenever items are added or removed. Receives an array of the selected options. */
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.undefined
  
  /* Invoked when the input is focused. Receives an event. */
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  /* Invoked when the input value changes. Receives the string value of the input, as well as the original event. */
  var onInputChange: js.UndefOr[js.Function2[/* input */ String, /* e */ Event, Unit]] = js.undefined
  
  /* Invoked when a key is pressed. Receives an event. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  /** @deprecated: Invoked when the menu is hidden. */
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** @deprecated: Invoked when the menu is shown. */
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /*     Invoked when menu visibility changes. */
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
  
  /* Invoked when the pagination menu item is clicked. */
  var onPaginate: js.UndefOr[js.Function2[/* e */ Event, /* numResults */ Double, Unit]] = js.undefined
  
  /* Whether or not the menu should be displayed. undefined allows the component to control visibility,
    while true and false show and hide the menu, respectively. */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /* Full set of options, including any pre-selected options. */
  var options: js.Array[T]
  
  /* Give user the ability to display additional results if the number of results exceeds maxResults. */
  var paginate: js.UndefOr[Boolean] = js.undefined
  
  /* Prompt displayed when large data sets are paginated. */
  var paginationText: js.UndefOr[String] = js.undefined
  
  /* Placeholder text for the input. */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /* Whether to use fixed positioning for the menu, which is useful when rendering inside a
    container with overflow: hidden;. Uses absolute positioning by default. */
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  
  /* Callback for custom menu rendering. */
  var renderMenu: js.UndefOr[
    js.Function3[
      /* results */ js.Array[TypeaheadResult[T]], 
      /* menuProps */ TypeaheadMenuProps[T], 
      /* state */ TypeaheadState[T], 
      ReactNode
    ]
  ] = js.undefined
  
  /* Provides a hook for customized rendering of menu item contents. */
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      ReactNode
    ]
  ] = js.undefined
  
  /* Provides a hook for customized rendering of tokens when multiple selections are enabled. */
  var renderToken: js.UndefOr[
    js.Function3[/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double, ReactNode]
  ] = js.undefined
  
  /** @deprecated: Allows selecting the hinted result by pressing enter. */
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /* The selected option(s) displayed in the input. Use this prop if you want to control the component via its parent. */
  var selected: js.UndefOr[js.Array[T]] = js.undefined
}
object TypeaheadProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](options: js.Array[T]): TypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadPropsMutableBuilder[Self <: TypeaheadProps[?], T /* <: TypeaheadModel */] (val x: Self & TypeaheadProps[T]) extends AnyVal {
    
    @scala.inline
    def setA11yNumResults(value: () => Unit): Self = StObject.set(x, "a11yNumResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setA11yNumResultsUndefined: Self = StObject.set(x, "a11yNumResults", js.undefined)
    
    @scala.inline
    def setA11yNumSelected(value: () => Unit): Self = StObject.set(x, "a11yNumSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setA11yNumSelectedUndefined: Self = StObject.set(x, "a11yNumSelected", js.undefined)
    
    @scala.inline
    def setAlign(value: TypeaheadAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAllowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = StObject.set(x, "allowNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = StObject.set(x, "allowNew", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowNewUndefined: Self = StObject.set(x, "allowNew", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBodyContainer(value: Boolean): Self = StObject.set(x, "bodyContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyContainerUndefined: Self = StObject.set(x, "bodyContainer", js.undefined)
    
    @scala.inline
    def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    @scala.inline
    def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultSelected(value: js.Array[T]): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
    
    @scala.inline
    def setDefaultSelectedVarargs(value: T*): Self = StObject.set(x, "defaultSelected", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
    
    @scala.inline
    def setEmptyLabel(value: String): Self = StObject.set(x, "emptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    @scala.inline
    def setFilterBy(
      value: js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterByFunction2(value: (/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    @scala.inline
    def setFilterByVarargs(value: String*): Self = StObject.set(x, "filterBy", js.Array(value :_*))
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setHighlightOnlyResult(value: Boolean): Self = StObject.set(x, "highlightOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOnlyResultUndefined: Self = StObject.set(x, "highlightOnlyResult", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoreDiacritics(value: Boolean): Self = StObject.set(x, "ignoreDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDiacriticsUndefined: Self = StObject.set(x, "ignoreDiacritics", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    @scala.inline
    def setIsInvalid(value: Boolean): Self = StObject.set(x, "isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvalidUndefined: Self = StObject.set(x, "isInvalid", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setNewSelectionPrefix(value: String): Self = StObject.set(x, "newSelectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSelectionPrefixUndefined: Self = StObject.set(x, "newSelectionPrefix", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: (/* input */ String, /* e */ Event) => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMenuHide(value: () => Unit): Self = StObject.set(x, "onMenuHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMenuHideUndefined: Self = StObject.set(x, "onMenuHide", js.undefined)
    
    @scala.inline
    def setOnMenuShow(value: () => Unit): Self = StObject.set(x, "onMenuShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMenuShowUndefined: Self = StObject.set(x, "onMenuShow", js.undefined)
    
    @scala.inline
    def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = StObject.set(x, "onMenuToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMenuToggleUndefined: Self = StObject.set(x, "onMenuToggle", js.undefined)
    
    @scala.inline
    def setOnPaginate(value: (/* e */ Event, /* numResults */ Double) => Unit): Self = StObject.set(x, "onPaginate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPaginateUndefined: Self = StObject.set(x, "onPaginate", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setPaginationText(value: String): Self = StObject.set(x, "paginationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTextUndefined: Self = StObject.set(x, "paginationText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
    
    @scala.inline
    def setRenderMenu(
      value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ TypeaheadMenuProps[T], /* state */ TypeaheadState[T]) => ReactNode
    ): Self = StObject.set(x, "renderMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "renderMenuItemChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderMenuItemChildrenUndefined: Self = StObject.set(x, "renderMenuItemChildren", js.undefined)
    
    @scala.inline
    def setRenderMenuUndefined: Self = StObject.set(x, "renderMenu", js.undefined)
    
    @scala.inline
    def setRenderToken(value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderTokenUndefined: Self = StObject.set(x, "renderToken", js.undefined)
    
    @scala.inline
    def setSelectHintOnEnter(value: Boolean): Self = StObject.set(x, "selectHintOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectHintOnEnterUndefined: Self = StObject.set(x, "selectHintOnEnter", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value :_*))
  }
}
