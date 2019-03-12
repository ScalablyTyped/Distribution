package typings
package reactDashPortalLib.reactDashPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  @JSName("children")
  var children_PortalProps: reactLib.reactMod.ReactNs.ReactNode
  var node: js.UndefOr[stdLib.Element | scala.Null] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    key: reactLib.reactMod.ReactNs.Key = null,
    node: stdLib.Element = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

