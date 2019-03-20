package typings
package reactDashScrollableDashAnchorLib.reactDashScrollableDashAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableAnchorProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: java.lang.String
}

object ScrollableAnchorProps {
  @scala.inline
  def apply(id: java.lang.String, children: reactLib.reactMod.ReactNs.ReactNode = null): ScrollableAnchorProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableAnchorProps]
  }
}

