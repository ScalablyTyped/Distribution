package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainDoubleRange extends DoubleRange {
  
  var exact: js.UndefOr[Double] = js.native
  
  var ideal: js.UndefOr[Double] = js.native
}
object ConstrainDoubleRange {
  
  @scala.inline
  def apply(): ConstrainDoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDoubleRange]
  }
  
  @scala.inline
  implicit class ConstrainDoubleRangeMutableBuilder[Self <: ConstrainDoubleRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIdeal(value: Double): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
