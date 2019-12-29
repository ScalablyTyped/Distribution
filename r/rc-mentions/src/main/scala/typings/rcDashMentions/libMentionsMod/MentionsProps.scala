package typings.rcDashMentions.libMentionsMod

import typings.rcDashMentions.libOptionMod.OptionProps
import typings.rcDashMentions.rcDashMentionsBooleans.`false`
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>, 'prefix' | 'onChange' | 'onSelect'> ]: react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>[P]} */ trait MentionsProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var filterOption: js.UndefOr[
    `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean])
  ] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
  var onSearch: js.UndefOr[js.Function2[/* text */ String, /* prefix */ String, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* option */ OptionProps, /* prefix */ String, Unit]] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var split: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var validateSearch: js.UndefOr[js.Function2[/* text */ String, /* props */ this.type, Boolean]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MentionsProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: String = null,
    filterOption: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]) = null,
    getPopupContainer: () => HTMLElement = null,
    notFoundContent: ReactNode = null,
    onBlur: FocusEvent[HTMLTextAreaElement] => Unit = null,
    onChange: /* text */ String => Unit = null,
    onFocus: FocusEvent[HTMLTextAreaElement] => Unit = null,
    onSearch: (/* text */ String, /* prefix */ String) => Unit = null,
    onSelect: (/* option */ OptionProps, /* prefix */ String) => Unit = null,
    placement: Placement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    split: String = null,
    style: CSSProperties = null,
    transitionName: String = null,
    validateSearch: (/* text */ String, MentionsProps) => Boolean = null,
    value: String = null
  ): MentionsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction0(getPopupContainer))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2(validateSearch))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsProps]
  }
}

