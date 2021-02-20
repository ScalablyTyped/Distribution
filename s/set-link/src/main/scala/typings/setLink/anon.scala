package typings.setLink

import typings.express.mod.Response_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attach extends StObject {
    
    def attach(res: Response_[_]): Unit = js.native
  }
  object Attach {
    
    @scala.inline
    def apply(attach: Response_[_] => Unit): Attach = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
      __obj.asInstanceOf[Attach]
    }
    
    @scala.inline
    implicit class AttachMutableBuilder[Self <: Attach] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttach(value: Response_[_] => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    }
  }
}
