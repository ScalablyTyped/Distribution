package typings.reactNativeScreens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataClosingBoolean extends StObject {
  
  var data: ClosingBoolean
}
object DataClosingBoolean {
  
  inline def apply(data: ClosingBoolean): DataClosingBoolean = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataClosingBoolean]
  }
  
  extension [Self <: DataClosingBoolean](x: Self) {
    
    inline def setData(value: ClosingBoolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
