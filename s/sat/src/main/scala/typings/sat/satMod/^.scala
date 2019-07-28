package typings.sat.satMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pointInCircle(p: typings.sat.SATNs.Vector, c: typings.sat.SATNs.Circle): Boolean = js.native
  def pointInPolygon(p: typings.sat.SATNs.Vector, poly: typings.sat.SATNs.Polygon): Boolean = js.native
  def testCircleCircle(a: typings.sat.SATNs.Circle, b: typings.sat.SATNs.Circle): Boolean = js.native
  def testCircleCircle(a: typings.sat.SATNs.Circle, b: typings.sat.SATNs.Circle, response: typings.sat.SATNs.Response): Boolean = js.native
  def testCirclePolygon(circle: typings.sat.SATNs.Circle, polygon: typings.sat.SATNs.Polygon): Boolean = js.native
  def testCirclePolygon(
    circle: typings.sat.SATNs.Circle,
    polygon: typings.sat.SATNs.Polygon,
    response: typings.sat.SATNs.Response
  ): Boolean = js.native
  def testPolygonCircle(polygon: typings.sat.SATNs.Polygon, circle: typings.sat.SATNs.Circle): Boolean = js.native
  def testPolygonCircle(
    polygon: typings.sat.SATNs.Polygon,
    circle: typings.sat.SATNs.Circle,
    response: typings.sat.SATNs.Response
  ): Boolean = js.native
  def testPolygonPolygon(a: typings.sat.SATNs.Polygon, b: typings.sat.SATNs.Polygon): Boolean = js.native
  def testPolygonPolygon(a: typings.sat.SATNs.Polygon, b: typings.sat.SATNs.Polygon, response: typings.sat.SATNs.Response): Boolean = js.native
}

