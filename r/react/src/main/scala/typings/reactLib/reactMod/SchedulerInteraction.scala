package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defined in scheduler/tracing
  */
trait SchedulerInteraction extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var timestamp: scala.Double
}

object SchedulerInteraction {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, timestamp: scala.Double): SchedulerInteraction = {
    val __obj = js.Dynamic.literal(id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[SchedulerInteraction]
  }
}

