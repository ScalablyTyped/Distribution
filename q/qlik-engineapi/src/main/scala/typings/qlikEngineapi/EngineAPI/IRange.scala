package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Range...
  */
trait IRange extends StObject {
  
  /**
    * Highest value in the range
    */
  var qMax: Double
  
  /**
    * If set to true, the range includes the highest value in the range of selections (Equals to ). [bn(50500)]
    * Example:
    *            The range is [1,10]. If qMinInclEq is set to true it means that 10 is included in the range of selections.
    */
  var qMaxInclEq: Boolean
  
  /**
    * Lowest value in the range
    */
  var qMin: Double
  
  /**
    * If set to true, the range includes the lowest value in the range of selections (Equals to ). [bn(50500)]
    * Example:
    *           The range is [1,10]. If qMinInclEq is set to true it means that 1 is included in the range of selections.
    */
  var qMinInclEq: Boolean
}
object IRange {
  
  inline def apply(qMax: Double, qMaxInclEq: Boolean, qMin: Double, qMinInclEq: Boolean): IRange = {
    val __obj = js.Dynamic.literal(qMax = qMax.asInstanceOf[js.Any], qMaxInclEq = qMaxInclEq.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qMinInclEq = qMinInclEq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRange] (val x: Self) extends AnyVal {
    
    inline def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    inline def setQMaxInclEq(value: Boolean): Self = StObject.set(x, "qMaxInclEq", value.asInstanceOf[js.Any])
    
    inline def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    inline def setQMinInclEq(value: Boolean): Self = StObject.set(x, "qMinInclEq", value.asInstanceOf[js.Any])
  }
}
