package typings.reachSkipNav.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipNavProps extends js.Object {
  var children: js.UndefOr[String | ReactNode] = js.undefined
}

object SkipNavProps {
  @scala.inline
  def apply(children: String | ReactNode = null): SkipNavProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipNavProps]
  }
}

