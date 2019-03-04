package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultData extends SearchProps {
  var result: js.Any
}

object SearchResultData {
  @scala.inline
  def apply(
    result: js.Any,
    aligned: java.lang.String = null,
    as: js.Any = null,
    category: js.UndefOr[scala.Boolean] = js.undefined,
    categoryRenderer: js.Function1[
      /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ] = null,
    className: java.lang.String = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any = null,
    input: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps] = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    minCharacters: scala.Int | scala.Double = null,
    noResultsDescription: reactLib.reactMod.ReactNs.ReactNode = null,
    noResultsMessage: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ] = null,
    onFocus: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ] = null,
    onResultSelect: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultData, 
      scala.Unit
    ] = null,
    onSearchChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ] = null,
    onSelectionChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultData, 
      scala.Unit
    ] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    resultRenderer: js.Function1[
      /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ] = null,
    results: js.Array[_] | js.Object = null,
    selectFirstResult: js.UndefOr[scala.Boolean] = js.undefined,
    showNoResults: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null,
    value: java.lang.String = null
  ): SearchResultData = {
    val __obj = js.Dynamic.literal(result = result)
    if (aligned != null) __obj.updateDynamic("aligned")(aligned)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category)
    if (categoryRenderer != null) __obj.updateDynamic("categoryRenderer")(categoryRenderer)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (noResultsDescription != null) __obj.updateDynamic("noResultsDescription")(noResultsDescription.asInstanceOf[js.Any])
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onResultSelect != null) __obj.updateDynamic("onResultSelect")(onResultSelect)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(onSearchChange)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (resultRenderer != null) __obj.updateDynamic("resultRenderer")(resultRenderer)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult)
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchResultData]
  }
}

