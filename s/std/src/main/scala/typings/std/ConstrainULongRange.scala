package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainULongRange
  extends StObject
     with ULongRange {
  
  /* standard dom */
  var exact: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var ideal: js.UndefOr[Double] = js.undefined
}
object ConstrainULongRange {
  
  inline def apply(): ConstrainULongRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainULongRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstrainULongRange] (val x: Self) extends AnyVal {
    
    inline def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setIdeal(value: Double): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
