package typings.react.mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildContextProvider[?], CC] (val x: Self & ChildContextProvider[CC]) extends AnyVal {
    
    inline def setGetChildContext(value: () => CC): Self = StObject.set(x, "getChildContext", js.Any.fromFunction0(value))
  }
}
