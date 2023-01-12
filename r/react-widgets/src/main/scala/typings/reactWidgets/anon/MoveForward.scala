package typings.reactWidgets.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveForward extends StObject {
  
  var moveBack: Requireable[String]
  
  var moveForward: Requireable[String]
}
object MoveForward {
  
  inline def apply(moveBack: Requireable[String], moveForward: Requireable[String]): MoveForward = {
    val __obj = js.Dynamic.literal(moveBack = moveBack.asInstanceOf[js.Any], moveForward = moveForward.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveForward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveForward] (val x: Self) extends AnyVal {
    
    inline def setMoveBack(value: Requireable[String]): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
    
    inline def setMoveForward(value: Requireable[String]): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
  }
}
