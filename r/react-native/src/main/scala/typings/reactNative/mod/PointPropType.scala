package typings.reactNative.mod

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointPropType extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object PointPropType {
  
  @JSImport("react-native", "PointPropType")
  @js.native
  val ^ : Validator[PointPropType] = js.native
  
  @scala.inline
  implicit class PointPropTypeMutableBuilder[Self <: PointPropType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
