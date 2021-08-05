package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildContextProvider[CC] extends StObject {
  
  def getChildContext(): CC
}
object ChildContextProvider {
  
  inline def apply[CC](getChildContext: () => CC): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = js.Any.fromFunction0(getChildContext))
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  
  extension [Self <: ChildContextProvider[?], CC](x: Self & ChildContextProvider[CC]) {
    
    inline def setGetChildContext(value: () => CC): Self = StObject.set(x, "getChildContext", js.Any.fromFunction0(value))
  }
}
