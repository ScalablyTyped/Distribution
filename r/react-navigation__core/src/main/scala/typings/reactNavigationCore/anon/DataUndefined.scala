package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataUndefined extends StObject {
  
  var data: Unit
}
object DataUndefined {
  
  inline def apply(data: Unit): DataUndefined = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUndefined]
  }
  
  extension [Self <: DataUndefined](x: Self) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
