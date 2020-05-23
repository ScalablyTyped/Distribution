package typings.reactMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-markdown.react-markdown.RemarkParseOptions> */
trait PartialRemarkParseOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[String]] = js.undefined
  var commonmark: js.UndefOr[Boolean] = js.undefined
  var footnotes: js.UndefOr[Boolean] = js.undefined
  var gfm: js.UndefOr[Boolean] = js.undefined
  var pedantic: js.UndefOr[Boolean] = js.undefined
}

object PartialRemarkParseOptions {
  @scala.inline
  def apply(
    blocks: js.Array[String] = null,
    commonmark: js.UndefOr[Boolean] = js.undefined,
    footnotes: js.UndefOr[Boolean] = js.undefined,
    gfm: js.UndefOr[Boolean] = js.undefined,
    pedantic: js.UndefOr[Boolean] = js.undefined
  ): PartialRemarkParseOptions = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (!js.isUndefined(commonmark)) __obj.updateDynamic("commonmark")(commonmark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(footnotes)) __obj.updateDynamic("footnotes")(footnotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRemarkParseOptions]
  }
}

