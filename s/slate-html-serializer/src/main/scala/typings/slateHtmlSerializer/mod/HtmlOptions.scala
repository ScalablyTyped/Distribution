package typings.slateHtmlSerializer.mod

import typings.slate.mod.BlockProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var defaultBlock: js.UndefOr[BlockProperties] = js.undefined
  var parseHtml: js.UndefOr[js.Function1[/* html */ String, HTMLElement]] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object HtmlOptions {
  @scala.inline
  def apply(
    defaultBlock: BlockProperties = null,
    parseHtml: /* html */ String => HTMLElement = null,
    rules: js.Array[Rule] = null
  ): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock.asInstanceOf[js.Any])
    if (parseHtml != null) __obj.updateDynamic("parseHtml")(js.Any.fromFunction1(parseHtml))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlOptions]
  }
}

