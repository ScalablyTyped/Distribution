package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStateAny extends StObject {
  
  var data: StateAny
}
object DataStateAny {
  
  inline def apply(data: StateAny): DataStateAny = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStateAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataStateAny] (val x: Self) extends AnyVal {
    
    inline def setData(value: StateAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
