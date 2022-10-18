package typings.sqlFormatter.libSrcLexerTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("sql-formatter/lib/src/lexer/token", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TokenType & String] = js.native
  
  @js.native
  sealed trait AND
    extends StObject
       with TokenType
  /* "AND" */ val AND: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.AND & String = js.native
  
  @js.native
  sealed trait ARRAY_IDENTIFIER
    extends StObject
       with TokenType
  /* "ARRAY_IDENTIFIER" */ val ARRAY_IDENTIFIER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.ARRAY_IDENTIFIER & String = js.native
  
  @js.native
  sealed trait ARRAY_KEYWORD
    extends StObject
       with TokenType
  /* "ARRAY_KEYWORD" */ val ARRAY_KEYWORD: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.ARRAY_KEYWORD & String = js.native
  
  @js.native
  sealed trait ASTERISK
    extends StObject
       with TokenType
  /* "ASTERISK" */ val ASTERISK: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.ASTERISK & String = js.native
  
  @js.native
  sealed trait BETWEEN
    extends StObject
       with TokenType
  /* "BETWEEN" */ val BETWEEN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.BETWEEN & String = js.native
  
  @js.native
  sealed trait BLOCK_COMMENT
    extends StObject
       with TokenType
  /* "BLOCK_COMMENT" */ val BLOCK_COMMENT: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.BLOCK_COMMENT & String = js.native
  
  @js.native
  sealed trait CASE
    extends StObject
       with TokenType
  /* "CASE" */ val CASE: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.CASE & String = js.native
  
  @js.native
  sealed trait CLOSE_PAREN
    extends StObject
       with TokenType
  /* "CLOSE_PAREN" */ val CLOSE_PAREN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.CLOSE_PAREN & String = js.native
  
  @js.native
  sealed trait COMMA
    extends StObject
       with TokenType
  /* "COMMA" */ val COMMA: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.COMMA & String = js.native
  
  @js.native
  sealed trait DELIMITER
    extends StObject
       with TokenType
  /* "DELIMITER" */ val DELIMITER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.DELIMITER & String = js.native
  
  @js.native
  sealed trait DOT
    extends StObject
       with TokenType
  /* "DOT" */ val DOT: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.DOT & String = js.native
  
  @js.native
  sealed trait ELSE
    extends StObject
       with TokenType
  /* "ELSE" */ val ELSE: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.ELSE & String = js.native
  
  @js.native
  sealed trait END
    extends StObject
       with TokenType
  /* "END" */ val END: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.END & String = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* "EOF" */ val EOF: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.EOF & String = js.native
  
  @js.native
  sealed trait IDENTIFIER
    extends StObject
       with TokenType
  /* "IDENTIFIER" */ val IDENTIFIER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.IDENTIFIER & String = js.native
  
  @js.native
  sealed trait LIMIT
    extends StObject
       with TokenType
  /* "LIMIT" */ val LIMIT: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.LIMIT & String = js.native
  
  @js.native
  sealed trait LINE_COMMENT
    extends StObject
       with TokenType
  /* "LINE_COMMENT" */ val LINE_COMMENT: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.LINE_COMMENT & String = js.native
  
  @js.native
  sealed trait NAMED_PARAMETER
    extends StObject
       with TokenType
  /* "NAMED_PARAMETER" */ val NAMED_PARAMETER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.NAMED_PARAMETER & String = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with TokenType
  /* "NUMBER" */ val NUMBER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.NUMBER & String = js.native
  
  @js.native
  sealed trait NUMBERED_PARAMETER
    extends StObject
       with TokenType
  /* "NUMBERED_PARAMETER" */ val NUMBERED_PARAMETER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.NUMBERED_PARAMETER & String = js.native
  
  @js.native
  sealed trait OPEN_PAREN
    extends StObject
       with TokenType
  /* "OPEN_PAREN" */ val OPEN_PAREN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.OPEN_PAREN & String = js.native
  
  @js.native
  sealed trait OPERATOR
    extends StObject
       with TokenType
  /* "OPERATOR" */ val OPERATOR: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.OPERATOR & String = js.native
  
  @js.native
  sealed trait OR
    extends StObject
       with TokenType
  /* "OR" */ val OR: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.OR & String = js.native
  
  @js.native
  sealed trait POSITIONAL_PARAMETER
    extends StObject
       with TokenType
  /* "POSITIONAL_PARAMETER" */ val POSITIONAL_PARAMETER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.POSITIONAL_PARAMETER & String = js.native
  
  @js.native
  sealed trait QUOTED_IDENTIFIER
    extends StObject
       with TokenType
  /* "QUOTED_IDENTIFIER" */ val QUOTED_IDENTIFIER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.QUOTED_IDENTIFIER & String = js.native
  
  @js.native
  sealed trait QUOTED_PARAMETER
    extends StObject
       with TokenType
  /* "QUOTED_PARAMETER" */ val QUOTED_PARAMETER: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.QUOTED_PARAMETER & String = js.native
  
  @js.native
  sealed trait RESERVED_CLAUSE
    extends StObject
       with TokenType
  /* "RESERVED_CLAUSE" */ val RESERVED_CLAUSE: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_CLAUSE & String = js.native
  
  @js.native
  sealed trait RESERVED_FUNCTION_NAME
    extends StObject
       with TokenType
  /* "RESERVED_FUNCTION_NAME" */ val RESERVED_FUNCTION_NAME: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_FUNCTION_NAME & String = js.native
  
  @js.native
  sealed trait RESERVED_JOIN
    extends StObject
       with TokenType
  /* "RESERVED_JOIN" */ val RESERVED_JOIN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_JOIN & String = js.native
  
  @js.native
  sealed trait RESERVED_KEYWORD
    extends StObject
       with TokenType
  /* "RESERVED_KEYWORD" */ val RESERVED_KEYWORD: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_KEYWORD & String = js.native
  
  @js.native
  sealed trait RESERVED_PHRASE
    extends StObject
       with TokenType
  /* "RESERVED_PHRASE" */ val RESERVED_PHRASE: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_PHRASE & String = js.native
  
  @js.native
  sealed trait RESERVED_SELECT
    extends StObject
       with TokenType
  /* "RESERVED_SELECT" */ val RESERVED_SELECT: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_SELECT & String = js.native
  
  @js.native
  sealed trait RESERVED_SET_OPERATION
    extends StObject
       with TokenType
  /* "RESERVED_SET_OPERATION" */ val RESERVED_SET_OPERATION: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.RESERVED_SET_OPERATION & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with TokenType
  /* "STRING" */ val STRING: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.STRING & String = js.native
  
  @js.native
  sealed trait THEN
    extends StObject
       with TokenType
  /* "THEN" */ val THEN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.THEN & String = js.native
  
  @js.native
  sealed trait VARIABLE
    extends StObject
       with TokenType
  /* "VARIABLE" */ val VARIABLE: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.VARIABLE & String = js.native
  
  @js.native
  sealed trait WHEN
    extends StObject
       with TokenType
  /* "WHEN" */ val WHEN: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.WHEN & String = js.native
  
  @js.native
  sealed trait XOR
    extends StObject
       with TokenType
  /* "XOR" */ val XOR: typings.sqlFormatter.libSrcLexerTokenMod.TokenType.XOR & String = js.native
}
