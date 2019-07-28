package typings.seen.seenMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Shapes")
@js.native
object Shapes extends js.Object {
  def arrow(): Shape = js.native
  def arrow(thickness: Double): Shape = js.native
  def arrow(thickness: Double, tailLength: Double): Shape = js.native
  def arrow(thickness: Double, tailLength: Double, tailWidth: Double): Shape = js.native
  def arrow(thickness: Double, tailLength: Double, tailWidth: Double, headLength: Double): Shape = js.native
  def arrow(
    thickness: Double,
    tailLength: Double,
    tailWidth: Double,
    headLength: Double,
    headPointiness: Double
  ): Shape = js.native
  def cube(): Shape = js.native
  def custom(s: Shape): Shape = js.native
  def extrude(points: js.Array[Point], offset: Point): Shape = js.native
  def icosahedron(): Shape = js.native
  def mapPointsToSurfaces(points: js.Array[Point], coordinateMap: js.Array[js.Array[Double]]): js.Array[Surface] = js.native
  def obj(objContents: String): Shape = js.native
  def obj(objContents: String, cullBackfaces: Boolean): Shape = js.native
  def patch(): Shape = js.native
  def patch(nx: Double): Shape = js.native
  def patch(nx: Double, ny: Double): Shape = js.native
  def path(points: js.Array[Point]): Shape = js.native
  def pipe(point1: Point, point2: Point): Shape = js.native
  def pipe(point1: Point, point2: Point, radius: Double): Shape = js.native
  def pipe(point1: Point, point2: Point, radius: Double, segments: Double): Shape = js.native
  def pyramid(): Shape = js.native
  def rectangle(point1: Point, point2: Point): Shape = js.native
  def sphere(): Shape = js.native
  def sphere(subdivisions: Double): Shape = js.native
  def tetrahedron(): Shape = js.native
  def text(text: String): Shape = js.native
  def text(text: String, surfaceOptions: Partial[Surface]): Shape = js.native
  def unitcube(): Shape = js.native
}

