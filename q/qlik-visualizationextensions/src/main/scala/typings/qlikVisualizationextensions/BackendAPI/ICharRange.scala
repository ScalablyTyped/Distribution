package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICharRange extends StObject {
  
  /**
    * Number of occurrences found
    * Integer
    */
  var qCharCount: Double
  
  /**
    * Position of the first search occurrence
    * Integer
    */
  var qCharPos: Double
}
object ICharRange {
  
  inline def apply(qCharCount: Double, qCharPos: Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharRange]
  }
  
  extension [Self <: ICharRange](x: Self) {
    
    inline def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    inline def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
  }
}
