package typings.reactMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-markdown.react-markdown.RemarkParseOptions> */
@js.native
trait PartialRemarkParseOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[String]] = js.native
  var commonmark: js.UndefOr[Boolean] = js.native
  var footnotes: js.UndefOr[Boolean] = js.native
  var gfm: js.UndefOr[Boolean] = js.native
  var pedantic: js.UndefOr[Boolean] = js.native
}

object PartialRemarkParseOptions {
  @scala.inline
  def apply(): PartialRemarkParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRemarkParseOptions]
  }
  @scala.inline
  implicit class PartialRemarkParseOptionsOps[Self <: PartialRemarkParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlocksVarargs(value: String*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[String]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    @scala.inline
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonmark: Self = this.set("commonmark", js.undefined)
    @scala.inline
    def setFootnotes(value: Boolean): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
  }
  
}

