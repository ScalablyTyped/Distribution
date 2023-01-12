package typings.scBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Run extends StObject {
    
    var run: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Run {
    
    inline def apply(): Run = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Run]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
}
