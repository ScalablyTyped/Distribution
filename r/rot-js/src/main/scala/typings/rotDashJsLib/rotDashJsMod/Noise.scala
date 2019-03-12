package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  def get(x: scala.Double, y: scala.Double): scala.Double
}

object Noise {
  @scala.inline
  def apply(get: (scala.Double, scala.Double) => scala.Double): Noise = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Noise]
  }
}

