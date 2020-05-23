package typings.reactJss.mod

import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import typings.std.HTMLStyleElement
import typings.theming.mod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUseStylesOptions extends BaseOptions {
  var name: js.UndefOr[String] = js.undefined
}

object CreateUseStylesOptions {
  @scala.inline
  def apply(
    classNamePrefix: String = null,
    element: HTMLStyleElement = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    index: js.UndefOr[Double] = js.undefined,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null,
    name: String = null,
    theming: Theming[js.Object] = null
  ): CreateUseStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (theming != null) __obj.updateDynamic("theming")(theming.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUseStylesOptions]
  }
}

