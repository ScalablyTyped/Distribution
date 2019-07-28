package typings.prettier.prettierMod

import typings.prettier.prettierStrings.BACKSLASH
import typings.prettier.prettierStrings._quote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "util")
@js.native
object utilNs extends js.Object {
  def addDanglingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  def addLeadingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  def addTrailingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  def getNextNonSpaceNonCommentCharacterIndex(text: String, node: js.Any, options: ParserOptions): Double = js.native
  def isNextLineEmpty(text: String, node: js.Any, options: ParserOptions): Boolean = js.native
  def isNextLineEmptyAfterIndex(text: String, index: Double): Boolean = js.native
  def makeString(rawContent: String, enclosingQuote: BACKSLASH, unescapeUnnecessaryEscapes: Boolean): String = js.native
  def makeString(rawContent: String, enclosingQuote: _quote, unescapeUnnecessaryEscapes: Boolean): String = js.native
}

