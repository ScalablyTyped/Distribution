package typings.signaturePad

import typings.signaturePad.anon.End
import typings.signaturePad.distTypesPointMod.BasicPoint
import typings.signaturePad.distTypesPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBezierMod {
  
  @JSImport("signature_pad/dist/types/bezier", "Bezier")
  @js.native
  open class Bezier protected () extends StObject {
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
    
    /* private */ var point: Any = js.native
    
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
    def calculateControlPoints: Any = js.native
    inline def calculateControlPoints_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calculateControlPoints")(x.asInstanceOf[js.Any])
    
    inline def fromPoints(points: js.Array[Point], widths: End): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any], widths.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  }
}
