package typings.reactstrap.libRowMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLElement>, 'form'> ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait RowProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var form: js.UndefOr[Boolean] = js.undefined
  var noGutters: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    form: js.UndefOr[Boolean] = js.undefined,
    noGutters: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(noGutters)) __obj.updateDynamic("noGutters")(noGutters.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

