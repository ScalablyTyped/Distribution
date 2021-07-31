package typings.reactToastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var toastMessageFactory: js.Any
  }
  object ClassName {
    
    @scala.inline
    def apply(toastMessageFactory: js.Any): ClassName = {
      val __obj = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setToastMessageFactory(value: js.Any): Self = StObject.set(x, "toastMessageFactory", value.asInstanceOf[js.Any])
    }
  }
}
