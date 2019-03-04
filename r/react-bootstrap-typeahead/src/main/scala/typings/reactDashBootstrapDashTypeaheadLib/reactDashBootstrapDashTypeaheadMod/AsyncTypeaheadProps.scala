package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  /* 	Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: scala.Boolean
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
  /* Callback to perform when the search is executed. */
  def onSearch(query: java.lang.String): scala.Unit
}

object AsyncTypeaheadProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    isLoading: scala.Boolean,
    onSearch: js.Function1[java.lang.String, scala.Unit],
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
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    emptyLabel: java.lang.String = null,
    filterBy: js.Array[java.lang.String] | (js.Function2[T, /* props */ AllTypeaheadOwnAndInjectedProps[T], scala.Boolean]) = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    highlightOnlyResult: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDiacritics: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: InputProps = null,
    isInvalid: js.UndefOr[scala.Boolean] = js.undefined,
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
    promptText: reactLib.reactMod.ReactNs.ReactNode = null,
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
      T, 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    searchText: reactLib.reactMod.ReactNs.ReactNode = null,
    selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.Array[T] = null,
    useCache: js.UndefOr[scala.Boolean] = js.undefined
  ): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading, onSearch = onSearch, options = options)
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
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(highlightOnlyResult)) __obj.updateDynamic("highlightOnlyResult")(highlightOnlyResult)
    if (!js.isUndefined(ignoreDiacritics)) __obj.updateDynamic("ignoreDiacritics")(ignoreDiacritics)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid)
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
    if (promptText != null) __obj.updateDynamic("promptText")(promptText.asInstanceOf[js.Any])
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(renderMenu)
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(renderMenuItemChildren)
    if (renderToken != null) __obj.updateDynamic("renderToken")(renderToken)
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
}

