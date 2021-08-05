package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanResult extends StObject {
  
  def get_value(): Boolean
}
object BooleanResult {
  
  inline def apply(get_value: () => Boolean): BooleanResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[BooleanResult]
  }
  
  extension [Self <: BooleanResult](x: Self) {
    
    inline def setGet_value(value: () => Boolean): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
