package typings.sqltoolsFormatter.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenTypes extends js.Object
@JSImport("@sqltools/formatter/lib/core/types", "TokenTypes")
@js.native
object TokenTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TokenTypes with String] = js.native
  
  @js.native
  sealed trait BLOCK_COMMENT extends TokenTypes
  /* "block-comment" */ @js.native
  object BLOCK_COMMENT extends TopLevel[BLOCK_COMMENT with String]
  
  @js.native
  sealed trait CLOSE_PAREN extends TokenTypes
  /* "close-paren" */ @js.native
  object CLOSE_PAREN extends TopLevel[CLOSE_PAREN with String]
  
  @js.native
  sealed trait LINE_COMMENT extends TokenTypes
  /* "line-comment" */ @js.native
  object LINE_COMMENT extends TopLevel[LINE_COMMENT with String]
  
  @js.native
  sealed trait NO_SPACE_OPERATOR extends TokenTypes
  /* "no-space-operator" */ @js.native
  object NO_SPACE_OPERATOR extends TopLevel[NO_SPACE_OPERATOR with String]
  
  @js.native
  sealed trait NUMBER extends TokenTypes
  /* "number" */ @js.native
  object NUMBER extends TopLevel[NUMBER with String]
  
  @js.native
  sealed trait OPEN_PAREN extends TokenTypes
  /* "open-paren" */ @js.native
  object OPEN_PAREN extends TopLevel[OPEN_PAREN with String]
  
  @js.native
  sealed trait OPERATOR extends TokenTypes
  /* "operator" */ @js.native
  object OPERATOR extends TopLevel[OPERATOR with String]
  
  @js.native
  sealed trait PLACEHOLDER extends TokenTypes
  /* "placeholder" */ @js.native
  object PLACEHOLDER extends TopLevel[PLACEHOLDER with String]
  
  @js.native
  sealed trait RESERVED extends TokenTypes
  /* "reserved" */ @js.native
  object RESERVED extends TopLevel[RESERVED with String]
  
  @js.native
  sealed trait RESERVED_NEWLINE extends TokenTypes
  /* "reserved-newline" */ @js.native
  object RESERVED_NEWLINE extends TopLevel[RESERVED_NEWLINE with String]
  
  @js.native
  sealed trait RESERVED_TOP_LEVEL extends TokenTypes
  /* "reserved-top-level" */ @js.native
  object RESERVED_TOP_LEVEL extends TopLevel[RESERVED_TOP_LEVEL with String]
  
  @js.native
  sealed trait RESERVED_TOP_LEVEL_NO_INDENT extends TokenTypes
  /* "reserved-top-level-no-indent" */ @js.native
  object RESERVED_TOP_LEVEL_NO_INDENT extends TopLevel[RESERVED_TOP_LEVEL_NO_INDENT with String]
  
  @js.native
  sealed trait SERVERVARIABLE extends TokenTypes
  /* "servervariable" */ @js.native
  object SERVERVARIABLE extends TopLevel[SERVERVARIABLE with String]
  
  @js.native
  sealed trait STRING extends TokenTypes
  /* "string" */ @js.native
  object STRING extends TopLevel[STRING with String]
  
  @js.native
  sealed trait WHITESPACE extends TokenTypes
  /* "whitespace" */ @js.native
  object WHITESPACE extends TopLevel[WHITESPACE with String]
  
  @js.native
  sealed trait WORD extends TokenTypes
  /* "word" */ @js.native
  object WORD extends TopLevel[WORD with String]
}
