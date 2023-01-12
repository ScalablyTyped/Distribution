package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.storybookComponentsBooleans.`false`
import typings.storybookComponents.storybookComponentsStrings.Quotationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDanglingComment(node: Any, comment: Any, marker: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDanglingComment")(node.asInstanceOf[js.Any], comment.asInstanceOf[js.Any], marker.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addLeadingComment(node: Any, comment: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLeadingComment")(node.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addTrailingComment(node: Any, comment: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTrailingComment")(node.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAlignmentSize(value: String, tabWidth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentSize")(value.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getAlignmentSize(value: String, tabWidth: Double, startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentSize")(value.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getIndentSize(value: String, tabWidth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentSize")(value.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getMaxContinuousCount(str: String, target: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxContinuousCount")(str.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextNonSpaceNonCommentCharacterIndex[N](text: String, node: N, locEnd: js.Function1[/* node */ N, Double]): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextNonSpaceNonCommentCharacterIndex")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], locEnd.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def getStringWidth(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringWidth")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasNewline(text: String, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasNewline(text: String, index: Double, opts: SkipOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasNewlineInRange(text: String, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNewlineInRange")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasSpaces(text: String, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasSpaces(text: String, index: Double, opts: SkipOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNextLineEmpty[N](text: String, node: N, locEnd: js.Function1[/* node */ N, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextLineEmpty")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], locEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNextLineEmptyAfterIndex(text: String, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextLineEmptyAfterIndex")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPreviousLineEmpty[N](text: String, node: N, locStart: js.Function1[/* node */ N, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPreviousLineEmpty")(text.asInstanceOf[js.Any], node.asInstanceOf[js.Any], locStart.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeString(rawContent: String, enclosingQuote: Quote): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(rawContent.asInstanceOf[js.Any], enclosingQuote.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def makeString(rawContent: String, enclosingQuote: Quote, unescapeUnnecessaryEscapes: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(rawContent.asInstanceOf[js.Any], enclosingQuote.asInstanceOf[js.Any], unescapeUnnecessaryEscapes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def skip(chars: String): js.Function3[
    /* text */ String, 
    /* index */ Double | `false`, 
    /* opts */ js.UndefOr[SkipOptions], 
    Double | `false`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(chars.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* text */ String, 
    /* index */ Double | `false`, 
    /* opts */ js.UndefOr[SkipOptions], 
    Double | `false`
  ]]
  inline def skip(chars: js.RegExp): js.Function3[
    /* text */ String, 
    /* index */ Double | `false`, 
    /* opts */ js.UndefOr[SkipOptions], 
    Double | `false`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(chars.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* text */ String, 
    /* index */ Double | `false`, 
    /* opts */ js.UndefOr[SkipOptions], 
    Double | `false`
  ]]
  
  inline def skipEverythingButNewLine(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipEverythingButNewLine")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipEverythingButNewLine(text: String, index: Double, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipEverythingButNewLine")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipEverythingButNewLine_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipEverythingButNewLine")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipEverythingButNewLine_false(text: String, index: `false`, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipEverythingButNewLine")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipInlineComment(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipInlineComment")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipInlineComment_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipInlineComment")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipNewline(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipNewline(text: String, index: Double, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipNewline_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipNewline_false(text: String, index: `false`, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipNewline")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipSpaces(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipSpaces(text: String, index: Double, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipSpaces_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipSpaces_false(text: String, index: `false`, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipSpaces")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipToLineEnd(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipToLineEnd")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipToLineEnd(text: String, index: Double, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipToLineEnd")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipToLineEnd_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipToLineEnd")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipToLineEnd_false(text: String, index: `false`, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipToLineEnd")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipTrailingComment(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrailingComment")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipTrailingComment_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipTrailingComment")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipWhitespace(text: String, index: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhitespace")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipWhitespace(text: String, index: Double, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhitespace")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  inline def skipWhitespace_false(text: String, index: `false`): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhitespace")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  inline def skipWhitespace_false(text: String, index: `false`, opts: SkipOptions): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhitespace")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  
  object Quote {
    
    inline def Apostrophe: /* ' */ String = "'".asInstanceOf[/* ' */ String]
    
    inline def Quotationmark: typings.storybookComponents.storybookComponentsStrings.Quotationmark = "\"".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.Quotationmark]
  }
  type Quote = (/* ' */ String) | Quotationmark
  
  trait SkipOptions extends StObject {
    
    var backwards: js.UndefOr[Boolean] = js.undefined
  }
  object SkipOptions {
    
    inline def apply(): SkipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipOptions] (val x: Self) extends AnyVal {
      
      inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
      
      inline def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    }
  }
}
