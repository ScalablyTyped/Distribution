package typings.reactNativeSensorManager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Temp extends StObject {
  
  var temp: Double
}
object Temp {
  
  inline def apply(temp: Double): Temp = {
    val __obj = js.Dynamic.literal(temp = temp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Temp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Temp] (val x: Self) extends AnyVal {
    
    inline def setTemp(value: Double): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
  }
}
