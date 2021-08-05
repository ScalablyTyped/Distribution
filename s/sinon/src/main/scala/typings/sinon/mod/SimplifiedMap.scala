package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplifiedMap
  extends StObject
     with SimplifiedSet {
  
  def get(key: js.Any): js.Any
}
object SimplifiedMap {
  
  inline def apply(get: js.Any => js.Any, has: js.Any => Boolean): SimplifiedMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedMap]
  }
  
  extension [Self <: SimplifiedMap](x: Self) {
    
    inline def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
