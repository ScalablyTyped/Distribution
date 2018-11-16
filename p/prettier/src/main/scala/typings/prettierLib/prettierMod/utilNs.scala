package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "util")
@js.native
object utilNs extends js.Object {
  def addDanglingComment(node: js.Any, commentNode: js.Any): scala.Unit = js.native
  def addLeadingComment(node: js.Any, commentNode: js.Any): scala.Unit = js.native
  def addTrailingComment(node: js.Any, commentNode: js.Any): scala.Unit = js.native
  def getNextNonSpaceNonCommentCharacterIndex(text: java.lang.String, node: js.Any, options: prettierLib.prettierMod.ParserOptions): scala.Double = js.native
  def isNextLineEmpty(text: java.lang.String, node: js.Any, options: prettierLib.prettierMod.ParserOptions): scala.Boolean = js.native
  def isNextLineEmptyAfterIndex(text: java.lang.String, index: scala.Double): scala.Boolean = js.native
  @JSName("makeString")
  def `makeString_'`(
    rawContent: java.lang.String,
    enclosingQuote: prettierLib.prettierLibStrings.`'`,
    unescapeUnnecessaryEscapes: scala.Boolean
  ): java.lang.String = js.native
  @JSName("makeString")
  def `makeString_\"`(
    rawContent: java.lang.String,
    enclosingQuote: prettierLib.prettierLibStrings.BACKSLASH,
    unescapeUnnecessaryEscapes: scala.Boolean
  ): java.lang.String = js.native
}

