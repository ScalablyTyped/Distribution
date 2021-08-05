package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.TokenTypes
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Input extends StObject {
    
    var input: js.Any
    
    var parseKey: js.Any
    
    var regex: js.Any
  }
  object Input {
    
    inline def apply(input: js.Any, parseKey: js.Any, regex: js.Any): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], parseKey = parseKey.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setParseKey(value: js.Any): Self = StObject.set(x, "parseKey", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.Any): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: js.Any
    
    var quoteChar: js.Any
  }
  object Key {
    
    inline def apply(key: js.Any, quoteChar: js.Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoteChar = quoteChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setQuoteChar(value: js.Any): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait Regex extends StObject {
    
    var input: String
    
    var regex: RegExp
    
    var `type`: TokenTypes
  }
  object Regex {
    
    inline def apply(input: String, regex: RegExp, `type`: TokenTypes): Regex = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    extension [Self <: Regex](x: Self) {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.Any
    
    var value: js.Any
  }
  object Type {
    
    inline def apply(`type`: js.Any, value: js.Any): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
