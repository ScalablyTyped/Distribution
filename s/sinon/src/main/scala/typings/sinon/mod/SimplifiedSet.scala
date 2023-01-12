package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplifiedSet extends StObject {
  
  def has(el: Any): Boolean
}
object SimplifiedSet {
  
  inline def apply(has: Any => Boolean): SimplifiedSet = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimplifiedSet] (val x: Self) extends AnyVal {
    
    inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
