package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOnSearchChangeData extends DropdownProps {
  @JSName("searchQuery")
  var searchQuery_DropdownOnSearchChangeData: java.lang.String
}

object DropdownOnSearchChangeData {
  @scala.inline
  def apply(
    searchQuery: java.lang.String,
    additionLabel: scala.Double | java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    additionPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    allowAdditions: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    button: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    clearable: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    deburr: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultSearchQuery: java.lang.String = null,
    defaultSelectedLabel: scala.Double | java.lang.String = null,
    defaultUpward: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String | scala.Boolean]) = null,
    direction: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    header: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: js.Any = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    item: js.UndefOr[scala.Boolean] = js.undefined,
    labeled: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoad: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    minCharacters: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    noResultsMessage: reactLib.reactMod.ReactNs.ReactNode = null,
    onAddItem: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onBlur: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onClose: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onFocus: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onLabelClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps, 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onOpen: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ] = null,
    onSearchChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownOnSearchChangeData, 
      scala.Unit
    ] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.Array[
      semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
    ] = null,
    placeholder: java.lang.String = null,
    pointing: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`) = null,
    renderLabel: js.Function3[
      /* item */ semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps, 
      /* index */ scala.Double, 
      /* defaultLabelProps */ semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps, 
      _
    ] = null,
    scrolling: js.UndefOr[scala.Boolean] = js.undefined,
    search: scala.Boolean | (js.Function2[
      /* options */ js.Array[
        semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
      ], 
      /* value */ java.lang.String, 
      js.Array[
        semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
      ]
    ]) = null,
    searchInput: js.Any = null,
    selectOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    selectOnNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    selectedLabel: scala.Double | java.lang.String = null,
    selection: js.Any = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Double | java.lang.String = null,
    text: java.lang.String = null,
    trigger: reactLib.reactMod.ReactNs.ReactNode = null,
    upward: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Boolean | scala.Double | java.lang.String | (js.Array[scala.Boolean | scala.Double | java.lang.String]) = null,
    wrapSelection: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownOnSearchChangeData = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery)
    if (additionLabel != null) __obj.updateDynamic("additionLabel")(additionLabel.asInstanceOf[js.Any])
    if (additionPosition != null) __obj.updateDynamic("additionPosition")(additionPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdditions)) __obj.updateDynamic("allowAdditions")(allowAdditions)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable)
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur)
    if (!js.isUndefined(closeOnChange)) __obj.updateDynamic("closeOnChange")(closeOnChange)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(deburr)) __obj.updateDynamic("deburr")(deburr)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultSearchQuery != null) __obj.updateDynamic("defaultSearchQuery")(defaultSearchQuery)
    if (defaultSelectedLabel != null) __obj.updateDynamic("defaultSelectedLabel")(defaultSelectedLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultUpward)) __obj.updateDynamic("defaultUpward")(defaultUpward)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item)
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled)
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.asInstanceOf[js.Any])
    if (onAddItem != null) __obj.updateDynamic("onAddItem")(onAddItem)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onLabelClick != null) __obj.updateDynamic("onLabelClick")(onLabelClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(onSearchChange)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus)
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pointing != null) __obj.updateDynamic("pointing")(pointing.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(renderLabel)
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling)
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput)
    if (!js.isUndefined(selectOnBlur)) __obj.updateDynamic("selectOnBlur")(selectOnBlur)
    if (!js.isUndefined(selectOnNavigation)) __obj.updateDynamic("selectOnNavigation")(selectOnNavigation)
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(upward)) __obj.updateDynamic("upward")(upward)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapSelection)) __obj.updateDynamic("wrapSelection")(wrapSelection)
    __obj.asInstanceOf[DropdownOnSearchChangeData]
  }
}

