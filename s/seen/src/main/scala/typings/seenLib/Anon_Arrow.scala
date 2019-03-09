package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arrow extends js.Object {
  def arrow(): seenLib.seenMod.Shape = js.native
  def arrow(thickness: scala.Double): seenLib.seenMod.Shape = js.native
  def arrow(thickness: scala.Double, tailLength: scala.Double): seenLib.seenMod.Shape = js.native
  def arrow(thickness: scala.Double, tailLength: scala.Double, tailWidth: scala.Double): seenLib.seenMod.Shape = js.native
  def arrow(
    thickness: scala.Double,
    tailLength: scala.Double,
    tailWidth: scala.Double,
    headLength: scala.Double
  ): seenLib.seenMod.Shape = js.native
  def arrow(
    thickness: scala.Double,
    tailLength: scala.Double,
    tailWidth: scala.Double,
    headLength: scala.Double,
    headPointiness: scala.Double
  ): seenLib.seenMod.Shape = js.native
  def cube(): seenLib.seenMod.Shape = js.native
  def custom(s: seenLib.seenMod.Shape): seenLib.seenMod.Shape = js.native
  def extrude(points: js.Array[seenLib.seenMod.Point], offset: seenLib.seenMod.Point): seenLib.seenMod.Shape = js.native
  def icosahedron(): seenLib.seenMod.Shape = js.native
  def mapPointsToSurfaces(points: js.Array[seenLib.seenMod.Point], coordinateMap: js.Array[js.Array[scala.Double]]): js.Array[seenLib.seenMod.Surface] = js.native
  def obj(objContents: java.lang.String): seenLib.seenMod.Shape = js.native
  def obj(objContents: java.lang.String, cullBackfaces: scala.Boolean): seenLib.seenMod.Shape = js.native
  def patch(): seenLib.seenMod.Shape = js.native
  def patch(nx: scala.Double): seenLib.seenMod.Shape = js.native
  def patch(nx: scala.Double, ny: scala.Double): seenLib.seenMod.Shape = js.native
  def path(points: js.Array[seenLib.seenMod.Point]): seenLib.seenMod.Shape = js.native
  def pipe(point1: seenLib.seenMod.Point, point2: seenLib.seenMod.Point): seenLib.seenMod.Shape = js.native
  def pipe(point1: seenLib.seenMod.Point, point2: seenLib.seenMod.Point, radius: scala.Double): seenLib.seenMod.Shape = js.native
  def pipe(
    point1: seenLib.seenMod.Point,
    point2: seenLib.seenMod.Point,
    radius: scala.Double,
    segments: scala.Double
  ): seenLib.seenMod.Shape = js.native
  def pyramid(): seenLib.seenMod.Shape = js.native
  def rectangle(point1: seenLib.seenMod.Point, point2: seenLib.seenMod.Point): seenLib.seenMod.Shape = js.native
  def sphere(): seenLib.seenMod.Shape = js.native
  def sphere(subdivisions: scala.Double): seenLib.seenMod.Shape = js.native
  def tetrahedron(): seenLib.seenMod.Shape = js.native
  def text(text: java.lang.String): seenLib.seenMod.Shape = js.native
  def text(text: java.lang.String, surfaceOptions: stdLib.Partial[seenLib.seenMod.Surface]): seenLib.seenMod.Shape = js.native
  def unitcube(): seenLib.seenMod.Shape = js.native
}

