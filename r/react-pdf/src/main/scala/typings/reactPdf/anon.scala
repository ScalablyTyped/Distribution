package typings.reactPdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PageNumber extends StObject {
    
    var pageNumber: String
  }
  object PageNumber {
    
    @scala.inline
    def apply(pageNumber: String): PageNumber = {
      val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageNumber]
    }
    
    @scala.inline
    implicit class PageNumberMutableBuilder[Self <: PageNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    }
  }
}
