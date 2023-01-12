package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntResult extends StObject {
  
  def get_value(): Double
}
object IntResult {
  
  inline def apply(get_value: () => Double): IntResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[IntResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntResult] (val x: Self) extends AnyVal {
    
    inline def setGet_value(value: () => Double): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
