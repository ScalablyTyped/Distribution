package typings.reactstrap.libLabelMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.LabelHTMLAttributes
import typings.reactstrap.libColMod.ColumnProps
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps
  extends LabelHTMLAttributes[HTMLLabelElement]
     with /* key */ StringDictionary[js.Any] {
  var check: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var `for`: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var lg: js.UndefOr[ColumnProps] = js.undefined
  var md: js.UndefOr[ColumnProps] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var sm: js.UndefOr[ColumnProps] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var xl: js.UndefOr[ColumnProps] = js.undefined
  var xs: js.UndefOr[ColumnProps] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    LabelHTMLAttributes: LabelHTMLAttributes[HTMLLabelElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    check: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `for`: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    lg: ColumnProps = null,
    md: ColumnProps = null,
    size: String = null,
    sm: ColumnProps = null,
    tag: String = null,
    xl: ColumnProps = null,
    xs: ColumnProps = null
  ): LabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, LabelHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

