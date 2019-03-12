package typings
package satLib.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT")
@js.native
object ^ extends js.Object {
  def pointInCircle(p: Vector, c: Circle): scala.Boolean = js.native
  def pointInPolygon(p: Vector, poly: Polygon): scala.Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle): scala.Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle, response: Response): scala.Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon): scala.Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon, response: Response): scala.Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle): scala.Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle, response: Response): scala.Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon): scala.Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon, response: Response): scala.Boolean = js.native
}

