package typings.sat.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT")
@js.native
object ^ extends js.Object {
  def pointInCircle(p: Vector, c: Circle): Boolean = js.native
  def pointInPolygon(p: Vector, poly: Polygon): Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle): Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle, response: Response): Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon): Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon, response: Response): Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle): Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle, response: Response): Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon): Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon, response: Response): Boolean = js.native
}

