package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.anon.Input
import typings.sqltoolsFormatter.anon.Key
import typings.sqltoolsFormatter.anon.Regex
import typings.sqltoolsFormatter.typesMod.Token
import typings.sqltoolsFormatter.typesMod.TokenizerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("@sqltools/formatter/lib/core/Tokenizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tokenizer {
    def this(cfg: TokenizerConfig) = this()
  }
  
  @js.native
  trait Tokenizer extends StObject {
    
    var AMBIGUOS_OPERATOR_REGEX: js.RegExp = js.native
    
    var BLOCK_COMMENT_REGEX: js.RegExp = js.native
    
    var CLOSE_PAREN_REGEX: js.RegExp = js.native
    
    var IDENT_NAMED_PLACEHOLDER_REGEX: js.RegExp = js.native
    
    var INDEXED_PLACEHOLDER_REGEX: js.RegExp = js.native
    
    var LINE_COMMENT_REGEX: js.RegExp = js.native
    
    var NO_SPACE_OPERATOR_REGEX: js.RegExp = js.native
    
    var NUMBER_REGEX: js.RegExp = js.native
    
    var OPEN_PAREN_REGEX: js.RegExp = js.native
    
    var OPERATOR_REGEX: js.RegExp = js.native
    
    var RESERVED_NEWLINE_REGEX: js.RegExp = js.native
    
    var RESERVED_PLAIN_REGEX: js.RegExp = js.native
    
    var RESERVED_TOP_LEVEL_NO_INDENT_REGEX: js.RegExp = js.native
    
    var RESERVED_TOP_LEVEL_REGEX: js.RegExp = js.native
    
    var STRING_NAMED_PLACEHOLDER_REGEX: js.RegExp = js.native
    
    var STRING_REGEX: js.RegExp = js.native
    
    var WHITESPACE_REGEX: js.RegExp = js.native
    
    var WORD_REGEX: js.RegExp = js.native
    
    def createLineCommentRegex(lineCommentTypes: Any): js.RegExp = js.native
    
    def createParenRegex(parens: Any): js.RegExp = js.native
    
    def createPlaceholderRegex(types: js.Array[String], pattern: Any): js.RegExp = js.native
    
    def createReservedWordRegex(reservedWords: Any): js.RegExp = js.native
    
    def createStringPattern(stringTypes: Any): Any = js.native
    
    def createStringRegex(stringTypes: Any): js.RegExp = js.native
    
    def createWordRegex(specialChars: Any): js.RegExp = js.native
    
    def escapeParen(paren: Any): String = js.native
    
    def getAmbiguosOperatorToken(input: String): Token = js.native
    
    def getBlockCommentToken(input: String): Token = js.native
    
    def getCloseParenToken(input: String): Token = js.native
    
    def getCommentToken(input: String): Token = js.native
    
    def getEscapedPlaceholderKey(hasKeyQuoteChar: Key): Any = js.native
    
    def getIdentNamedPlaceholderToken(input: String): Token = js.native
    
    def getIndexedPlaceholderToken(input: String): Token = js.native
    
    def getLineCommentToken(input: String): Token = js.native
    
    def getNewlineReservedToken(input: String): Token = js.native
    
    def getNextToken(input: String): Token = js.native
    def getNextToken(input: String, previousToken: Token): Token = js.native
    
    def getNoSpaceOperatorToken(input: String): Token = js.native
    
    def getNumberToken(input: String): Token = js.native
    
    def getOpenParenToken(input: String): Token = js.native
    
    def getOperatorToken(input: String): Token = js.native
    
    def getPlaceholderToken(input: String): Token = js.native
    
    def getPlaceholderTokenWithKey(hasInputRegexParseKey: Input): Token = js.native
    
    def getPlainReservedToken(input: String): Token = js.native
    
    def getReservedWordToken(input: Any, previousToken: Any): Token = js.native
    
    def getServerVariableToken(input: String): Token = js.native
    
    def getStringNamedPlaceholderToken(input: String): Token = js.native
    
    def getStringToken(input: String): Token = js.native
    
    def getTokenOnFirstMatch(hasInputTypeRegex: Regex): Token = js.native
    
    def getTopLevelReservedTokenNoIndent(input: String): Token = js.native
    
    def getToplevelReservedToken(input: String): Token = js.native
    
    def getWhitespaceToken(input: String): Token = js.native
    
    def getWordToken(input: String): Token = js.native
    
    def tokenize(input: String): js.Array[Token] = js.native
  }
}
