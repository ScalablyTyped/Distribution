package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.sqltoolsFormatterStrings.db2
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.lower
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.n1ql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.plSlashsql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.preserve
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.sql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait TokenTypes extends StObject
  @JSImport("@sqltools/formatter/lib/core/types", "TokenTypes")
  @js.native
  object TokenTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TokenTypes & String] = js.native
    
    @js.native
    sealed trait BLOCK_COMMENT
      extends StObject
         with TokenTypes
    /* "block-comment" */ val BLOCK_COMMENT: typings.sqltoolsFormatter.typesMod.TokenTypes.BLOCK_COMMENT & String = js.native
    
    @js.native
    sealed trait CLOSE_PAREN
      extends StObject
         with TokenTypes
    /* "close-paren" */ val CLOSE_PAREN: typings.sqltoolsFormatter.typesMod.TokenTypes.CLOSE_PAREN & String = js.native
    
    @js.native
    sealed trait LINE_COMMENT
      extends StObject
         with TokenTypes
    /* "line-comment" */ val LINE_COMMENT: typings.sqltoolsFormatter.typesMod.TokenTypes.LINE_COMMENT & String = js.native
    
    @js.native
    sealed trait NO_SPACE_OPERATOR
      extends StObject
         with TokenTypes
    /* "no-space-operator" */ val NO_SPACE_OPERATOR: typings.sqltoolsFormatter.typesMod.TokenTypes.NO_SPACE_OPERATOR & String = js.native
    
    @js.native
    sealed trait NUMBER
      extends StObject
         with TokenTypes
    /* "number" */ val NUMBER: typings.sqltoolsFormatter.typesMod.TokenTypes.NUMBER & String = js.native
    
    @js.native
    sealed trait OPEN_PAREN
      extends StObject
         with TokenTypes
    /* "open-paren" */ val OPEN_PAREN: typings.sqltoolsFormatter.typesMod.TokenTypes.OPEN_PAREN & String = js.native
    
    @js.native
    sealed trait OPERATOR
      extends StObject
         with TokenTypes
    /* "operator" */ val OPERATOR: typings.sqltoolsFormatter.typesMod.TokenTypes.OPERATOR & String = js.native
    
    @js.native
    sealed trait PLACEHOLDER
      extends StObject
         with TokenTypes
    /* "placeholder" */ val PLACEHOLDER: typings.sqltoolsFormatter.typesMod.TokenTypes.PLACEHOLDER & String = js.native
    
    @js.native
    sealed trait RESERVED
      extends StObject
         with TokenTypes
    /* "reserved" */ val RESERVED: typings.sqltoolsFormatter.typesMod.TokenTypes.RESERVED & String = js.native
    
    @js.native
    sealed trait RESERVED_NEWLINE
      extends StObject
         with TokenTypes
    /* "reserved-newline" */ val RESERVED_NEWLINE: typings.sqltoolsFormatter.typesMod.TokenTypes.RESERVED_NEWLINE & String = js.native
    
    @js.native
    sealed trait RESERVED_TOP_LEVEL
      extends StObject
         with TokenTypes
    /* "reserved-top-level" */ val RESERVED_TOP_LEVEL: typings.sqltoolsFormatter.typesMod.TokenTypes.RESERVED_TOP_LEVEL & String = js.native
    
    @js.native
    sealed trait RESERVED_TOP_LEVEL_NO_INDENT
      extends StObject
         with TokenTypes
    /* "reserved-top-level-no-indent" */ val RESERVED_TOP_LEVEL_NO_INDENT: typings.sqltoolsFormatter.typesMod.TokenTypes.RESERVED_TOP_LEVEL_NO_INDENT & String = js.native
    
    @js.native
    sealed trait SERVERVARIABLE
      extends StObject
         with TokenTypes
    /* "servervariable" */ val SERVERVARIABLE: typings.sqltoolsFormatter.typesMod.TokenTypes.SERVERVARIABLE & String = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with TokenTypes
    /* "string" */ val STRING: typings.sqltoolsFormatter.typesMod.TokenTypes.STRING & String = js.native
    
    @js.native
    sealed trait WHITESPACE
      extends StObject
         with TokenTypes
    /* "whitespace" */ val WHITESPACE: typings.sqltoolsFormatter.typesMod.TokenTypes.WHITESPACE & String = js.native
    
    @js.native
    sealed trait WORD
      extends StObject
         with TokenTypes
    /* "word" */ val WORD: typings.sqltoolsFormatter.typesMod.TokenTypes.WORD & String = js.native
  }
  
  trait Config extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[sql | db2 | n1ql | plSlashsql] = js.undefined
    
    var linesBetweenQueries: js.UndefOr[Double | preserve] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var reservedWordCase: js.UndefOr[upper | lower] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLanguage(value: sql | db2 | n1ql | plSlashsql): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLinesBetweenQueries(value: Double | preserve): Self = StObject.set(x, "linesBetweenQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesBetweenQueriesUndefined: Self = StObject.set(x, "linesBetweenQueries", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReservedWordCase(value: upper | lower): Self = StObject.set(x, "reservedWordCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedWordCaseUndefined: Self = StObject.set(x, "reservedWordCase", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var `type`: TokenTypes
    
    var value: String
  }
  object Token {
    
    @scala.inline
    def apply(`type`: TokenTypes, value: String): Token = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setType(value: TokenTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizerConfig extends StObject {
    
    var closeParens: js.Array[String]
    
    var indexedPlaceholderTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var lineCommentTypes: js.Array[String]
    
    var namedPlaceholderTypes: js.Array[String]
    
    var openParens: js.Array[String]
    
    var reservedNewlineWords: js.Array[String]
    
    var reservedTopLevelWords: js.Array[String]
    
    var reservedTopLevelWordsNoIndent: js.Array[String]
    
    var reservedWords: js.Array[String]
    
    var specialWordChars: js.Array[String]
    
    var stringTypes: js.Array[String]
  }
  object TokenizerConfig {
    
    @scala.inline
    def apply(
      closeParens: js.Array[String],
      lineCommentTypes: js.Array[String],
      namedPlaceholderTypes: js.Array[String],
      openParens: js.Array[String],
      reservedNewlineWords: js.Array[String],
      reservedTopLevelWords: js.Array[String],
      reservedTopLevelWordsNoIndent: js.Array[String],
      reservedWords: js.Array[String],
      specialWordChars: js.Array[String],
      stringTypes: js.Array[String]
    ): TokenizerConfig = {
      val __obj = js.Dynamic.literal(closeParens = closeParens.asInstanceOf[js.Any], lineCommentTypes = lineCommentTypes.asInstanceOf[js.Any], namedPlaceholderTypes = namedPlaceholderTypes.asInstanceOf[js.Any], openParens = openParens.asInstanceOf[js.Any], reservedNewlineWords = reservedNewlineWords.asInstanceOf[js.Any], reservedTopLevelWords = reservedTopLevelWords.asInstanceOf[js.Any], reservedTopLevelWordsNoIndent = reservedTopLevelWordsNoIndent.asInstanceOf[js.Any], reservedWords = reservedWords.asInstanceOf[js.Any], specialWordChars = specialWordChars.asInstanceOf[js.Any], stringTypes = stringTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerConfig]
    }
    
    @scala.inline
    implicit class TokenizerConfigMutableBuilder[Self <: TokenizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseParens(value: js.Array[String]): Self = StObject.set(x, "closeParens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseParensVarargs(value: String*): Self = StObject.set(x, "closeParens", js.Array(value :_*))
      
      @scala.inline
      def setIndexedPlaceholderTypes(value: js.Array[String]): Self = StObject.set(x, "indexedPlaceholderTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedPlaceholderTypesUndefined: Self = StObject.set(x, "indexedPlaceholderTypes", js.undefined)
      
      @scala.inline
      def setIndexedPlaceholderTypesVarargs(value: String*): Self = StObject.set(x, "indexedPlaceholderTypes", js.Array(value :_*))
      
      @scala.inline
      def setLineCommentTypes(value: js.Array[String]): Self = StObject.set(x, "lineCommentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCommentTypesVarargs(value: String*): Self = StObject.set(x, "lineCommentTypes", js.Array(value :_*))
      
      @scala.inline
      def setNamedPlaceholderTypes(value: js.Array[String]): Self = StObject.set(x, "namedPlaceholderTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedPlaceholderTypesVarargs(value: String*): Self = StObject.set(x, "namedPlaceholderTypes", js.Array(value :_*))
      
      @scala.inline
      def setOpenParens(value: js.Array[String]): Self = StObject.set(x, "openParens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenParensVarargs(value: String*): Self = StObject.set(x, "openParens", js.Array(value :_*))
      
      @scala.inline
      def setReservedNewlineWords(value: js.Array[String]): Self = StObject.set(x, "reservedNewlineWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedNewlineWordsVarargs(value: String*): Self = StObject.set(x, "reservedNewlineWords", js.Array(value :_*))
      
      @scala.inline
      def setReservedTopLevelWords(value: js.Array[String]): Self = StObject.set(x, "reservedTopLevelWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedTopLevelWordsNoIndent(value: js.Array[String]): Self = StObject.set(x, "reservedTopLevelWordsNoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedTopLevelWordsNoIndentVarargs(value: String*): Self = StObject.set(x, "reservedTopLevelWordsNoIndent", js.Array(value :_*))
      
      @scala.inline
      def setReservedTopLevelWordsVarargs(value: String*): Self = StObject.set(x, "reservedTopLevelWords", js.Array(value :_*))
      
      @scala.inline
      def setReservedWords(value: js.Array[String]): Self = StObject.set(x, "reservedWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedWordsVarargs(value: String*): Self = StObject.set(x, "reservedWords", js.Array(value :_*))
      
      @scala.inline
      def setSpecialWordChars(value: js.Array[String]): Self = StObject.set(x, "specialWordChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialWordCharsVarargs(value: String*): Self = StObject.set(x, "specialWordChars", js.Array(value :_*))
      
      @scala.inline
      def setStringTypes(value: js.Array[String]): Self = StObject.set(x, "stringTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringTypesVarargs(value: String*): Self = StObject.set(x, "stringTypes", js.Array(value :_*))
    }
  }
}
