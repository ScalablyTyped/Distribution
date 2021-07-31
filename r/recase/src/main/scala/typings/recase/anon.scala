package typings.recase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exceptions extends StObject {
    
    var exceptions: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Exceptions {
    
    @scala.inline
    def apply(): Exceptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exceptions]
    }
    
    @scala.inline
    implicit class ExceptionsMutableBuilder[Self <: Exceptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceptions(value: StringDictionary[String]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    }
  }
}
