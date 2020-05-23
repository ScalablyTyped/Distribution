package typings.react.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: ReactNode = null): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

