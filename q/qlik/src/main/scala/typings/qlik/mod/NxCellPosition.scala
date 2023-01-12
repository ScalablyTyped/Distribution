package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxCellPosition extends StObject {
  
  var qx: Double
  
  var qy: Double
}
object NxCellPosition {
  
  inline def apply(qx: Double, qy: Double): NxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCellPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxCellPosition] (val x: Self) extends AnyVal {
    
    inline def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    inline def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
  }
}
