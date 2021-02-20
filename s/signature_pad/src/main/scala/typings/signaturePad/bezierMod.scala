package typings.signaturePad

import typings.signaturePad.anon.End
import typings.signaturePad.pointMod.BasicPoint
import typings.signaturePad.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bezierMod {
  
  @JSImport("signature_pad/dist/types/bezier", "Bezier")
  @js.native
  class Bezier protected () extends StObject {
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
  object Bezier {
    
    @JSImport("signature_pad/dist/types/bezier", "Bezier")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("signature_pad/dist/types/bezier", "Bezier.calculateControlPoints")
    @js.native
    def calculateControlPoints: js.Any = js.native
    @scala.inline
    def calculateControlPoints_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calculateControlPoints")(x.asInstanceOf[js.Any])
    
    @JSImport("signature_pad/dist/types/bezier", "Bezier.fromPoints")
    @js.native
    def fromPoints(points: js.Array[Point], widths: End): Bezier = js.native
  }
}
