package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.TokenTypes
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Input extends StObject {
    
    var input: js.Any = js.native
    
    var parseKey: js.Any = js.native
    
    var regex: js.Any = js.native
  }
  object Input {
    
    @scala.inline
    def apply(input: js.Any, parseKey: js.Any, regex: js.Any): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], parseKey = parseKey.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseKey(value: js.Any): Self = StObject.set(x, "parseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: js.Any): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: js.Any = js.native
    
    var quoteChar: js.Any = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: js.Any, quoteChar: js.Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoteChar = quoteChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteChar(value: js.Any): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Regex extends StObject {
    
    var input: String = js.native
    
    var regex: RegExp = js.native
    
    var `type`: TokenTypes = js.native
  }
  object Regex {
    
    @scala.inline
    def apply(input: String, regex: RegExp, `type`: TokenTypes): Regex = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    @scala.inline
    implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TokenTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: js.Any, value: js.Any): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
