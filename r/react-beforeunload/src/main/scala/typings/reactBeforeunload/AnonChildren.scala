package typings.reactBeforeunload

import typings.react.mod.ReactNode
import typings.reactBeforeunload.mod.UseBeforeunloadHandler
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object AnonChildren {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event_ => js.UndefOr[String | Unit], children: ReactNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

