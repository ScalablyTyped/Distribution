package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataOptionsObject extends StObject {
  
  var data: OptionsObject
}
object DataOptionsObject {
  
  inline def apply(data: OptionsObject): DataOptionsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptionsObject]
  }
  
  extension [Self <: DataOptionsObject](x: Self) {
    
    inline def setData(value: OptionsObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
