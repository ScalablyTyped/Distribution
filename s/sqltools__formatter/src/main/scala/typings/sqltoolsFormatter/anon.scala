package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.TokenTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Input extends StObject {
    
    var input: Any
    
    var parseKey: Any
    
    var regex: Any
  }
  object Input {
    
    inline def apply(input: Any, parseKey: Any, regex: Any): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], parseKey = parseKey.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setParseKey(value: Any): Self = StObject.set(x, "parseKey", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Any): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: Any
    
    var quoteChar: Any
  }
  object Key {
    
    inline def apply(key: Any, quoteChar: Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoteChar = quoteChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setQuoteChar(value: Any): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait Regex extends StObject {
    
    var input: String
    
    var regex: js.RegExp
    
    var `type`: TokenTypes
  }
  object Regex {
    
    inline def apply(input: String, regex: js.RegExp, `type`: TokenTypes): Regex = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    extension [Self <: Regex](x: Self) {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: Any
    
    var value: Any
  }
  object Type {
    
    inline def apply(`type`: Any, value: Any): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
