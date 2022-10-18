package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.libCoreTypesMod.Config
import typings.sqltoolsFormatter.libCoreTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreFormatterMod {
  
  @JSImport("@sqltools/formatter/lib/core/Formatter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formatter {
    def this(cfg: Config, tokenizer: typings.sqltoolsFormatter.libCoreTokenizerMod.default) = this()
    def this(
      cfg: Config,
      tokenizer: typings.sqltoolsFormatter.libCoreTokenizerMod.default,
      tokenOverride: js.Function2[/* token */ Token, /* previousToken */ js.UndefOr[Token], Token]
    ) = this()
    
    /* CompleteClass */
    override def addNewline(query: String): String = js.native
    
    /* CompleteClass */
    var cfg: Config = js.native
    
    /* CompleteClass */
    override def equalizeWhitespace(value: String): String = js.native
    
    /* CompleteClass */
    override def format(query: String): String = js.native
    
    /* CompleteClass */
    override def formatBlockComment(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatCase(value: String): String = js.native
    
    /* CompleteClass */
    override def formatClosingParentheses(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatComma(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatLineComment(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatNewlineReservedWord(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatOpeningParentheses(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatPlaceholder(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatQuerySeparator(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatReserved(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatReservedWord(value: String): String = js.native
    
    /* CompleteClass */
    override def formatTopLevelReservedWord(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatTopLevelReservedWordNoIndent(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatWhitespace(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatWithSpaceAfter(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatWithSpaces(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def formatWithoutSpaces(token: Token, query: String): String = js.native
    
    /* CompleteClass */
    override def getFormattedQueryFromTokens(): String = js.native
    
    /* CompleteClass */
    override def indentComment(comment: String): String = js.native
    
    /* private */ /* CompleteClass */
    var indentation: Any = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var inlineBlock: Any = js.native
    
    /* private */ /* CompleteClass */
    var params: Any = js.native
    
    /* private */ /* CompleteClass */
    var previousNonWhiteSpace: Any = js.native
    
    /* private */ /* CompleteClass */
    var previousReservedWord: Any = js.native
    
    /* CompleteClass */
    override def previousToken(): Token = js.native
    
    /* private */ /* CompleteClass */
    var tokenOverride: Any = js.native
    
    /* CompleteClass */
    var tokenizer: typings.sqltoolsFormatter.libCoreTokenizerMod.default = js.native
    
    /* private */ /* CompleteClass */
    var tokens: Any = js.native
  }
  
  trait Formatter extends StObject {
    
    def addNewline(query: String): String
    
    var cfg: Config
    
    def equalizeWhitespace(value: String): String
    
    def format(query: String): String
    
    def formatBlockComment(token: Token, query: String): String
    
    def formatCase(value: String): String
    
    def formatClosingParentheses(token: Token, query: String): String
    
    def formatComma(token: Token, query: String): String
    
    def formatLineComment(token: Token, query: String): String
    
    def formatNewlineReservedWord(token: Token, query: String): String
    
    def formatOpeningParentheses(token: Token, query: String): String
    
    def formatPlaceholder(token: Token, query: String): String
    
    def formatQuerySeparator(token: Token, query: String): String
    
    def formatReserved(token: Token, query: String): String
    
    def formatReservedWord(value: String): String
    
    def formatTopLevelReservedWord(token: Token, query: String): String
    
    def formatTopLevelReservedWordNoIndent(token: Token, query: String): String
    
    def formatWhitespace(token: Token, query: String): String
    
    def formatWithSpaceAfter(token: Token, query: String): String
    
    def formatWithSpaces(token: Token, query: String): String
    
    def formatWithoutSpaces(token: Token, query: String): String
    
    def getFormattedQueryFromTokens(): String
    
    def indentComment(comment: String): String
    
    /* private */ var indentation: Any
    
    /* private */ var index: Any
    
    /* private */ var inlineBlock: Any
    
    /* private */ var params: Any
    
    /* private */ var previousNonWhiteSpace: Any
    
    /* private */ var previousReservedWord: Any
    
    def previousToken(): Token
    
    /* private */ var tokenOverride: Any
    
    var tokenizer: typings.sqltoolsFormatter.libCoreTokenizerMod.default
    
    /* private */ var tokens: Any
  }
  object Formatter {
    
    inline def apply(
      addNewline: String => String,
      cfg: Config,
      equalizeWhitespace: String => String,
      format: String => String,
      formatBlockComment: (Token, String) => String,
      formatCase: String => String,
      formatClosingParentheses: (Token, String) => String,
      formatComma: (Token, String) => String,
      formatLineComment: (Token, String) => String,
      formatNewlineReservedWord: (Token, String) => String,
      formatOpeningParentheses: (Token, String) => String,
      formatPlaceholder: (Token, String) => String,
      formatQuerySeparator: (Token, String) => String,
      formatReserved: (Token, String) => String,
      formatReservedWord: String => String,
      formatTopLevelReservedWord: (Token, String) => String,
      formatTopLevelReservedWordNoIndent: (Token, String) => String,
      formatWhitespace: (Token, String) => String,
      formatWithSpaceAfter: (Token, String) => String,
      formatWithSpaces: (Token, String) => String,
      formatWithoutSpaces: (Token, String) => String,
      getFormattedQueryFromTokens: () => String,
      indentComment: String => String,
      indentation: Any,
      index: Any,
      inlineBlock: Any,
      params: Any,
      previousNonWhiteSpace: Any,
      previousReservedWord: Any,
      previousToken: () => Token,
      tokenOverride: Any,
      tokenizer: typings.sqltoolsFormatter.libCoreTokenizerMod.default,
      tokens: Any
    ): Formatter = {
      val __obj = js.Dynamic.literal(addNewline = js.Any.fromFunction1(addNewline), cfg = cfg.asInstanceOf[js.Any], equalizeWhitespace = js.Any.fromFunction1(equalizeWhitespace), format = js.Any.fromFunction1(format), formatBlockComment = js.Any.fromFunction2(formatBlockComment), formatCase = js.Any.fromFunction1(formatCase), formatClosingParentheses = js.Any.fromFunction2(formatClosingParentheses), formatComma = js.Any.fromFunction2(formatComma), formatLineComment = js.Any.fromFunction2(formatLineComment), formatNewlineReservedWord = js.Any.fromFunction2(formatNewlineReservedWord), formatOpeningParentheses = js.Any.fromFunction2(formatOpeningParentheses), formatPlaceholder = js.Any.fromFunction2(formatPlaceholder), formatQuerySeparator = js.Any.fromFunction2(formatQuerySeparator), formatReserved = js.Any.fromFunction2(formatReserved), formatReservedWord = js.Any.fromFunction1(formatReservedWord), formatTopLevelReservedWord = js.Any.fromFunction2(formatTopLevelReservedWord), formatTopLevelReservedWordNoIndent = js.Any.fromFunction2(formatTopLevelReservedWordNoIndent), formatWhitespace = js.Any.fromFunction2(formatWhitespace), formatWithSpaceAfter = js.Any.fromFunction2(formatWithSpaceAfter), formatWithSpaces = js.Any.fromFunction2(formatWithSpaces), formatWithoutSpaces = js.Any.fromFunction2(formatWithoutSpaces), getFormattedQueryFromTokens = js.Any.fromFunction0(getFormattedQueryFromTokens), indentComment = js.Any.fromFunction1(indentComment), indentation = indentation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], inlineBlock = inlineBlock.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], previousNonWhiteSpace = previousNonWhiteSpace.asInstanceOf[js.Any], previousReservedWord = previousReservedWord.asInstanceOf[js.Any], previousToken = js.Any.fromFunction0(previousToken), tokenOverride = tokenOverride.asInstanceOf[js.Any], tokenizer = tokenizer.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    extension [Self <: Formatter](x: Self) {
      
      inline def setAddNewline(value: String => String): Self = StObject.set(x, "addNewline", js.Any.fromFunction1(value))
      
      inline def setCfg(value: Config): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setEqualizeWhitespace(value: String => String): Self = StObject.set(x, "equalizeWhitespace", js.Any.fromFunction1(value))
      
      inline def setFormat(value: String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatBlockComment(value: (Token, String) => String): Self = StObject.set(x, "formatBlockComment", js.Any.fromFunction2(value))
      
      inline def setFormatCase(value: String => String): Self = StObject.set(x, "formatCase", js.Any.fromFunction1(value))
      
      inline def setFormatClosingParentheses(value: (Token, String) => String): Self = StObject.set(x, "formatClosingParentheses", js.Any.fromFunction2(value))
      
      inline def setFormatComma(value: (Token, String) => String): Self = StObject.set(x, "formatComma", js.Any.fromFunction2(value))
      
      inline def setFormatLineComment(value: (Token, String) => String): Self = StObject.set(x, "formatLineComment", js.Any.fromFunction2(value))
      
      inline def setFormatNewlineReservedWord(value: (Token, String) => String): Self = StObject.set(x, "formatNewlineReservedWord", js.Any.fromFunction2(value))
      
      inline def setFormatOpeningParentheses(value: (Token, String) => String): Self = StObject.set(x, "formatOpeningParentheses", js.Any.fromFunction2(value))
      
      inline def setFormatPlaceholder(value: (Token, String) => String): Self = StObject.set(x, "formatPlaceholder", js.Any.fromFunction2(value))
      
      inline def setFormatQuerySeparator(value: (Token, String) => String): Self = StObject.set(x, "formatQuerySeparator", js.Any.fromFunction2(value))
      
      inline def setFormatReserved(value: (Token, String) => String): Self = StObject.set(x, "formatReserved", js.Any.fromFunction2(value))
      
      inline def setFormatReservedWord(value: String => String): Self = StObject.set(x, "formatReservedWord", js.Any.fromFunction1(value))
      
      inline def setFormatTopLevelReservedWord(value: (Token, String) => String): Self = StObject.set(x, "formatTopLevelReservedWord", js.Any.fromFunction2(value))
      
      inline def setFormatTopLevelReservedWordNoIndent(value: (Token, String) => String): Self = StObject.set(x, "formatTopLevelReservedWordNoIndent", js.Any.fromFunction2(value))
      
      inline def setFormatWhitespace(value: (Token, String) => String): Self = StObject.set(x, "formatWhitespace", js.Any.fromFunction2(value))
      
      inline def setFormatWithSpaceAfter(value: (Token, String) => String): Self = StObject.set(x, "formatWithSpaceAfter", js.Any.fromFunction2(value))
      
      inline def setFormatWithSpaces(value: (Token, String) => String): Self = StObject.set(x, "formatWithSpaces", js.Any.fromFunction2(value))
      
      inline def setFormatWithoutSpaces(value: (Token, String) => String): Self = StObject.set(x, "formatWithoutSpaces", js.Any.fromFunction2(value))
      
      inline def setGetFormattedQueryFromTokens(value: () => String): Self = StObject.set(x, "getFormattedQueryFromTokens", js.Any.fromFunction0(value))
      
      inline def setIndentComment(value: String => String): Self = StObject.set(x, "indentComment", js.Any.fromFunction1(value))
      
      inline def setIndentation(value: Any): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineBlock(value: Any): Self = StObject.set(x, "inlineBlock", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPreviousNonWhiteSpace(value: Any): Self = StObject.set(x, "previousNonWhiteSpace", value.asInstanceOf[js.Any])
      
      inline def setPreviousReservedWord(value: Any): Self = StObject.set(x, "previousReservedWord", value.asInstanceOf[js.Any])
      
      inline def setPreviousToken(value: () => Token): Self = StObject.set(x, "previousToken", js.Any.fromFunction0(value))
      
      inline def setTokenOverride(value: Any): Self = StObject.set(x, "tokenOverride", value.asInstanceOf[js.Any])
      
      inline def setTokenizer(value: typings.sqltoolsFormatter.libCoreTokenizerMod.default): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
