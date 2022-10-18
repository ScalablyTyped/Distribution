package typings.sqlFormatter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcParserGrammarMod extends Shortcut {
  
  @JSImport("sql-formatter/lib/src/parser/grammar", JSImport.Default)
  @js.native
  val default: Grammar = js.native
  
  trait Grammar extends StObject {
    
    var Lexer: js.UndefOr[NearleyLexer] = js.undefined
    
    var ParserRules: js.Array[NearleyRule]
    
    var ParserStart: String
  }
  object Grammar {
    
    inline def apply(ParserRules: js.Array[NearleyRule], ParserStart: String): Grammar = {
      val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grammar]
    }
    
    extension [Self <: Grammar](x: Self) {
      
      inline def setLexer(value: NearleyLexer): Self = StObject.set(x, "Lexer", value.asInstanceOf[js.Any])
      
      inline def setLexerUndefined: Self = StObject.set(x, "Lexer", js.undefined)
      
      inline def setParserRules(value: js.Array[NearleyRule]): Self = StObject.set(x, "ParserRules", value.asInstanceOf[js.Any])
      
      inline def setParserRulesVarargs(value: NearleyRule*): Self = StObject.set(x, "ParserRules", js.Array(value*))
      
      inline def setParserStart(value: String): Self = StObject.set(x, "ParserStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait NearleyLexer extends StObject {
    
    def formatError(token: scala.Nothing): String
    
    def has(tokenType: String): Boolean
    
    def next(): js.UndefOr[NearleyToken]
    
    def reset(chunk: String, info: Any): Unit
    
    def save(): Any
  }
  object NearleyLexer {
    
    inline def apply(
      has: String => Boolean,
      next: () => js.UndefOr[NearleyToken],
      reset: (String, Any) => Unit,
      save: () => Any
    ): NearleyLexer = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction2(reset), save = js.Any.fromFunction0(save))
      __obj.asInstanceOf[NearleyLexer]
    }
    
    extension [Self <: NearleyLexer](x: Self) {
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setNext(value: () => js.UndefOr[NearleyToken]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReset(value: (String, Any) => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      inline def setSave(value: () => Any): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    }
  }
  
  trait NearleyRule extends StObject {
    
    var name: String
    
    var postprocess: js.UndefOr[
        js.Function3[
          /* d */ js.Array[Any], 
          /* loc */ js.UndefOr[Double], 
          /* reject */ js.UndefOr[js.Object], 
          Any
        ]
      ] = js.undefined
    
    var symbols: js.Array[NearleySymbol]
  }
  object NearleyRule {
    
    inline def apply(name: String, symbols: js.Array[NearleySymbol]): NearleyRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[NearleyRule]
    }
    
    extension [Self <: NearleyRule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPostprocess(
        value: (/* d */ js.Array[Any], /* loc */ js.UndefOr[Double], /* reject */ js.UndefOr[js.Object]) => Any
      ): Self = StObject.set(x, "postprocess", js.Any.fromFunction3(value))
      
      inline def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      inline def setSymbols(value: js.Array[NearleySymbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsVarargs(value: NearleySymbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.sqlFormatter.anon.Literal
    - typings.sqlFormatter.anon.Test
  */
  type NearleySymbol = _NearleySymbol | String
  
  trait NearleyToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var value: Any
  }
  object NearleyToken {
    
    inline def apply(value: Any): NearleyToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NearleyToken]
    }
    
    extension [Self <: NearleyToken](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _NearleySymbol extends StObject
  object _NearleySymbol {
    
    inline def Literal(literal: Any): typings.sqlFormatter.anon.Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sqlFormatter.anon.Literal]
    }
    
    inline def Test(test: Any => Boolean): typings.sqlFormatter.anon.Test = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.sqlFormatter.anon.Test]
    }
  }
  
  type _To = Grammar
  
  /* This means you don't have to write `default`, but can instead just say `libSrcParserGrammarMod.foo` */
  override def _to: Grammar = default
}
