package typings.reactDashMarkdown.reactDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarkParseOptions extends js.Object {
  var blocks: js.Array[String]
  var commonmark: Boolean
  var footnotes: Boolean
  var gfm: Boolean
  var pedantic: Boolean
}

object RemarkParseOptions {
  @scala.inline
  def apply(blocks: js.Array[String], commonmark: Boolean, footnotes: Boolean, gfm: Boolean, pedantic: Boolean): RemarkParseOptions = {
    val __obj = js.Dynamic.literal(blocks = blocks, commonmark = commonmark, footnotes = footnotes, gfm = gfm, pedantic = pedantic)
  
    __obj.asInstanceOf[RemarkParseOptions]
  }
}

