package typings.signaturePad

import typings.signaturePad.anon.End
import typings.signaturePad.pointMod.BasicPoint
import typings.signaturePad.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signature_pad/dist/types/bezier", JSImport.Namespace)
@js.native
object bezierMod extends js.Object {
  
  @js.native
  class Bezier protected () extends js.Object {
    def this(
      startPoint: Point,
      control2: BasicPoint,
      control1: BasicPoint,
      endPoint: Point,
      startWidth: Double,
      endWidth: Double
    ) = this()
    
    var control1: BasicPoint = js.native
    
    var control2: BasicPoint = js.native
    
    var endPoint: Point = js.native
    
    var endWidth: Double = js.native
    
    def length(): Double = js.native
    
    var point: js.Any = js.native
    
    var startPoint: Point = js.native
    
    var startWidth: Double = js.native
  }
  /* static members */
  @js.native
  object Bezier extends js.Object {
    
    var calculateControlPoints: js.Any = js.native
    
    def fromPoints(points: js.Array[Point], widths: End): Bezier = js.native
  }
}
