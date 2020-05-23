package typings.reactBeforeunload.anon

import typings.react.mod.ReactNode
import typings.reactBeforeunload.mod.UseBeforeunloadHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object Children {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit], children: ReactNode = null): Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

