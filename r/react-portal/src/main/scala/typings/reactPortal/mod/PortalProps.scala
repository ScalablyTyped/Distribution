package typings.reactPortal.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
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
  def apply(
    children: ReactNode = null,
    key: Key = null,
    node: js.UndefOr[Null | Element] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

