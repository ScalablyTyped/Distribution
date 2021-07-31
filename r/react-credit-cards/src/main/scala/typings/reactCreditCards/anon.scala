package typings.reactCreditCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Valid extends StObject {
    
    var valid: String
  }
  object Valid {
    
    @scala.inline
    def apply(valid: String): Valid = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Valid]
    }
    
    @scala.inline
    implicit class ValidMutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: String): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
