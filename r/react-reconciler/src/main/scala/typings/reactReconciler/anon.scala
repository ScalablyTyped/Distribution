package typings.reactReconciler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait StringRef extends StObject {
    
    var _stringRef: js.UndefOr[String | Null] = js.undefined
  }
  object StringRef {
    
    @scala.inline
    def apply(): StringRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringRef]
    }
    
    @scala.inline
    implicit class StringRefMutableBuilder[Self <: StringRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_stringRef(value: String): Self = StObject.set(x, "_stringRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stringRefNull: Self = StObject.set(x, "_stringRef", null)
      
      @scala.inline
      def set_stringRefUndefined: Self = StObject.set(x, "_stringRef", js.undefined)
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: Double
  }
  object Timeout {
    
    @scala.inline
    def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
