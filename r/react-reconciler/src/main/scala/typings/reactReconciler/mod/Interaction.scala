package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scheduler/Tracing
trait Interaction extends js.Object {
  var __count: Double
  var id: Double
  var name: String
  var timestamp: Double
}

object Interaction {
  @scala.inline
  def apply(__count: Double, id: Double, name: String, timestamp: Double): Interaction = {
    val __obj = js.Dynamic.literal(__count = __count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction]
  }
}

