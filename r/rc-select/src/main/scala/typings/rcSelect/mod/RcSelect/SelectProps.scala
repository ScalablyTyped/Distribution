package typings.rcSelect.mod.RcSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Event_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var combobox: js.UndefOr[Boolean] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
  var defaultLabel: js.UndefOr[String | js.Array[String]] = js.undefined
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var dropdownStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var filterOption: js.UndefOr[Boolean] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[Node]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* trigger */ Node, Node]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[ReactNode | js.Function] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var notFoundContent: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* label */ String, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function2[/* value */ String, /* option */ Option, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ String, /* ontion */ Option, Unit]] = js.undefined
  var optionFilterProp: js.UndefOr[String] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[js.Array[String]] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[Boolean] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    animation: String = null,
    choiceTransitionName: String = null,
    className: String = null,
    combobox: js.UndefOr[Boolean] = js.undefined,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultLabel: String | js.Array[String] = null,
    defaultValue: String | js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: StringDictionary[String] = null,
    dropdownStyle: StringDictionary[String] = null,
    filterOption: js.UndefOr[Boolean] = js.undefined,
    getInputElement: () => Node = null,
    getPopupContainer: /* trigger */ Node => Node = null,
    id: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: ReactNode | js.Function = null,
    maxTagTextLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: String = null,
    onBlur: () => Unit = null,
    onChange: (/* value */ String, /* label */ String) => Unit = null,
    onDeselect: (/* value */ String, /* option */ Option) => Unit = null,
    onFocus: () => Unit = null,
    onInputKeyDown: /* e */ Event_ => Unit = null,
    onPopupScroll: () => Unit = null,
    onSearch: () => Unit = null,
    onSelect: (/* value */ String, /* ontion */ Option) => Unit = null,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: ReactNode = null,
    prefixCls: String = null,
    showAction: js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    tags: js.UndefOr[Boolean] = js.undefined,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: String | js.Array[String] = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(combobox)) __obj.updateDynamic("combobox")(combobox.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(filterOption)) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction2(onDeselect))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1(onInputKeyDown))
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(js.Any.fromFunction0(onPopupScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction0(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp.asInstanceOf[js.Any])
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

