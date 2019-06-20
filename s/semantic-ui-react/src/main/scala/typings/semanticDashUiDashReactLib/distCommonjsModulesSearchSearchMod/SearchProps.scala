package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProps
  extends StrictSearchProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SearchProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    aligned: java.lang.String = null,
    as: js.Any = null,
    category: js.UndefOr[scala.Boolean] = js.undefined,
    categoryRenderer: /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps => reactLib.reactMod.ReactElement = null,
    className: java.lang.String = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any = null,
    input: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps] = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    minCharacters: scala.Int | scala.Double = null,
    noResultsDescription: reactLib.reactMod.ReactNode = null,
    noResultsMessage: reactLib.reactMod.ReactNode = null,
    onBlur: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onFocus: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onMouseDown: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onResultSelect: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ SearchResultData) => scala.Unit = null,
    onSearchChange: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onSelectionChange: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchResultData) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    resultRenderer: /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps => reactLib.reactMod.ReactElement = null,
    results: js.Array[_] | js.Object = null,
    selectFirstResult: js.UndefOr[scala.Boolean] = js.undefined,
    showNoResults: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null,
    value: java.lang.String = null
  ): SearchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aligned != null) __obj.updateDynamic("aligned")(aligned)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category)
    if (categoryRenderer != null) __obj.updateDynamic("categoryRenderer")(js.Any.fromFunction1(categoryRenderer))
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onResultSelect != null) __obj.updateDynamic("onResultSelect")(js.Any.fromFunction2(onResultSelect))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (resultRenderer != null) __obj.updateDynamic("resultRenderer")(js.Any.fromFunction1(resultRenderer))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult)
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchProps]
  }
}

