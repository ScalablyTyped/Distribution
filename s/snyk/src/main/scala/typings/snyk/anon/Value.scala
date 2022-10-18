package typings.snyk.anon

import typings.snyk.distLibSnykTestCommonMod.SEVERITY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: Double
  
  var verboseName: SEVERITY
}
object Value {
  
  inline def apply(value: Double, verboseName: SEVERITY): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], verboseName = verboseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVerboseName(value: SEVERITY): Self = StObject.set(x, "verboseName", value.asInstanceOf[js.Any])
  }
}
