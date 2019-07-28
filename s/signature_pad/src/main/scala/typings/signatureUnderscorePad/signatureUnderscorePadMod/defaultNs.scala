package typings.signatureUnderscorePad.signatureUnderscorePadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signature_pad", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Bezier protected ()
    extends typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Bezier {
    def this(
      startPoint: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point,
      control1: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point,
      control2: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point,
      endPoint: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point
    ) = this()
    /* CompleteClass */
    override var control1: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.CurveControl = js.native
    /* CompleteClass */
    override var control2: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.CurveControl = js.native
    /* CompleteClass */
    override var endPoint: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var endWidth: Double = js.native
    /* CompleteClass */
    override var startPoint: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var startWidth: Double = js.native
    /* CompleteClass */
    override def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double = js.native
    /* CompleteClass */
    override def length(): Double = js.native
  }
  
  @js.native
  class CurveControl protected ()
    extends typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.CurveControl {
    def this(
      c1: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point,
      c2: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point
    ) = this()
    /* CompleteClass */
    override var c1: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var c2: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
  }
  
  @js.native
  class Point protected ()
    extends typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point {
    def this(x: Double, y: Double, time: Double) = this()
    /* CompleteClass */
    override var time: Double = js.native
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
    /* CompleteClass */
    override def distanceTo(start: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point): Double = js.native
    /* CompleteClass */
    override def velocityFrom(start: typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Point): Double = js.native
  }
  
}

