package typings.setLink

import typings.express.mod.Response_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attach extends StObject {
    
    def attach(res: Response_[js.Any]): Unit
  }
  object Attach {
    
    @scala.inline
    def apply(attach: Response_[js.Any] => Unit): Attach = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
      __obj.asInstanceOf[Attach]
    }
    
    @scala.inline
    implicit class AttachMutableBuilder[Self <: Attach] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttach(value: Response_[js.Any] => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    }
  }
}
