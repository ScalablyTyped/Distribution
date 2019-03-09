package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "InertialMouse")
@js.native
class InertialMouse () extends js.Object {
  var xy: js.Array[scala.Double] = js.native
  def damp(): this.type = js.native
  def get(): js.Tuple2[scala.Double, scala.Double] = js.native
  def reset(): this.type = js.native
  def update(xy: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
}

/* static members */
@JSImport("seen", "InertialMouse")
@js.native
object InertialMouse extends js.Object {
  var inertiaExtinction: scala.Double = js.native
  var inertiaMsecDelay: scala.Double = js.native
  var smoothingTimeout: scala.Double = js.native
}

