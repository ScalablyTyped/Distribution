package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Jss
import typings.jss.jssMod.Rule
import typings.jss.jssMod.StyleSheet
import typings.jss.jssMod.StyleSheetFactoryOptions
import typings.std.HTMLStyleElement
import typings.theming.themingMod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesOptions extends StyleSheetFactoryOptions {
  var injectTheme: js.UndefOr[Boolean] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var theming: js.UndefOr[Theming[js.Object]] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply(
    classNamePrefix: String = null,
    element: HTMLStyleElement = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    index: Int | Double = null,
    injectTheme: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null,
    theming: Theming[js.Object] = null
  ): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (element != null) __obj.updateDynamic("element")(element)
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(injectTheme)) __obj.updateDynamic("injectTheme")(injectTheme)
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (media != null) __obj.updateDynamic("media")(media)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (theming != null) __obj.updateDynamic("theming")(theming)
    __obj.asInstanceOf[WithStylesOptions]
  }
}

