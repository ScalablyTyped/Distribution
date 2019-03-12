package typings
package rcDashSelectLib.rcDashSelectMod.RcSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var choiceTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var combobox: js.UndefOr[scala.Boolean] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined
  var defaultLabel: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var dropdownStyle: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var filterOption: js.UndefOr[scala.Boolean] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[stdLib.Node]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* trigger */ stdLib.Node, stdLib.Node]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labelInValue: js.UndefOr[scala.Boolean] = js.undefined
  var maxTagCount: js.UndefOr[scala.Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | js.Function] = js.undefined
  var maxTagTextLength: js.UndefOr[scala.Double] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var notFoundContent: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* label */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function2[/* value */ java.lang.String, /* option */ Option, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ java.lang.String, /* ontion */ Option, scala.Unit]] = js.undefined
  var optionFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showAction: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[scala.Boolean] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    animation: java.lang.String = null,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    combobox: js.UndefOr[scala.Boolean] = js.undefined,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultLabel: java.lang.String | js.Array[java.lang.String] = null,
    defaultValue: java.lang.String | js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    dropdownStyle: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    filterOption: js.UndefOr[scala.Boolean] = js.undefined,
    getInputElement: () => stdLib.Node = null,
    getPopupContainer: /* trigger */ stdLib.Node => stdLib.Node = null,
    id: java.lang.String = null,
    labelInValue: js.UndefOr[scala.Boolean] = js.undefined,
    maxTagCount: scala.Int | scala.Double = null,
    maxTagPlaceholder: reactLib.reactMod.ReactNs.ReactNode | js.Function = null,
    maxTagTextLength: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: java.lang.String = null,
    onBlur: () => scala.Unit = null,
    onChange: (/* value */ java.lang.String, /* label */ java.lang.String) => scala.Unit = null,
    onDeselect: (/* value */ java.lang.String, /* option */ Option) => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onInputKeyDown: /* e */ stdLib.Event => scala.Unit = null,
    onPopupScroll: () => scala.Unit = null,
    onSearch: () => scala.Unit = null,
    onSelect: (/* value */ java.lang.String, /* ontion */ Option) => scala.Unit = null,
    optionFilterProp: java.lang.String = null,
    optionLabelProp: java.lang.String = null,
    placeholder: reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    showAction: js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.UndefOr[scala.Boolean] = js.undefined,
    tokenSeparators: js.Array[java.lang.String] = null,
    transitionName: java.lang.String = null,
    value: java.lang.String | js.Array[java.lang.String] = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(combobox)) __obj.updateDynamic("combobox")(combobox)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (!js.isUndefined(filterOption)) __obj.updateDynamic("filterOption")(filterOption)
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction2(onDeselect))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1(onInputKeyDown))
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(js.Any.fromFunction0(onPopupScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction0(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

