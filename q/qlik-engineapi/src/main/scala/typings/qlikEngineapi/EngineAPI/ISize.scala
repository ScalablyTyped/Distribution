package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size...
  */
trait ISize extends StObject {
  
  /**
    * Number of pixels on the x axis.
    */
  var qcx: Double
  
  /**
    * Number of pixels on the y axis.
    */
  var qcy: Double
}
object ISize {
  
  inline def apply(qcx: Double, qcy: Double): ISize = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
    
    inline def setQcx(value: Double): Self = StObject.set(x, "qcx", value.asInstanceOf[js.Any])
    
    inline def setQcy(value: Double): Self = StObject.set(x, "qcy", value.asInstanceOf[js.Any])
  }
}
