package typings.reactCalendarTimeline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var group: Id
  var index: Double
}

object Group {
  @scala.inline
  def apply(group: Id, index: Double): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

