package typings.reactDashPortal.reactDashPortalMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps
  extends Props[js.Any] {
  @JSName("children")
  var children_PortalProps: ReactNode
  var node: js.UndefOr[Element | Null] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(children: ReactNode = null, key: Key = null, node: Element = null, ref: LegacyRef[js.Any] = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

