package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclEllipticalCurve extends StObject {
  
  def fromBits(bits: BitArray_): SjclEllipticalPoint = js.native
}
object SjclEllipticalCurve {
  
  @scala.inline
  def apply(fromBits: BitArray_ => SjclEllipticalPoint): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits))
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
  
  @scala.inline
  implicit class SjclEllipticalCurveMutableBuilder[Self <: SjclEllipticalCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromBits(value: BitArray_ => SjclEllipticalPoint): Self = StObject.set(x, "fromBits", js.Any.fromFunction1(value))
  }
}
