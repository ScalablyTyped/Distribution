package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclPointJacobian extends StObject {
  
  def add(T: SjclEllipticalPoint): SjclPointJacobian
  
  def doubl(): SjclPointJacobian
  
  def isValid(): Boolean
  
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian
  
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian
  
  def negate(): SjclPointJacobian
  
  def toAffine(): SjclEllipticalPoint
}
object SjclPointJacobian {
  
  inline def apply(
    add: SjclEllipticalPoint => SjclPointJacobian,
    doubl: () => SjclPointJacobian,
    isValid: () => Boolean,
    mult: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    mult2: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    negate: () => SjclPointJacobian,
    toAffine: () => SjclEllipticalPoint
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), doubl = js.Any.fromFunction0(doubl), isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction2(mult), mult2 = js.Any.fromFunction4(mult2), negate = js.Any.fromFunction0(negate), toAffine = js.Any.fromFunction0(toAffine))
    __obj.asInstanceOf[SjclPointJacobian]
  }
  
  extension [Self <: SjclPointJacobian](x: Self) {
    
    inline def setAdd(value: SjclEllipticalPoint => SjclPointJacobian): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDoubl(value: () => SjclPointJacobian): Self = StObject.set(x, "doubl", js.Any.fromFunction0(value))
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setMult(value: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = StObject.set(x, "mult", js.Any.fromFunction2(value))
    
    inline def setMult2(value: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = StObject.set(x, "mult2", js.Any.fromFunction4(value))
    
    inline def setNegate(value: () => SjclPointJacobian): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    inline def setToAffine(value: () => SjclEllipticalPoint): Self = StObject.set(x, "toAffine", js.Any.fromFunction0(value))
  }
}
