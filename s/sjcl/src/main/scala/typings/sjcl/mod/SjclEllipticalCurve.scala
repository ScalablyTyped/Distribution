package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclEllipticalCurve extends StObject {
  
  def fromBits(bits: BitArray_): SjclEllipticalPoint
}
object SjclEllipticalCurve {
  
  inline def apply(fromBits: BitArray_ => SjclEllipticalPoint): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits))
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclEllipticalCurve] (val x: Self) extends AnyVal {
    
    inline def setFromBits(value: BitArray_ => SjclEllipticalPoint): Self = StObject.set(x, "fromBits", js.Any.fromFunction1(value))
  }
}
