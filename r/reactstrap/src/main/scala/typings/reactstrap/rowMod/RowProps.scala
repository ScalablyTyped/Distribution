package typings.reactstrap.rowMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLElement>, 'form'> ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait RowProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var form: js.UndefOr[Boolean] = js.undefined
  var lg: js.UndefOr[Double | String] = js.undefined
  var md: js.UndefOr[Double | String] = js.undefined
  var noGutters: js.UndefOr[Boolean] = js.undefined
  var sm: js.UndefOr[Double | String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var xl: js.UndefOr[Double | String] = js.undefined
  var xs: js.UndefOr[Double | String] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    form: js.UndefOr[Boolean] = js.undefined,
    lg: Double | String = null,
    md: Double | String = null,
    noGutters: js.UndefOr[Boolean] = js.undefined,
    sm: Double | String = null,
    tag: String | ReactType[_] = null,
    xl: Double | String = null,
    xs: Double | String = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (!js.isUndefined(noGutters)) __obj.updateDynamic("noGutters")(noGutters.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

