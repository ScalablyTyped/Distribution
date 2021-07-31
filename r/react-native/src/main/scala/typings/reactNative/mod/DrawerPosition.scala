package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerPosition extends StObject {
  
  var Left: Double
  
  var Right: Double
}
object DrawerPosition {
  
  @scala.inline
  def apply(Left: Double, Right: Double): DrawerPosition = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerPosition]
  }
  
  @scala.inline
  implicit class DrawerPositionMutableBuilder[Self <: DrawerPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
  }
}
