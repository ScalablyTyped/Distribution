package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreState extends js.Object {
  var action: String
  var controlled: Boolean
  var index: Double
  var lifecycle: String
  var size: Double
  var status: String
}

object StoreState {
  @scala.inline
  def apply(
    action: String,
    controlled: Boolean,
    index: Double,
    lifecycle: String,
    size: Double,
    status: String
  ): StoreState = {
    val __obj = js.Dynamic.literal(action = action, controlled = controlled, index = index, lifecycle = lifecycle, size = size, status = status)
  
    __obj.asInstanceOf[StoreState]
  }
}

