package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signature_pad", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Bezier protected ()
    extends signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Bezier {
    def this(startPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point, control1: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point, control2: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point, endPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point) = this()
    /* CompleteClass */
    override var control1: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.CurveControl = js.native
    /* CompleteClass */
    override var control2: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.CurveControl = js.native
    /* CompleteClass */
    override var endPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var endWidth: scala.Double = js.native
    /* CompleteClass */
    override var startPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var startWidth: scala.Double = js.native
    /* CompleteClass */
    override def _point(t: scala.Double, start: scala.Double, c1: scala.Double, c2: scala.Double, end: scala.Double): scala.Double = js.native
    /* CompleteClass */
    override def length(): scala.Double = js.native
  }
  
  @js.native
  class CurveControl protected ()
    extends signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.CurveControl {
    def this(c1: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point, c2: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point) = this()
    /* CompleteClass */
    override var c1: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
    /* CompleteClass */
    override var c2: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
  }
  
  @js.native
  class Point protected ()
    extends signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point {
    def this(x: scala.Double, y: scala.Double, time: scala.Double) = this()
    /* CompleteClass */
    override var time: scala.Double = js.native
    /* CompleteClass */
    override var x: scala.Double = js.native
    /* CompleteClass */
    override var y: scala.Double = js.native
    /* CompleteClass */
    override def distanceTo(start: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point): scala.Double = js.native
    /* CompleteClass */
    override def velocityFrom(start: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point): scala.Double = js.native
  }
  
}

