package typings.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interaction extends js.Object {
  var __count: Double
  var id: Double
  var name: String
  var timestamp: Double
}

object Interaction {
  @scala.inline
  def apply(__count: Double, id: Double, name: String, timestamp: Double): Interaction = {
    val __obj = js.Dynamic.literal(__count = __count, id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[Interaction]
  }
}

