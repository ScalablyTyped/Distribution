package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclEllipticalPoint extends StObject {
  
  def isValid(): Boolean
  
  def mult(k: BigNumber): SjclEllipticalPoint
  
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint
  
  def multiples(): js.Array[SjclEllipticalPoint]
  
  def negate(): SjclEllipticalPoint
  
  def toBits(): BitArray_
  
  def toJac(): SjclPointJacobian
}
object SjclEllipticalPoint {
  
  inline def apply(
    isValid: () => Boolean,
    mult: BigNumber => SjclEllipticalPoint,
    mult2: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint,
    multiples: () => js.Array[SjclEllipticalPoint],
    negate: () => SjclEllipticalPoint,
    toBits: () => BitArray_,
    toJac: () => SjclPointJacobian
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction1(mult), mult2 = js.Any.fromFunction3(mult2), multiples = js.Any.fromFunction0(multiples), negate = js.Any.fromFunction0(negate), toBits = js.Any.fromFunction0(toBits), toJac = js.Any.fromFunction0(toJac))
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
  
  extension [Self <: SjclEllipticalPoint](x: Self) {
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setMult(value: BigNumber => SjclEllipticalPoint): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setMult2(value: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint): Self = StObject.set(x, "mult2", js.Any.fromFunction3(value))
    
    inline def setMultiples(value: () => js.Array[SjclEllipticalPoint]): Self = StObject.set(x, "multiples", js.Any.fromFunction0(value))
    
    inline def setNegate(value: () => SjclEllipticalPoint): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    inline def setToBits(value: () => BitArray_): Self = StObject.set(x, "toBits", js.Any.fromFunction0(value))
    
    inline def setToJac(value: () => SjclPointJacobian): Self = StObject.set(x, "toJac", js.Any.fromFunction0(value))
  }
}
