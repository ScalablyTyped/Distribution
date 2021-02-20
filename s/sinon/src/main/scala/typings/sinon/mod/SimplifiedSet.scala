package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplifiedSet extends StObject {
  
  def has(el: js.Any): Boolean = js.native
}
object SimplifiedSet {
  
  @scala.inline
  def apply(has: js.Any => Boolean): SimplifiedSet = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedSet]
  }
  
  @scala.inline
  implicit class SimplifiedSetMutableBuilder[Self <: SimplifiedSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHas(value: js.Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
