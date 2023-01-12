package typings.setLink

import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attach extends StObject {
    
    def attach(res: Response_[Any, Record[String, Any]]): Unit
  }
  object Attach {
    
    inline def apply(attach: Response_[Any, Record[String, Any]] => Unit): Attach = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
      __obj.asInstanceOf[Attach]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attach] (val x: Self) extends AnyVal {
      
      inline def setAttach(value: Response_[Any, Record[String, Any]] => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    }
  }
}
