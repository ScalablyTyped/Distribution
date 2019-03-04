package typings
package reactDashMdLib.libAutocompletesAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteProps
  extends reactDashMdLib.libMenusMenuMod.BaseMenuProps {
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autocompleteWithLabel: js.UndefOr[scala.Boolean] = js.undefined
  var clearOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var customSize: js.UndefOr[java.lang.String] = js.undefined
  var data: DataType
  var dataLabel: js.UndefOr[java.lang.String] = js.undefined
  var dataValue: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var deleteKeys: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    scala.Null | (js.Function3[
      /* data */ DataType, 
      /* filterText */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      js.Array[java.lang.String]
    ])
  ] = js.undefined
  var findInlineSuggestion: js.UndefOr[
    js.Function3[
      /* data */ DataType, 
      /* value */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var focusInputOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var helpText: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIndicator: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var inlineSuggestionClassName: js.UndefOr[java.lang.String] = js.undefined
  var inlineSuggestionPadding: js.UndefOr[scala.Double] = js.undefined
  var inlineSuggestionStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var menuId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onAutocomplete: js.UndefOr[
    js.Function3[
      /* suggestion */ java.lang.String | scala.Double, 
      /* suggestionIndex */ scala.Double, 
      /* matches */ DataType, 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuClose: js.UndefOr[js.Function] = js.undefined
  var onMenuOpen: js.UndefOr[js.Function] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var showUnfilteredData: js.UndefOr[scala.Boolean] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object AutocompleteProps {
  @scala.inline
  def apply(
    data: DataType,
    anchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    autoComplete: java.lang.String = null,
    autocompleteWithLabel: js.UndefOr[scala.Boolean] = js.undefined,
    belowAnchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clearOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    customSize: java.lang.String = null,
    dataLabel: java.lang.String = null,
    dataValue: java.lang.String = null,
    defaultValue: java.lang.String | scala.Double = null,
    deleteKeys: java.lang.String | js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportWidth: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Function3[
      /* data */ DataType, 
      /* filterText */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      js.Array[java.lang.String]
    ] = null,
    findInlineSuggestion: js.Function3[
      /* data */ DataType, 
      /* value */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      java.lang.String | scala.Double
    ] = null,
    fixedTo: js.Object | reactDashMdLib.Anon_X = null,
    focusInputOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    helpText: java.lang.String = null,
    id: reactDashMdLib.libMod.IdPropType = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIndicator: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    inlineSuggestionClassName: java.lang.String = null,
    inlineSuggestionPadding: scala.Int | scala.Double = null,
    inlineSuggestionStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inputClassName: java.lang.String = null,
    inputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    listClassName: java.lang.String = null,
    listHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    listId: reactDashMdLib.libMod.IdPropType = null,
    listInline: js.UndefOr[scala.Boolean] = js.undefined,
    listProps: js.Object = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    listZDepth: scala.Int | scala.Double = null,
    menuId: reactDashMdLib.libMod.IdPropType = null,
    minBottom: scala.Double | java.lang.String = null,
    minLeft: scala.Double | java.lang.String = null,
    minRight: scala.Double | java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    onAutocomplete: js.Function3[
      /* suggestion */ java.lang.String | scala.Double, 
      /* suggestionIndex */ scala.Double, 
      /* matches */ DataType, 
      scala.Unit
    ] = null,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onChange: js.Function2[
      /* value */ java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement], 
      scala.Unit
    ] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnter: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragExit: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragLeave: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragOver: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDrop: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMenuClose: js.Function = null,
    onMenuOpen: js.Function = null,
    onMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOut: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    placeholder: java.lang.String = null,
    position: reactDashMdLib.libHelpersLayoverMod.LayoverPositions = null,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    sameWidth: js.UndefOr[scala.Boolean] = js.undefined,
    showUnfilteredData: js.UndefOr[scala.Boolean] = js.undefined,
    simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    textFieldClassName: java.lang.String = null,
    textFieldStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    toolbar: js.UndefOr[scala.Boolean] = js.undefined,
    total: scala.Int | scala.Double = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    value: java.lang.String | scala.Double = null,
    xThreshold: scala.Int | scala.Double = null,
    yThreshold: scala.Int | scala.Double = null
  ): AutocompleteProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autocompleteWithLabel)) __obj.updateDynamic("autocompleteWithLabel")(autocompleteWithLabel)
    if (belowAnchor != null) __obj.updateDynamic("belowAnchor")(belowAnchor)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearOnAutocomplete)) __obj.updateDynamic("clearOnAutocomplete")(clearOnAutocomplete)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (customSize != null) __obj.updateDynamic("customSize")(customSize)
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel)
    if (dataValue != null) __obj.updateDynamic("dataValue")(dataValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fillViewportHeight)) __obj.updateDynamic("fillViewportHeight")(fillViewportHeight)
    if (!js.isUndefined(fillViewportWidth)) __obj.updateDynamic("fillViewportWidth")(fillViewportWidth)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (findInlineSuggestion != null) __obj.updateDynamic("findInlineSuggestion")(findInlineSuggestion)
    if (fixedTo != null) __obj.updateDynamic("fixedTo")(fixedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnAutocomplete)) __obj.updateDynamic("focusInputOnAutocomplete")(focusInputOnAutocomplete)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (!js.isUndefined(helpOnFocus)) __obj.updateDynamic("helpOnFocus")(helpOnFocus)
    if (helpText != null) __obj.updateDynamic("helpText")(helpText)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inlineIndicator != null) __obj.updateDynamic("inlineIndicator")(inlineIndicator)
    if (inlineSuggestionClassName != null) __obj.updateDynamic("inlineSuggestionClassName")(inlineSuggestionClassName)
    if (inlineSuggestionPadding != null) __obj.updateDynamic("inlineSuggestionPadding")(inlineSuggestionPadding.asInstanceOf[js.Any])
    if (inlineSuggestionStyle != null) __obj.updateDynamic("inlineSuggestionStyle")(inlineSuggestionStyle)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (!js.isUndefined(listHeightRestricted)) __obj.updateDynamic("listHeightRestricted")(listHeightRestricted)
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(listInline)) __obj.updateDynamic("listInline")(listInline)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (listZDepth != null) __obj.updateDynamic("listZDepth")(listZDepth.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (minBottom != null) __obj.updateDynamic("minBottom")(minBottom.asInstanceOf[js.Any])
    if (minLeft != null) __obj.updateDynamic("minLeft")(minLeft.asInstanceOf[js.Any])
    if (minRight != null) __obj.updateDynamic("minRight")(minRight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAutocomplete != null) __obj.updateDynamic("onAutocomplete")(onAutocomplete)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMenuClose != null) __obj.updateDynamic("onMenuClose")(onMenuClose)
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(onMenuOpen)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (!js.isUndefined(sameWidth)) __obj.updateDynamic("sameWidth")(sameWidth)
    if (!js.isUndefined(showUnfilteredData)) __obj.updateDynamic("showUnfilteredData")(showUnfilteredData)
    if (!js.isUndefined(simplifiedMenu)) __obj.updateDynamic("simplifiedMenu")(simplifiedMenu)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textFieldClassName != null) __obj.updateDynamic("textFieldClassName")(textFieldClassName)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (xThreshold != null) __obj.updateDynamic("xThreshold")(xThreshold.asInstanceOf[js.Any])
    if (yThreshold != null) __obj.updateDynamic("yThreshold")(yThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteProps]
  }
}

