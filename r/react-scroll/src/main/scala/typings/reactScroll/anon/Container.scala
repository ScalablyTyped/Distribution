package typings.reactScroll.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
}

object Container {
  @scala.inline
  def apply(container: HTMLElement = null): Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

