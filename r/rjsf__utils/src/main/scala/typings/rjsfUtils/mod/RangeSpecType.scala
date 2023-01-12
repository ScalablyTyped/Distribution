package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties describing a Range specification in terms of attribute that can be added to the `HTML` `<input>` */
trait RangeSpecType extends StObject {
  
  /** Specifies the maximum value for an <input> element */
  var max: js.UndefOr[Double] = js.undefined
  
  /** Specifies a minimum value for an <input> element */
  var min: js.UndefOr[Double] = js.undefined
  
  /** Specifies the interval between legal numbers in an input field */
  var step: js.UndefOr[Double] = js.undefined
}
object RangeSpecType {
  
  inline def apply(): RangeSpecType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSpecType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeSpecType] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
