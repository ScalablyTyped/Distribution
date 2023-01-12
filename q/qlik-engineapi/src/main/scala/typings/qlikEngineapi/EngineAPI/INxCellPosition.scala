package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the cell postion of x- and y-axis.
  */
trait INxCellPosition extends StObject {
  
  /**
    * Position of the cell on the x-axis.
    */
  var qx: Double
  
  /**
    * Position of the cell on the y-axis.
    */
  var qy: Double
}
object INxCellPosition {
  
  inline def apply(qx: Double, qy: Double): INxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCellPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxCellPosition] (val x: Self) extends AnyVal {
    
    inline def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    inline def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
  }
}
