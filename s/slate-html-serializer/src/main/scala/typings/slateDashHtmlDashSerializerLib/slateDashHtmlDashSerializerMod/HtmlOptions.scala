package typings
package slateDashHtmlDashSerializerLib.slateDashHtmlDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var defaultBlock: js.UndefOr[slateLib.slateMod.BlockProperties] = js.undefined
  var parseHtml: js.UndefOr[js.Function1[/* html */ java.lang.String, stdLib.HTMLElement]] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object HtmlOptions {
  @scala.inline
  def apply(
    defaultBlock: slateLib.slateMod.BlockProperties = null,
    parseHtml: /* html */ java.lang.String => stdLib.HTMLElement = null,
    rules: js.Array[Rule] = null
  ): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock)
    if (parseHtml != null) __obj.updateDynamic("parseHtml")(js.Any.fromFunction1(parseHtml))
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[HtmlOptions]
  }
}

