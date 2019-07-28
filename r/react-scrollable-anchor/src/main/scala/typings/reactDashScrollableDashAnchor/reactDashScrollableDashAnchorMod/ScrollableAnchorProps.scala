package typings.reactDashScrollableDashAnchor.reactDashScrollableDashAnchorMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableAnchorProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var id: String
}

object ScrollableAnchorProps {
  @scala.inline
  def apply(id: String, children: ReactNode = null): ScrollableAnchorProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableAnchorProps]
  }
}

