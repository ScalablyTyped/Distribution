package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the cell postion of x- and y-axis.
  */
@js.native
trait INxCellPosition extends StObject {
  
  /**
    * Position of the cell on the x-axis.
    */
  var qx: Double = js.native
  
  /**
    * Position of the cell on the y-axis.
    */
  var qy: Double = js.native
}
object INxCellPosition {
  
  @scala.inline
  def apply(qx: Double, qy: Double): INxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCellPosition]
  }
  
  @scala.inline
  implicit class INxCellPositionMutableBuilder[Self <: INxCellPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
  }
}
