package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclPointJacobian extends js.Object {
  
  def add(T: SjclEllipticalPoint): SjclPointJacobian = js.native
  
  def doubl(): SjclPointJacobian = js.native
  
  def isValid(): Boolean = js.native
  
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian = js.native
  
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian = js.native
  
  def negate(): SjclPointJacobian = js.native
  
  def toAffine(): SjclEllipticalPoint = js.native
}
object SjclPointJacobian {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SjclPointJacobianOps[Self <: SjclPointJacobian] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: SjclEllipticalPoint => SjclPointJacobian): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoubl(value: () => SjclPointJacobian): Self = this.set("doubl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMult(value: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = this.set("mult", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMult2(value: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = this.set("mult2", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNegate(value: () => SjclPointJacobian): Self = this.set("negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToAffine(value: () => SjclEllipticalPoint): Self = this.set("toAffine", js.Any.fromFunction0(value))
  }
}
