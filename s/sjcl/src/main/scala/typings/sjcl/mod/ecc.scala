package typings.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecc extends Shortcut {
  
  @JSImport("sjcl", "ecc")
  @js.native
  val ^ : SjclEllipticCurveCryptography = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.curve")
  @js.native
  open class curve protected ()
    extends StObject
       with SjclEllipticalCurve {
    def this(Field: BigNumber, r: BigNumber, a: BigNumber, b: BigNumber, x: BigNumber, y: BigNumber) = this()
    
    /* CompleteClass */
    override def fromBits(bits: BitArray_): SjclEllipticalPoint = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.point")
  @js.native
  open class point protected ()
    extends StObject
       with SjclEllipticalPoint {
    def this(curve: SjclEllipticalCurve) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
    
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
    /* CompleteClass */
    override def mult(k: BigNumber): SjclEllipticalPoint = js.native
    
    /* CompleteClass */
    override def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint = js.native
    
    /* CompleteClass */
    override def multiples(): js.Array[SjclEllipticalPoint] = js.native
    
    /* CompleteClass */
    override def negate(): SjclEllipticalPoint = js.native
    
    /* CompleteClass */
    override def toBits(): BitArray_ = js.native
    
    /* CompleteClass */
    override def toJac(): SjclPointJacobian = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.pointJac")
  @js.native
  open class pointJac protected ()
    extends StObject
       with SjclPointJacobian {
    def this(curve: SjclEllipticalCurve) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: Unit, y: Unit, z: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber, z: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: Unit, z: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber, z: BigNumber) = this()
    
    /* CompleteClass */
    override def add(T: SjclEllipticalPoint): SjclPointJacobian = js.native
    
    /* CompleteClass */
    override def doubl(): SjclPointJacobian = js.native
    
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
    /* CompleteClass */
    override def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian = js.native
    
    /* CompleteClass */
    override def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian = js.native
    
    /* CompleteClass */
    override def negate(): SjclPointJacobian = js.native
    
    /* CompleteClass */
    override def toAffine(): SjclEllipticalPoint = js.native
  }
  
  type _To = SjclEllipticCurveCryptography
  
  /* This means you don't have to write `^`, but can instead just say `ecc.foo` */
  override def _to: SjclEllipticCurveCryptography = ^
}
