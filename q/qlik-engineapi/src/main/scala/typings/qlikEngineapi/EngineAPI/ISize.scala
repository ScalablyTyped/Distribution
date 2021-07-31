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
  
  @scala.inline
  def apply(qcx: Double, qcy: Double): ISize = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
  
  @scala.inline
  implicit class ISizeMutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQcx(value: Double): Self = StObject.set(x, "qcx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQcy(value: Double): Self = StObject.set(x, "qcy", value.asInstanceOf[js.Any])
  }
}
