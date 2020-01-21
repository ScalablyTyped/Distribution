package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLRedrawOptions extends js.Object {
  var height: Double
  var width: Double
  def project(lnglat: js.Array[Double]): js.Array[Double]
  def unproject(xy: js.Array[Double]): js.Array[Double]
}

object HTMLRedrawOptions {
  @scala.inline
  def apply(
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
}

