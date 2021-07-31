package typings.prettyFormat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: String
    
    var open: String
  }
  object Close {
    
    @scala.inline
    def apply(close: String, open: String): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
