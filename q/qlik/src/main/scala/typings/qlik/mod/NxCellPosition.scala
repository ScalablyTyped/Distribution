package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxCellPosition extends StObject {
  
  var qx: Double = js.native
  
  var qy: Double = js.native
}
object NxCellPosition {
  
  @scala.inline
  def apply(qx: Double, qy: Double): NxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCellPosition]
  }
  
  @scala.inline
  implicit class NxCellPositionMutableBuilder[Self <: NxCellPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
  }
}
