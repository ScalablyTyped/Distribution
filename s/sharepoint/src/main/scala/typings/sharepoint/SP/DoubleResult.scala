package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleResult extends StObject {
  
  def get_value(): Double
}
object DoubleResult {
  
  inline def apply(get_value: () => Double): DoubleResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DoubleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleResult] (val x: Self) extends AnyVal {
    
    inline def setGet_value(value: () => Double): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
