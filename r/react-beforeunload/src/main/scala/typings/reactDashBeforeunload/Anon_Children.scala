package typings.reactDashBeforeunload

import typings.react.reactMod.ReactNode
import typings.reactDashBeforeunload.reactDashBeforeunloadMod.UseBeforeunloadHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object Anon_Children {
  @scala.inline
  def apply(onBeforeunload: UseBeforeunloadHandler, children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = onBeforeunload)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

