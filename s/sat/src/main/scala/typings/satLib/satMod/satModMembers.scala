package typings
package satLib.satMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sat", JSImport.Namespace)
@js.native
object satModMembers extends js.Object {
  def pointInCircle(p: satLib.SATNs.Vector, c: satLib.SATNs.Circle): scala.Boolean = js.native
  def pointInPolygon(p: satLib.SATNs.Vector, poly: satLib.SATNs.Polygon): scala.Boolean = js.native
  def testCircleCircle(a: satLib.SATNs.Circle, b: satLib.SATNs.Circle): scala.Boolean = js.native
  def testCircleCircle(a: satLib.SATNs.Circle, b: satLib.SATNs.Circle, response: satLib.SATNs.Response): scala.Boolean = js.native
  def testCirclePolygon(circle: satLib.SATNs.Circle, polygon: satLib.SATNs.Polygon): scala.Boolean = js.native
  def testCirclePolygon(circle: satLib.SATNs.Circle, polygon: satLib.SATNs.Polygon, response: satLib.SATNs.Response): scala.Boolean = js.native
  def testPolygonCircle(polygon: satLib.SATNs.Polygon, circle: satLib.SATNs.Circle): scala.Boolean = js.native
  def testPolygonCircle(polygon: satLib.SATNs.Polygon, circle: satLib.SATNs.Circle, response: satLib.SATNs.Response): scala.Boolean = js.native
  def testPolygonPolygon(a: satLib.SATNs.Polygon, b: satLib.SATNs.Polygon): scala.Boolean = js.native
  def testPolygonPolygon(a: satLib.SATNs.Polygon, b: satLib.SATNs.Polygon, response: satLib.SATNs.Response): scala.Boolean = js.native
}

