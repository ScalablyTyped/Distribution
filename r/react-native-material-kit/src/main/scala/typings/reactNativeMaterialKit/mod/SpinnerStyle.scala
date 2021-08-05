package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerStyle extends StObject {
  
  var strokeColor: js.UndefOr[js.Array[String]] = js.undefined
}
object SpinnerStyle {
  
  inline def apply(): SpinnerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerStyle]
  }
  
  extension [Self <: SpinnerStyle](x: Self) {
    
    inline def setStrokeColor(value: js.Array[String]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
  }
}
