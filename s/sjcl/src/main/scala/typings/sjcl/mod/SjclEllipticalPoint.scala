package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclEllipticalPoint extends StObject {
  
  def isValid(): Boolean = js.native
  
  def mult(k: BigNumber): SjclEllipticalPoint = js.native
  
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint = js.native
  
  def multiples(): js.Array[SjclEllipticalPoint] = js.native
  
  def negate(): SjclEllipticalPoint = js.native
  
  def toBits(): BitArray_ = js.native
  
  def toJac(): SjclPointJacobian = js.native
}
object SjclEllipticalPoint {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SjclEllipticalPointMutableBuilder[Self <: SjclEllipticalPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMult(value: BigNumber => SjclEllipticalPoint): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMult2(value: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint): Self = StObject.set(x, "mult2", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMultiples(value: () => js.Array[SjclEllipticalPoint]): Self = StObject.set(x, "multiples", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNegate(value: () => SjclEllipticalPoint): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBits(value: () => BitArray_): Self = StObject.set(x, "toBits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJac(value: () => SjclPointJacobian): Self = StObject.set(x, "toJac", js.Any.fromFunction0(value))
  }
}
