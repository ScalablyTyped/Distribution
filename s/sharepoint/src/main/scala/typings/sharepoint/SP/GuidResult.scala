package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidResult extends StObject {
  
  def get_value(): Guid
}
object GuidResult {
  
  inline def apply(get_value: () => Guid): GuidResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[GuidResult]
  }
  
  extension [Self <: GuidResult](x: Self) {
    
    inline def setGet_value(value: () => Guid): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
