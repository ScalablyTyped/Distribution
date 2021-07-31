package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.anon.Input
import typings.sqltoolsFormatter.anon.Key
import typings.sqltoolsFormatter.anon.Regex
import typings.sqltoolsFormatter.typesMod.Token
import typings.sqltoolsFormatter.typesMod.TokenizerConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("@sqltools/formatter/lib/core/Tokenizer", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Tokenizer {
    def this(cfg: TokenizerConfig) = this()
  }
  
  @js.native
  trait Tokenizer extends StObject {
    
    var AMBIGUOS_OPERATOR_REGEX: RegExp = js.native
    
    var BLOCK_COMMENT_REGEX: RegExp = js.native
    
    var CLOSE_PAREN_REGEX: RegExp = js.native
    
    var IDENT_NAMED_PLACEHOLDER_REGEX: RegExp = js.native
    
    var INDEXED_PLACEHOLDER_REGEX: RegExp = js.native
    
    var LINE_COMMENT_REGEX: RegExp = js.native
    
    var NO_SPACE_OPERATOR_REGEX: RegExp = js.native
    
    var NUMBER_REGEX: RegExp = js.native
    
    var OPEN_PAREN_REGEX: RegExp = js.native
    
    var OPERATOR_REGEX: RegExp = js.native
    
    var RESERVED_NEWLINE_REGEX: RegExp = js.native
    
    var RESERVED_PLAIN_REGEX: RegExp = js.native
    
    var RESERVED_TOP_LEVEL_NO_INDENT_REGEX: RegExp = js.native
    
    var RESERVED_TOP_LEVEL_REGEX: RegExp = js.native
    
    var STRING_NAMED_PLACEHOLDER_REGEX: RegExp = js.native
    
    var STRING_REGEX: RegExp = js.native
    
    var WHITESPACE_REGEX: RegExp = js.native
    
    var WORD_REGEX: RegExp = js.native
    
    def createLineCommentRegex(lineCommentTypes: js.Any): RegExp = js.native
    
    def createParenRegex(parens: js.Any): RegExp = js.native
    
    def createPlaceholderRegex(types: js.Array[String], pattern: js.Any): RegExp = js.native
    
    def createReservedWordRegex(reservedWords: js.Any): RegExp = js.native
    
    def createStringPattern(stringTypes: js.Any): js.Any = js.native
    
    def createStringRegex(stringTypes: js.Any): RegExp = js.native
    
    def createWordRegex(specialChars: js.Any): RegExp = js.native
    
    def escapeParen(paren: js.Any): String = js.native
    
    def getAmbiguosOperatorToken(input: String): Token = js.native
    
    def getBlockCommentToken(input: String): Token = js.native
    
    def getCloseParenToken(input: String): Token = js.native
    
    def getCommentToken(input: String): Token = js.native
    
    def getEscapedPlaceholderKey(hasKeyQuoteChar: Key): js.Any = js.native
    
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
    
    def getReservedWordToken(input: js.Any, previousToken: js.Any): Token = js.native
    
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
