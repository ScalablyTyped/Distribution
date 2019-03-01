package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Start extends js.Object {
  var start: scala.Double
  var stop: scala.Double
}

object Anon_Start {
  @scala.inline
  def apply(start: scala.Double, stop: scala.Double): Anon_Start = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Anon_Start]
  }
}

