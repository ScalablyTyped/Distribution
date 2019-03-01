package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadProps[T /* <: TypeaheadModel */] extends js.Object {
  /* For localized accessibility: Should return a string indicating the number of results for screen readers.
    Receives the current results. */
  var a11yNumResults: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* For localized accessibility: Should return a string indicating the number of selections for screen readers.
    Receives the current selections. */
  var a11yNumSelected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Specify menu alignment. The default value is justify, which makes the menu as wide as the input and truncates long values.
    Specifying left or right will align the menu to that side and the width will be determined by the length of menu item values. */
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  /* Allows the creation of new selections on the fly. Any new items will be added to the list of selections,
    but not the list of original options unless handled as such by Typeahead's parent.
    The newly added item will always be returned as an object even if the other options are simply strings,
    so be sure your onChange callback can handle this. */
  var allowNew: js.UndefOr[scala.Boolean] = js.undefined
  /* Autofocus the input when the component initially mounts. */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /* Whether to render the menu inline or attach to document.body. */
  var bodyContainer: js.UndefOr[scala.Boolean] = js.undefined
  /* Specify the size of the input. */
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  /* Whether or not filtering should be case-sensitive. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /* Displays a button to clear the input when there are selections. */
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  /* The initial value displayed in the text input. */
  var defaultInputValue: js.UndefOr[java.lang.String] = js.undefined
  /* Whether or not the menu is displayed upon initial render. */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /* Specify any pre-selected options. Use only if you want the component to be uncontrolled. */
  var defaultSelected: js.UndefOr[js.Array[T]] = js.undefined
  /* Whether to disable the input. Will also disable selections when multiple={true}. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Specify whether the menu should appear above the input. */
  var dropup: js.UndefOr[scala.Boolean] = js.undefined
  /* Message displayed in the menu when there are no valid results.
    Passing a falsy value will hide the menu if no matches are found. */
  var emptyLabel: js.UndefOr[java.lang.String] = js.undefined
  /* Either an array of fields in option to search, or a custom filtering callback. */
  var filterBy: js.UndefOr[
    js.Array[java.lang.String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], scala.Boolean])
  ] = js.undefined
  /* Whether or not to automatically adjust the position of the menu when it reaches the viewport boundaries. */
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  /* Highlights the menu item if there is only one result and allows selecting that item by hitting enter.
    Does not work with allowNew. */
  var highlightOnlyResult: js.UndefOr[scala.Boolean] = js.undefined
  /* Whether the filter should ignore accents and other diacritical marks. */
  var ignoreDiacritics: js.UndefOr[scala.Boolean] = js.undefined
  /* Props to be applied directly to the input. onBlur, onChange, onFocus, and onKeyDown are ignored. */
  var inputProps: js.UndefOr[InputProps] = js.undefined
  /* Bootstrap 4 only. Adds the `is-invalid` classname to the `form-control`. */
  var isInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /* Indicate whether an asynchronous data fetch is happening. */
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  /* Bootstrap 4 only. Adds the `is-valid` classname to the `form-control`. */
  var isValid: js.UndefOr[scala.Boolean] = js.undefined
  /* Specify which option key to use for display or a render function.
    By default, the selector will use the label key. */
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  /* Maximum height of the dropdown menu. */
  var maxHeight: js.UndefOr[java.lang.String] = js.undefined
  /* Maximum number of results to display by default. Mostly done for performance reasons
    so as not to render too many DOM nodes in the case of large data sets. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /* Id applied to the top-level menu element. Required for accessibility. */
  var menuId: js.UndefOr[java.lang.String] = js.undefined
  /* Number of input characters that must be entered before showing results. */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /* Whether or not multiple selections are allowed. */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /* Provides the ability to specify a prefix before the user-entered text to indicate that the selection will be new. No-op unless allowNew={true}. */
  var newSelectionPrefix: js.UndefOr[java.lang.String] = js.undefined
  /* Invoked when the input is blurred. Receives an event. */
  var onBlur: js.UndefOr[js.Function1[/* e */ reactLib.Event, scala.Unit]] = js.undefined
  /* Invoked whenever items are added or removed. Receives an array of the selected options. */
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], scala.Unit]] = js.undefined
  /* Invoked when the input is focused. Receives an event. */
  var onFocus: js.UndefOr[js.Function1[/* e */ reactLib.Event, scala.Unit]] = js.undefined
  /* Invoked when the input value changes. Receives the string value of the input, as well as the original event. */
  var onInputChange: js.UndefOr[js.Function2[/* input */ java.lang.String, /* e */ reactLib.Event, scala.Unit]] = js.undefined
  /* Invoked when a key is pressed. Receives an event. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ reactLib.Event, scala.Unit]] = js.undefined
  /* DEPRECATED: Invoked when the menu is hidden. */
  var onMenuHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* DEPRECATED: Invoked when the menu is shown. */
  var onMenuShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* 	Invoked when menu visibility changes. */
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ scala.Boolean, scala.Unit]] = js.undefined
  /* Invoked when the pagination menu item is clicked. */
  var onPaginate: js.UndefOr[js.Function2[/* e */ reactLib.Event, /* numResults */ scala.Double, scala.Unit]] = js.undefined
  /* Whether or not the menu should be displayed. undefined allows the component to control visibility,
    while true and false show and hide the menu, respectively. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /* Full set of options, including any pre-selected options. */
  var options: js.Array[T]
  /* Give user the ability to display additional results if the number of results exceeds maxResults. */
  var paginate: js.UndefOr[scala.Boolean] = js.undefined
  /* Prompt displayed when large data sets are paginated. */
  var paginationText: js.UndefOr[java.lang.String] = js.undefined
  /* Placeholder text for the input. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /* Callback for custom menu rendering. */
  var renderMenu: js.UndefOr[
    js.Function2[
      /* results */ js.Array[TypeaheadResult[T]], 
      /* menuProps */ js.Any, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /* Provides a hook for customized rendering of menu item contents. */
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /* Provides a hook for customized rendering of tokens when multiple selections are enabled. */
  var renderToken: js.UndefOr[
    js.Function3[
      /* selectedItem */ T, 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /* Allows selecting the hinted result by pressing enter. */
  var selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /* The selected option(s) displayed in the input. Use this prop if you want to control the component via its parent. */
  var selected: js.UndefOr[js.Array[T]] = js.undefined
}

object TypeaheadProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    options: js.Array[T],
    a11yNumResults: js.Function0[scala.Unit] = null,
    a11yNumSelected: js.Function0[scala.Unit] = null,
    align: TypeaheadAlign = null,
    allowNew: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    bodyContainer: js.UndefOr[scala.Boolean] = js.undefined,
    bsSize: TypeaheadBsSizes = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    defaultInputValue: java.lang.String = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultSelected: js.Array[T] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    emptyLabel: java.lang.String = null,
    filterBy: js.Array[java.lang.String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], scala.Boolean]) = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    highlightOnlyResult: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDiacritics: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: InputProps = null,
    isInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.UndefOr[scala.Boolean] = js.undefined,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    menuId: java.lang.String = null,
    minLength: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    newSelectionPrefix: java.lang.String = null,
    onBlur: js.Function1[/* e */ reactLib.Event, scala.Unit] = null,
    onChange: js.Function1[/* selected */ js.Array[T], scala.Unit] = null,
    onFocus: js.Function1[/* e */ reactLib.Event, scala.Unit] = null,
    onInputChange: js.Function2[/* input */ java.lang.String, /* e */ reactLib.Event, scala.Unit] = null,
    onKeyDown: js.Function1[/* e */ reactLib.Event, scala.Unit] = null,
    onMenuHide: js.Function0[scala.Unit] = null,
    onMenuShow: js.Function0[scala.Unit] = null,
    onMenuToggle: js.Function1[/* show */ scala.Boolean, scala.Unit] = null,
    onPaginate: js.Function2[/* e */ reactLib.Event, /* numResults */ scala.Double, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    paginate: js.UndefOr[scala.Boolean] = js.undefined,
    paginationText: java.lang.String = null,
    placeholder: java.lang.String = null,
    renderMenu: js.Function2[
      /* results */ js.Array[TypeaheadResult[T]], 
      /* menuProps */ js.Any, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderMenuItemChildren: js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderToken: js.Function3[
      /* selectedItem */ T, 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.Array[T] = null
  ): TypeaheadProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    if (a11yNumResults != null) __obj.updateDynamic("a11yNumResults")(a11yNumResults)
    if (a11yNumSelected != null) __obj.updateDynamic("a11yNumSelected")(a11yNumSelected)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowNew)) __obj.updateDynamic("allowNew")(allowNew)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(bodyContainer)) __obj.updateDynamic("bodyContainer")(bodyContainer)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(highlightOnlyResult)) __obj.updateDynamic("highlightOnlyResult")(highlightOnlyResult)
    if (!js.isUndefined(ignoreDiacritics)) __obj.updateDynamic("ignoreDiacritics")(ignoreDiacritics)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(onInputChange)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onMenuHide != null) __obj.updateDynamic("onMenuHide")(onMenuHide)
    if (onMenuShow != null) __obj.updateDynamic("onMenuShow")(onMenuShow)
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(onMenuToggle)
    if (onPaginate != null) __obj.updateDynamic("onPaginate")(onPaginate)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate)
    if (paginationText != null) __obj.updateDynamic("paginationText")(paginationText)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(renderMenu)
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(renderMenuItemChildren)
    if (renderToken != null) __obj.updateDynamic("renderToken")(renderToken)
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[TypeaheadProps[T]]
  }
}

