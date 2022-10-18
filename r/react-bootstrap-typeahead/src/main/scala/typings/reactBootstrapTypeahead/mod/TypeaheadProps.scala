package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadProps[T /* <: TypeaheadModel */] extends StObject {
  
  /* Specify menu alignment. The default value is justify, which makes the menu as wide as the input and truncates long values.
    Specifying left or right will align the menu to that side and the width will be determined by the length of menu item values. */
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  
  /* Specifies whether or not arbitrary, user-defined options may be added to the result set. New entries will be included
    when the trimmed input is truthy and there is no exact match in the result set.
    If a function is specified, allows for a callback to decide whether the new entry menu item should be included in the results
    list. The callback should return a boolean value: */
  var allowNew: js.UndefOr[
    Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.undefined
  
  /* Autofocus the input when the component initially mounts. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /* Whether or not filtering should be case-sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode | (js.Function1[/* props */ Any, ReactNode])] = js.undefined
  
  /* ClassName to Apply */
  var className: js.UndefOr[String] = js.undefined
  
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
  var emptyLabel: js.UndefOr[ReactNode] = js.undefined
  
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
  
  /* Maximum number of results to display by default. Mostly done for performance reasons
    so as not to render too many DOM nodes in the case of large data sets. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /* Number of input characters that must be entered before showing results. */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /* Whether or not multiple selections are allowed. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /* Override default new selection text. */
  var newSelectionPrefix: js.UndefOr[Element | String] = js.undefined
  
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
  
  /*     Invoked when menu visibility changes. */
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
  
  /* Invoked when the pagination menu item is clicked. */
  var onPaginate: js.UndefOr[js.Function2[/* e */ Event, /* numResults */ Double, Unit]] = js.undefined
  
  /* Whether or not the menu should be displayed. undefined allows the component to control visibility,
    while true and false show and hide the menu, respectively. */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /* Full set of options, including any pre-selected options. Must either be an array of objects (recommended) or strings. */
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
  
  var renderInput: js.UndefOr[
    js.Function2[
      /* inputProps */ InputContainerPropsSingle[T], 
      /* state */ TypeaheadState[T], 
      ReactNode
    ]
  ] = js.undefined
  
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
    js.Function3[/* selectedItem */ T, /* props */ TokenProps, /* index */ Double, ReactNode]
  ] = js.undefined
  
  /** @deprecated: Allows selecting the hinted result by pressing enter. */
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /* The selected option(s) displayed in the input. Use this prop if you want to control the component via its parent. */
  var selected: js.UndefOr[js.Array[T]] = js.undefined
  
  /* Specify the size of the input. */
  var size: js.UndefOr[TypeaheadBsSizes] = js.undefined
}
object TypeaheadProps {
  
  inline def apply[T /* <: TypeaheadModel */](options: js.Array[T]): TypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps[T]]
  }
  
  extension [Self <: TypeaheadProps[?], T /* <: TypeaheadModel */](x: Self & TypeaheadProps[T]) {
    
    inline def setAlign(value: TypeaheadAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAllowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = StObject.set(x, "allowNew", value.asInstanceOf[js.Any])
    
    inline def setAllowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = StObject.set(x, "allowNew", js.Any.fromFunction2(value))
    
    inline def setAllowNewUndefined: Self = StObject.set(x, "allowNew", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChildren(value: ReactNode | (js.Function1[/* props */ Any, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
    
    inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    inline def setDefaultSelected(value: js.Array[T]): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
    
    inline def setDefaultSelectedVarargs(value: T*): Self = StObject.set(x, "defaultSelected", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
    
    inline def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
    
    inline def setEmptyLabel(value: ReactNode): Self = StObject.set(x, "emptyLabel", value.asInstanceOf[js.Any])
    
    inline def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    inline def setFilterBy(
      value: js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    inline def setFilterByFunction2(value: (/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterByVarargs(value: String*): Self = StObject.set(x, "filterBy", js.Array(value*))
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setHighlightOnlyResult(value: Boolean): Self = StObject.set(x, "highlightOnlyResult", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnlyResultUndefined: Self = StObject.set(x, "highlightOnlyResult", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreDiacritics(value: Boolean): Self = StObject.set(x, "ignoreDiacritics", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDiacriticsUndefined: Self = StObject.set(x, "ignoreDiacritics", js.undefined)
    
    inline def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setIsInvalid(value: Boolean): Self = StObject.set(x, "isInvalid", value.asInstanceOf[js.Any])
    
    inline def setIsInvalidUndefined: Self = StObject.set(x, "isInvalid", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setNewSelectionPrefix(value: Element | String): Self = StObject.set(x, "newSelectionPrefix", value.asInstanceOf[js.Any])
    
    inline def setNewSelectionPrefixUndefined: Self = StObject.set(x, "newSelectionPrefix", js.undefined)
    
    inline def setOnBlur(value: /* e */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: /* e */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInputChange(value: (/* input */ String, /* e */ Event) => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
    
    inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = StObject.set(x, "onMenuToggle", js.Any.fromFunction1(value))
    
    inline def setOnMenuToggleUndefined: Self = StObject.set(x, "onMenuToggle", js.undefined)
    
    inline def setOnPaginate(value: (/* e */ Event, /* numResults */ Double) => Unit): Self = StObject.set(x, "onPaginate", js.Any.fromFunction2(value))
    
    inline def setOnPaginateUndefined: Self = StObject.set(x, "onPaginate", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setPaginationText(value: String): Self = StObject.set(x, "paginationText", value.asInstanceOf[js.Any])
    
    inline def setPaginationTextUndefined: Self = StObject.set(x, "paginationText", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
    
    inline def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
    
    inline def setRenderInput(value: (/* inputProps */ InputContainerPropsSingle[T], /* state */ TypeaheadState[T]) => ReactNode): Self = StObject.set(x, "renderInput", js.Any.fromFunction2(value))
    
    inline def setRenderInputUndefined: Self = StObject.set(x, "renderInput", js.undefined)
    
    inline def setRenderMenu(
      value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ TypeaheadMenuProps[T], /* state */ TypeaheadState[T]) => ReactNode
    ): Self = StObject.set(x, "renderMenu", js.Any.fromFunction3(value))
    
    inline def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "renderMenuItemChildren", js.Any.fromFunction3(value))
    
    inline def setRenderMenuItemChildrenUndefined: Self = StObject.set(x, "renderMenuItemChildren", js.undefined)
    
    inline def setRenderMenuUndefined: Self = StObject.set(x, "renderMenu", js.undefined)
    
    inline def setRenderToken(value: (/* selectedItem */ T, /* props */ TokenProps, /* index */ Double) => ReactNode): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
    
    inline def setRenderTokenUndefined: Self = StObject.set(x, "renderToken", js.undefined)
    
    inline def setSelectHintOnEnter(value: Boolean): Self = StObject.set(x, "selectHintOnEnter", value.asInstanceOf[js.Any])
    
    inline def setSelectHintOnEnterUndefined: Self = StObject.set(x, "selectHintOnEnter", js.undefined)
    
    inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSize(value: TypeaheadBsSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
