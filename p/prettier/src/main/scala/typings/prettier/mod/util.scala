package typings.prettier.mod

import typings.prettier.prettierStrings.Apostrophe
import typings.prettier.prettierStrings.Quotationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("prettier", "util")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addDanglingComment(node: js.Any, commentNode: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDanglingComment")(node.asInstanceOf[js.Any], commentNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addLeadingComment(node: js.Any, commentNode: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLeadingComment")(node.asInstanceOf[js.Any], commentNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addTrailingComment(node: js.Any, commentNode: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTrailingComment")(node.asInstanceOf[js.Any], commentNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getNextNonSpaceNonCommentCharacterIndex(text: String, node: js.Any, options: ParserOptions[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextNonSpaceNonCommentCharacterIndex")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isNextLineEmpty(text: String, node: js.Any, locEnd: js.Function1[/* node */ js.Any, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextLineEmpty")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], locEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNextLineEmptyAfterIndex(text: String, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextLineEmptyAfterIndex")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPreviousLineEmpty(text: String, node: js.Any, locStart: js.Function1[/* node */ js.Any, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPreviousLineEmpty")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], locStart.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeString(rawContent: String, enclosingQuote: Apostrophe, unescapeUnnecessaryEscapes: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(rawContent.asInstanceOf[js.Any], enclosingQuote.asInstanceOf[js.Any], unescapeUnnecessaryEscapes.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def makeString(rawContent: String, enclosingQuote: Quotationmark, unescapeUnnecessaryEscapes: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(rawContent.asInstanceOf[js.Any], enclosingQuote.asInstanceOf[js.Any], unescapeUnnecessaryEscapes.asInstanceOf[js.Any])).asInstanceOf[String]
}
