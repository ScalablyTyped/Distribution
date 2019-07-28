package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defined in scheduler/tracing
  */
trait SchedulerInteraction extends js.Object {
  var id: Double
  var name: String
  var timestamp: Double
}

object SchedulerInteraction {
  @scala.inline
  def apply(id: Double, name: String, timestamp: Double): SchedulerInteraction = {
    val __obj = js.Dynamic.literal(id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[SchedulerInteraction]
  }
}

