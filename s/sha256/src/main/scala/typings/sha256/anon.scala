package typings.sha256

import typings.sha256.sha256Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AsBytes extends StObject {
    
    var asBytes: `true` = js.native
  }
  object AsBytes {
    
    @scala.inline
    def apply(asBytes: `true`): AsBytes = {
      val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsBytes]
    }
    
    @scala.inline
    implicit class AsBytesMutableBuilder[Self <: AsBytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBytes(value: `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AsString extends StObject {
    
    var asString: `true` = js.native
  }
  object AsString {
    
    @scala.inline
    def apply(asString: `true`): AsString = {
      val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsString]
    }
    
    @scala.inline
    implicit class AsStringMutableBuilder[Self <: AsString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: `true`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
    }
  }
}
