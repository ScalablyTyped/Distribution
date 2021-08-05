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
  
  extension [Self <: SjclEllipticalCurve](x: Self) {
    
    inline def setFromBits(value: BitArray_ => SjclEllipticalPoint): Self = StObject.set(x, "fromBits", js.Any.fromFunction1(value))
  }
}
