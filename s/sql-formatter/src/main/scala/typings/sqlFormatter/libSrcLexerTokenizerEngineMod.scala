package typings.sqlFormatter

import typings.sqlFormatter.libSrcLexerTokenMod.Token
import typings.sqlFormatter.libSrcLexerTokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerTokenizerEngineMod {
  
  @JSImport("sql-formatter/lib/src/lexer/TokenizerEngine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TokenizerEngine {
    def this(rules: js.Array[TokenRule]) = this()
    
    /* private */ /* CompleteClass */
    var createParseError: Any = js.native
    
    /* private */ /* CompleteClass */
    var getNextToken: Any = js.native
    
    /* private */ /* CompleteClass */
    var getWhitespace: Any = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var input: Any = js.native
    
    /* private */ /* CompleteClass */
    var `match`: Any = js.native
    
    /* private */ /* CompleteClass */
    var rules: Any = js.native
    
    /**
      * Takes a SQL string and breaks it into tokens.
      * Each token is an object with type and value.
      *
      * @param {string} input - The SQL string
      * @returns {Token[]} output token stream
      */
    /* CompleteClass */
    override def tokenize(input: String): js.Array[Token] = js.native
  }
  
  trait RegExpLike extends StObject {
    
    def exec(input: String): js.Array[String] | Null
    
    var lastIndex: Double
  }
  object RegExpLike {
    
    inline def apply(exec: String => js.Array[String] | Null, lastIndex: Double): RegExpLike = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), lastIndex = lastIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegExpLike] (val x: Self) extends AnyVal {
      
      inline def setExec(value: String => js.Array[String] | Null): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenRule extends StObject {
    
    var key: js.UndefOr[js.Function1[/* rawText */ String, String]] = js.undefined
    
    var regex: RegExpLike
    
    var text: js.UndefOr[js.Function1[/* rawText */ String, String]] = js.undefined
    
    var `type`: TokenType
  }
  object TokenRule {
    
    inline def apply(regex: RegExpLike, `type`: TokenType): TokenRule = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenRule] (val x: Self) extends AnyVal {
      
      inline def setKey(value: /* rawText */ String => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRegex(value: RegExpLike): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setText(value: /* rawText */ String => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizerEngine extends StObject {
    
    /* private */ var createParseError: Any
    
    /* private */ var getNextToken: Any
    
    /* private */ var getWhitespace: Any
    
    /* private */ var index: Any
    
    /* private */ var input: Any
    
    /* private */ var `match`: Any
    
    /* private */ var rules: Any
    
    /**
      * Takes a SQL string and breaks it into tokens.
      * Each token is an object with type and value.
      *
      * @param {string} input - The SQL string
      * @returns {Token[]} output token stream
      */
    def tokenize(input: String): js.Array[Token]
  }
  object TokenizerEngine {
    
    inline def apply(
      createParseError: Any,
      getNextToken: Any,
      getWhitespace: Any,
      index: Any,
      input: Any,
      `match`: Any,
      rules: Any,
      tokenize: String => js.Array[Token]
    ): TokenizerEngine = {
      val __obj = js.Dynamic.literal(createParseError = createParseError.asInstanceOf[js.Any], getNextToken = getNextToken.asInstanceOf[js.Any], getWhitespace = getWhitespace.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], tokenize = js.Any.fromFunction1(tokenize))
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerEngine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizerEngine] (val x: Self) extends AnyVal {
      
      inline def setCreateParseError(value: Any): Self = StObject.set(x, "createParseError", value.asInstanceOf[js.Any])
      
      inline def setGetNextToken(value: Any): Self = StObject.set(x, "getNextToken", value.asInstanceOf[js.Any])
      
      inline def setGetWhitespace(value: Any): Self = StObject.set(x, "getWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: String => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    }
  }
}
