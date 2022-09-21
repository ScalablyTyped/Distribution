package typings.sqlFormatter.tokenMod

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
  /* "AND" */ val AND: typings.sqlFormatter.tokenMod.TokenType.AND & String = js.native
  
  @js.native
  sealed trait ARRAY_IDENTIFIER
    extends StObject
       with TokenType
  /* "ARRAY_IDENTIFIER" */ val ARRAY_IDENTIFIER: typings.sqlFormatter.tokenMod.TokenType.ARRAY_IDENTIFIER & String = js.native
  
  @js.native
  sealed trait ARRAY_KEYWORD
    extends StObject
       with TokenType
  /* "ARRAY_KEYWORD" */ val ARRAY_KEYWORD: typings.sqlFormatter.tokenMod.TokenType.ARRAY_KEYWORD & String = js.native
  
  @js.native
  sealed trait ASTERISK
    extends StObject
       with TokenType
  /* "ASTERISK" */ val ASTERISK: typings.sqlFormatter.tokenMod.TokenType.ASTERISK & String = js.native
  
  @js.native
  sealed trait BETWEEN
    extends StObject
       with TokenType
  /* "BETWEEN" */ val BETWEEN: typings.sqlFormatter.tokenMod.TokenType.BETWEEN & String = js.native
  
  @js.native
  sealed trait BLOCK_COMMENT
    extends StObject
       with TokenType
  /* "BLOCK_COMMENT" */ val BLOCK_COMMENT: typings.sqlFormatter.tokenMod.TokenType.BLOCK_COMMENT & String = js.native
  
  @js.native
  sealed trait CASE
    extends StObject
       with TokenType
  /* "CASE" */ val CASE: typings.sqlFormatter.tokenMod.TokenType.CASE & String = js.native
  
  @js.native
  sealed trait CLOSE_PAREN
    extends StObject
       with TokenType
  /* "CLOSE_PAREN" */ val CLOSE_PAREN: typings.sqlFormatter.tokenMod.TokenType.CLOSE_PAREN & String = js.native
  
  @js.native
  sealed trait COMMA
    extends StObject
       with TokenType
  /* "COMMA" */ val COMMA: typings.sqlFormatter.tokenMod.TokenType.COMMA & String = js.native
  
  @js.native
  sealed trait DELIMITER
    extends StObject
       with TokenType
  /* "DELIMITER" */ val DELIMITER: typings.sqlFormatter.tokenMod.TokenType.DELIMITER & String = js.native
  
  @js.native
  sealed trait DOT
    extends StObject
       with TokenType
  /* "DOT" */ val DOT: typings.sqlFormatter.tokenMod.TokenType.DOT & String = js.native
  
  @js.native
  sealed trait END
    extends StObject
       with TokenType
  /* "END" */ val END: typings.sqlFormatter.tokenMod.TokenType.END & String = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* "EOF" */ val EOF: typings.sqlFormatter.tokenMod.TokenType.EOF & String = js.native
  
  @js.native
  sealed trait IDENTIFIER
    extends StObject
       with TokenType
  /* "IDENTIFIER" */ val IDENTIFIER: typings.sqlFormatter.tokenMod.TokenType.IDENTIFIER & String = js.native
  
  @js.native
  sealed trait LIMIT
    extends StObject
       with TokenType
  /* "LIMIT" */ val LIMIT: typings.sqlFormatter.tokenMod.TokenType.LIMIT & String = js.native
  
  @js.native
  sealed trait LINE_COMMENT
    extends StObject
       with TokenType
  /* "LINE_COMMENT" */ val LINE_COMMENT: typings.sqlFormatter.tokenMod.TokenType.LINE_COMMENT & String = js.native
  
  @js.native
  sealed trait NAMED_PARAMETER
    extends StObject
       with TokenType
  /* "NAMED_PARAMETER" */ val NAMED_PARAMETER: typings.sqlFormatter.tokenMod.TokenType.NAMED_PARAMETER & String = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with TokenType
  /* "NUMBER" */ val NUMBER: typings.sqlFormatter.tokenMod.TokenType.NUMBER & String = js.native
  
  @js.native
  sealed trait NUMBERED_PARAMETER
    extends StObject
       with TokenType
  /* "NUMBERED_PARAMETER" */ val NUMBERED_PARAMETER: typings.sqlFormatter.tokenMod.TokenType.NUMBERED_PARAMETER & String = js.native
  
  @js.native
  sealed trait OPEN_PAREN
    extends StObject
       with TokenType
  /* "OPEN_PAREN" */ val OPEN_PAREN: typings.sqlFormatter.tokenMod.TokenType.OPEN_PAREN & String = js.native
  
  @js.native
  sealed trait OPERATOR
    extends StObject
       with TokenType
  /* "OPERATOR" */ val OPERATOR: typings.sqlFormatter.tokenMod.TokenType.OPERATOR & String = js.native
  
  @js.native
  sealed trait OR
    extends StObject
       with TokenType
  /* "OR" */ val OR: typings.sqlFormatter.tokenMod.TokenType.OR & String = js.native
  
  @js.native
  sealed trait POSITIONAL_PARAMETER
    extends StObject
       with TokenType
  /* "POSITIONAL_PARAMETER" */ val POSITIONAL_PARAMETER: typings.sqlFormatter.tokenMod.TokenType.POSITIONAL_PARAMETER & String = js.native
  
  @js.native
  sealed trait QUOTED_IDENTIFIER
    extends StObject
       with TokenType
  /* "QUOTED_IDENTIFIER" */ val QUOTED_IDENTIFIER: typings.sqlFormatter.tokenMod.TokenType.QUOTED_IDENTIFIER & String = js.native
  
  @js.native
  sealed trait QUOTED_PARAMETER
    extends StObject
       with TokenType
  /* "QUOTED_PARAMETER" */ val QUOTED_PARAMETER: typings.sqlFormatter.tokenMod.TokenType.QUOTED_PARAMETER & String = js.native
  
  @js.native
  sealed trait RESERVED_COMMAND
    extends StObject
       with TokenType
  /* "RESERVED_COMMAND" */ val RESERVED_COMMAND: typings.sqlFormatter.tokenMod.TokenType.RESERVED_COMMAND & String = js.native
  
  @js.native
  sealed trait RESERVED_DEPENDENT_CLAUSE
    extends StObject
       with TokenType
  /* "RESERVED_DEPENDENT_CLAUSE" */ val RESERVED_DEPENDENT_CLAUSE: typings.sqlFormatter.tokenMod.TokenType.RESERVED_DEPENDENT_CLAUSE & String = js.native
  
  @js.native
  sealed trait RESERVED_FUNCTION_NAME
    extends StObject
       with TokenType
  /* "RESERVED_FUNCTION_NAME" */ val RESERVED_FUNCTION_NAME: typings.sqlFormatter.tokenMod.TokenType.RESERVED_FUNCTION_NAME & String = js.native
  
  @js.native
  sealed trait RESERVED_JOIN
    extends StObject
       with TokenType
  /* "RESERVED_JOIN" */ val RESERVED_JOIN: typings.sqlFormatter.tokenMod.TokenType.RESERVED_JOIN & String = js.native
  
  @js.native
  sealed trait RESERVED_KEYWORD
    extends StObject
       with TokenType
  /* "RESERVED_KEYWORD" */ val RESERVED_KEYWORD: typings.sqlFormatter.tokenMod.TokenType.RESERVED_KEYWORD & String = js.native
  
  @js.native
  sealed trait RESERVED_PHRASE
    extends StObject
       with TokenType
  /* "RESERVED_PHRASE" */ val RESERVED_PHRASE: typings.sqlFormatter.tokenMod.TokenType.RESERVED_PHRASE & String = js.native
  
  @js.native
  sealed trait RESERVED_SELECT
    extends StObject
       with TokenType
  /* "RESERVED_SELECT" */ val RESERVED_SELECT: typings.sqlFormatter.tokenMod.TokenType.RESERVED_SELECT & String = js.native
  
  @js.native
  sealed trait RESERVED_SET_OPERATION
    extends StObject
       with TokenType
  /* "RESERVED_SET_OPERATION" */ val RESERVED_SET_OPERATION: typings.sqlFormatter.tokenMod.TokenType.RESERVED_SET_OPERATION & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with TokenType
  /* "STRING" */ val STRING: typings.sqlFormatter.tokenMod.TokenType.STRING & String = js.native
  
  @js.native
  sealed trait VARIABLE
    extends StObject
       with TokenType
  /* "VARIABLE" */ val VARIABLE: typings.sqlFormatter.tokenMod.TokenType.VARIABLE & String = js.native
  
  @js.native
  sealed trait XOR
    extends StObject
       with TokenType
  /* "XOR" */ val XOR: typings.sqlFormatter.tokenMod.TokenType.XOR & String = js.native
}
