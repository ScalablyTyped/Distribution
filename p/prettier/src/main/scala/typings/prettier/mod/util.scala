package typings.prettier.mod

import typings.prettier.prettierStrings.Apostrophe
import typings.prettier.prettierStrings.Quotationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("prettier", "util.addDanglingComment")
  @js.native
  def addDanglingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  @JSImport("prettier", "util.addLeadingComment")
  @js.native
  def addLeadingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  @JSImport("prettier", "util.addTrailingComment")
  @js.native
  def addTrailingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  @JSImport("prettier", "util.getNextNonSpaceNonCommentCharacterIndex")
  @js.native
  def getNextNonSpaceNonCommentCharacterIndex(text: String, node: js.Any, options: ParserOptions[_]): Double = js.native
  
  @JSImport("prettier", "util.isNextLineEmpty")
  @js.native
  def isNextLineEmpty(text: String, node: js.Any, locEnd: js.Function1[/* node */ js.Any, Double]): Boolean = js.native
  
  @JSImport("prettier", "util.isNextLineEmptyAfterIndex")
  @js.native
  def isNextLineEmptyAfterIndex(text: String, index: Double): Boolean = js.native
  
  @JSImport("prettier", "util.isPreviousLineEmpty")
  @js.native
  def isPreviousLineEmpty(text: String, node: js.Any, locStart: js.Function1[/* node */ js.Any, Double]): Boolean = js.native
  
  @JSImport("prettier", "util.makeString")
  @js.native
  def makeString(rawContent: String, enclosingQuote: Apostrophe, unescapeUnnecessaryEscapes: Boolean): String = js.native
  @JSImport("prettier", "util.makeString")
  @js.native
  def makeString(rawContent: String, enclosingQuote: Quotationmark, unescapeUnnecessaryEscapes: Boolean): String = js.native
}
