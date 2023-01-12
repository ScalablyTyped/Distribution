package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharResult extends StObject {
  
  def get_value(): Any
}
object CharResult {
  
  inline def apply(get_value: () => Any): CharResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[CharResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharResult] (val x: Self) extends AnyVal {
    
    inline def setGet_value(value: () => Any): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
