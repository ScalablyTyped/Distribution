package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointPropType extends StObject {
  
  var x: Double
  
  var y: Double
}
object PointPropType {
  
  @JSImport("react-native-windows/rntypes", "PointPropType")
  @js.native
  val ^ : Validator[PointPropType] = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointPropType] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
