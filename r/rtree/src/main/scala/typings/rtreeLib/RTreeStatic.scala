package typings
package rtreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTreeStatic extends js.Object {
  def bbox(arg1: js.Any): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: scala.Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: scala.Double, arg4: scala.Double): js.Array[_] = js.native
  def geoJSON(geoJSON: js.Any): scala.Unit = js.native
  def insert(bounds: Rectangle, element: js.Object): scala.Boolean = js.native
  def remove(area: Rectangle): js.Array[_] = js.native
  def remove(area: Rectangle, element: js.Object): js.Array[_] = js.native
  def search(area: Rectangle): js.Array[_] = js.native
  def search(area: Rectangle, return_node: scala.Boolean): js.Array[_] = js.native
  def search(area: Rectangle, return_node: scala.Boolean, return_array: js.Array[_]): js.Array[_] = js.native
}

