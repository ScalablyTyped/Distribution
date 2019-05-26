package typings
package rcDashMentionsLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>, 'prefix' | 'onChange' | 'onSelect'> ]: react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>[P]} */ trait MentionsProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var filterOption: js.UndefOr[
    rcDashMentionsLib.rcDashMentionsLibNumbers.`false` | (js.Function2[
      /* input */ java.lang.String, 
      /* hasValue */ rcDashMentionsLib.libOptionMod.OptionProps, 
      scala.Boolean
    ])
  ] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement]] = js.undefined
  var onSearch: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* prefix */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[
      /* option */ rcDashMentionsLib.libOptionMod.OptionProps, 
      /* prefix */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var prefix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var split: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var validateSearch: js.UndefOr[js.Function2[/* text */ java.lang.String, /* props */ this.type, scala.Boolean]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MentionsProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultValue: java.lang.String = null,
    filterOption: rcDashMentionsLib.rcDashMentionsLibNumbers.`false` | (js.Function2[
      /* input */ java.lang.String, 
      /* hasValue */ rcDashMentionsLib.libOptionMod.OptionProps, 
      scala.Boolean
    ]) = null,
    notFoundContent: reactLib.reactMod.ReactNode = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onChange: /* text */ java.lang.String => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onSearch: (/* text */ java.lang.String, /* prefix */ java.lang.String) => scala.Unit = null,
    onSelect: (/* option */ rcDashMentionsLib.libOptionMod.OptionProps, /* prefix */ java.lang.String) => scala.Unit = null,
    placement: Placement = null,
    prefix: java.lang.String | js.Array[java.lang.String] = null,
    prefixCls: java.lang.String = null,
    split: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionName: java.lang.String = null,
    validateSearch: (/* text */ java.lang.String, MentionsProps) => scala.Boolean = null,
    value: java.lang.String = null
  ): MentionsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (split != null) __obj.updateDynamic("split")(split)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2(validateSearch))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MentionsProps]
  }
}

