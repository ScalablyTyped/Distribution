package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionInput extends StObject {
  
  var pos: js.Tuple2[Double, Double]
}
object PositionInput {
  
  inline def apply(pos: js.Tuple2[Double, Double]): PositionInput = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionInput] (val x: Self) extends AnyVal {
    
    inline def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
