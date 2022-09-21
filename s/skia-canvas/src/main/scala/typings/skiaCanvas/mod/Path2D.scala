package typings.skiaCanvas.mod

import typings.skiaCanvas.skiaCanvasStrings.evenodd
import typings.skiaCanvas.skiaCanvasStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Path2D * / any */ @JSImport("skia-canvas/lib", "Path2D")
@js.native
open class Path2D () extends StObject {
  
  val bounds: Path2DBounds = js.native
  
  def complement(otherPath: Path2D): Path2D = js.native
  
  def conicCurveTo(cpx: Double, cpy: Double, x: Double, y: Double, weight: Double): Unit = js.native
  
  def contains(x: Double, y: Double): Boolean = js.native
  
  var d: String = js.native
  
  def difference(otherPath: Path2D): Path2D = js.native
  
  val edges: js.Array[Path2DEdge] = js.native
  
  def interpolate(otherPath: Path2D, weight: Double): Path2D = js.native
  
  def intersect(otherPath: Path2D): Path2D = js.native
  
  def jitter(segmentLength: Double, amount: Double): Path2D = js.native
  def jitter(segmentLength: Double, amount: Double, seed: Double): Path2D = js.native
  
  def offset(dx: Double, dy: Double): Path2D = js.native
  
  def points(): js.Array[js.Tuple2[/* x */ Double, /* y */ Double]] = js.native
  def points(step: Double): js.Array[js.Tuple2[/* x */ Double, /* y */ Double]] = js.native
  
  def round(radius: Double): Path2D = js.native
  
  def roundRect(x: Double, y: Double, width: Double, height: Double, radii: js.Array[CornerRadius]): Any = js.native
  def roundRect(x: Double, y: Double, width: Double, height: Double, radii: Double): Any = js.native
  
  def simplify(): Path2D = js.native
  def simplify(rule: nonzero | evenodd): Path2D = js.native
  
  def transform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [matrix: DOMMatrix] | [a: number, b: number, c: number, d: number, e: number, f: number] is not an array type */ args: js.Array[/* matrix */ DOMMatrix]
  ): Path2D = js.native
  def transform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [matrix: DOMMatrix] | [a: number, b: number, c: number, d: number, e: number, f: number] is not an array type */ args: js.Tuple6[
      /* a */ Double, 
      /* b */ Double, 
      /* c */ Double, 
      /* d */ Double, 
      /* e */ Double, 
      /* f */ Double
    ]
  ): Path2D = js.native
  
  def trim(start: Double): Path2D = js.native
  def trim(start: Double, end: Double): Path2D = js.native
  def trim(start: Double, end: Double, inverted: Boolean): Path2D = js.native
  def trim(start: Double, inverted: Boolean): Path2D = js.native
  
  def union(otherPath: Path2D): Path2D = js.native
  
  def unwind(): Path2D = js.native
  
  def xor(otherPath: Path2D): Path2D = js.native
}
