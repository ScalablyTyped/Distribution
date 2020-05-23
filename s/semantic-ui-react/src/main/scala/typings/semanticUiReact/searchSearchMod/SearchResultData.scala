package typings.semanticUiReact.searchSearchMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.inputInputMod.InputProps
import typings.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typings.semanticUiReact.searchResultMod.SearchResultProps
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLDivElement
import typings.std.HTMLElement
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
    aligned: String = null,
    as: js.Any = null,
    category: js.UndefOr[Boolean] = js.undefined,
    categoryLayoutRenderer: /* props */ SearchCategoryProps => ReactElement = null,
    categoryRenderer: /* props */ SearchCategoryProps => ReactElement = null,
    className: String = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    input: SemanticShorthandItem[InputProps] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    minCharacters: js.UndefOr[Double] = js.undefined,
    noResultsDescription: ReactNode = null,
    noResultsMessage: ReactNode = null,
    onBlur: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit = null,
    onFocus: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit = null,
    onMouseDown: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit = null,
    onResultSelect: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultData) => Unit = null,
    onSearchChange: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit = null,
    onSelectionChange: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchResultData) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    resultRenderer: /* props */ SearchResultProps => ReactElement = null,
    results: js.Array[_] | js.Object = null,
    selectFirstResult: js.UndefOr[Boolean] = js.undefined,
    showNoResults: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    value: String = null
  ): SearchResultData = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (aligned != null) __obj.updateDynamic("aligned")(aligned.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.get.asInstanceOf[js.Any])
    if (categoryLayoutRenderer != null) __obj.updateDynamic("categoryLayoutRenderer")(js.Any.fromFunction1(categoryLayoutRenderer))
    if (categoryRenderer != null) __obj.updateDynamic("categoryRenderer")(js.Any.fromFunction1(categoryRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCharacters)) __obj.updateDynamic("minCharacters")(minCharacters.get.asInstanceOf[js.Any])
    if (noResultsDescription != null) __obj.updateDynamic("noResultsDescription")(noResultsDescription.asInstanceOf[js.Any])
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onResultSelect != null) __obj.updateDynamic("onResultSelect")(js.Any.fromFunction2(onResultSelect))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (resultRenderer != null) __obj.updateDynamic("resultRenderer")(js.Any.fromFunction1(resultRenderer))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultData]
  }
}

