package typings.sqlFormatter

import typings.sqlFormatter.libSrcLexerTokenMod.TokenType
import typings.sqlFormatter.libSrcParserGrammarMod._NearleySymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object Key {
    
    inline def apply(text: String): Key = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with _NearleySymbol {
    
    var literal: Any
  }
  object Literal {
    
    inline def apply(literal: Any): Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      inline def setLiteral(value: Any): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: String
    
    var start: Double
    
    var text: String
    
    var `type`: TokenType
  }
  object Raw {
    
    inline def apply(raw: String, start: Double, text: String, `type`: TokenType): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test
    extends StObject
       with _NearleySymbol {
    
    def test(token: Any): Boolean
  }
  object Test {
    
    inline def apply(test: Any => Boolean): Test = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      inline def setTest(value: Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait Text extends StObject {
    
    var text: String
    
    var `type`: TokenType
  }
  object Text {
    
    inline def apply(text: String, `type`: TokenType): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("''-bs")
    var `ApostropheApostrophe-bs`: String
    
    @JSName("''-qq")
    var `ApostropheApostrophe-qq`: String
    
    @JSName("''-qq-bs")
    var `ApostropheApostrophe-qq-bs`: String
    
    @JSName("''-raw")
    var `ApostropheApostrophe-raw`: String
    
    @JSName("'''..'''")
    var ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe: String
    
    @JSName("$$")
    var DollarDollar: String
    
    @JSName("``")
    var GraveaccentGraveaccent: String
    
    @JSName("{}")
    var LeftcurlybracketRightcurlybracket: String
    
    @JSName("\"\"-bs")
    var `QuotationmarkQuotationmark-bs`: String
    
    @JSName("\"\"-qq")
    var `QuotationmarkQuotationmark-qq`: String
    
    @JSName("\"\"-qq-bs")
    var `QuotationmarkQuotationmark-qq-bs`: String
    
    @JSName("\"\"-raw")
    var `QuotationmarkQuotationmark-raw`: String
    
    @JSName("\"\"\"..\"\"\"")
    var QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark: String
    
    var `[]`: String
    
    @JSName("q''")
    var qApostropheApostrophe: String
  }
  object _empty {
    
    inline def apply(
      `ApostropheApostrophe-bs`: String,
      `ApostropheApostrophe-qq`: String,
      `ApostropheApostrophe-qq-bs`: String,
      `ApostropheApostrophe-raw`: String,
      ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe: String,
      DollarDollar: String,
      GraveaccentGraveaccent: String,
      LeftcurlybracketRightcurlybracket: String,
      `QuotationmarkQuotationmark-bs`: String,
      `QuotationmarkQuotationmark-qq`: String,
      `QuotationmarkQuotationmark-qq-bs`: String,
      `QuotationmarkQuotationmark-raw`: String,
      QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark: String,
      `[]`: String,
      qApostropheApostrophe: String
    ): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("''-bs")(`ApostropheApostrophe-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-qq")(`ApostropheApostrophe-qq`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-qq-bs")(`ApostropheApostrophe-qq-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-raw")(`ApostropheApostrophe-raw`.asInstanceOf[js.Any])
      __obj.updateDynamic("'''..'''")(ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe.asInstanceOf[js.Any])
      __obj.updateDynamic("$$")(DollarDollar.asInstanceOf[js.Any])
      __obj.updateDynamic("``")(GraveaccentGraveaccent.asInstanceOf[js.Any])
      __obj.updateDynamic("{}")(LeftcurlybracketRightcurlybracket.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-bs")(`QuotationmarkQuotationmark-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-qq")(`QuotationmarkQuotationmark-qq`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-qq-bs")(`QuotationmarkQuotationmark-qq-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-raw")(`QuotationmarkQuotationmark-raw`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"\"..\"\"\"")(QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark.asInstanceOf[js.Any])
      __obj.updateDynamic("[]")(`[]`.asInstanceOf[js.Any])
      __obj.updateDynamic("q''")(qApostropheApostrophe.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def `setApostropheApostrophe-bs`(value: String): Self = StObject.set(x, "''-bs", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-qq`(value: String): Self = StObject.set(x, "''-qq", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-qq-bs`(value: String): Self = StObject.set(x, "''-qq-bs", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-raw`(value: String): Self = StObject.set(x, "''-raw", value.asInstanceOf[js.Any])
      
      inline def setApostropheApostropheApostropheDotDotApostropheApostropheApostrophe(value: String): Self = StObject.set(x, "'''..'''", value.asInstanceOf[js.Any])
      
      inline def setDollarDollar(value: String): Self = StObject.set(x, "$$", value.asInstanceOf[js.Any])
      
      inline def setGraveaccentGraveaccent(value: String): Self = StObject.set(x, "``", value.asInstanceOf[js.Any])
      
      inline def setLeftcurlybracketRightcurlybracket(value: String): Self = StObject.set(x, "{}", value.asInstanceOf[js.Any])
      
      inline def setQApostropheApostrophe(value: String): Self = StObject.set(x, "q''", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-bs`(value: String): Self = StObject.set(x, "\"\"-bs", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-qq`(value: String): Self = StObject.set(x, "\"\"-qq", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-qq-bs`(value: String): Self = StObject.set(x, "\"\"-qq-bs", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-raw`(value: String): Self = StObject.set(x, "\"\"-raw", value.asInstanceOf[js.Any])
      
      inline def setQuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark(value: String): Self = StObject.set(x, "\"\"\"..\"\"\"", value.asInstanceOf[js.Any])
      
      inline def `set[]`(value: String): Self = StObject.set(x, "[]", value.asInstanceOf[js.Any])
    }
  }
}
