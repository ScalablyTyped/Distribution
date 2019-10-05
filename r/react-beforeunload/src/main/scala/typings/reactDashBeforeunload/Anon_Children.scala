package typings.reactDashBeforeunload

import typings.react.reactMod.ReactNode
import typings.reactDashBeforeunload.reactDashBeforeunloadMod.UseBeforeunloadHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object Anon_Children {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit], children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

