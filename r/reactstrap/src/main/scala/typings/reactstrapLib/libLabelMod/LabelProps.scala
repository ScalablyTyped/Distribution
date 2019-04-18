package typings
package reactstrapLib.libLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps
  extends reactLib.reactMod.LabelHTMLAttributes[stdLib.HTMLLabelElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var `for`: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var lg: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var md: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var sm: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var xl: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var xs: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    LabelHTMLAttributes: reactLib.reactMod.LabelHTMLAttributes[stdLib.HTMLLabelElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    check: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `for`: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    lg: reactstrapLib.libColMod.ColumnProps = null,
    md: reactstrapLib.libColMod.ColumnProps = null,
    size: java.lang.String = null,
    sm: reactstrapLib.libColMod.ColumnProps = null,
    tag: java.lang.String = null,
    xl: reactstrapLib.libColMod.ColumnProps = null,
    xs: reactstrapLib.libColMod.ColumnProps = null
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

