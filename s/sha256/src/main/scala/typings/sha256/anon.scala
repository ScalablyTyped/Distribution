package typings.sha256

import typings.sha256.sha256Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsBytes extends StObject {
    
    var asBytes: `true`
  }
  object AsBytes {
    
    @scala.inline
    def apply(): AsBytes = {
      val __obj = js.Dynamic.literal(asBytes = true)
      __obj.asInstanceOf[AsBytes]
    }
    
    @scala.inline
    implicit class AsBytesMutableBuilder[Self <: AsBytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBytes(value: `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsString extends StObject {
    
    var asString: `true`
  }
  object AsString {
    
    @scala.inline
    def apply(): AsString = {
      val __obj = js.Dynamic.literal(asString = true)
      __obj.asInstanceOf[AsString]
    }
    
    @scala.inline
    implicit class AsStringMutableBuilder[Self <: AsString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: `true`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
    }
  }
}
