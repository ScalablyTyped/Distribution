package typings.reactPortal.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalWithStateProps
  extends Props[js.Any] {
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var node: js.UndefOr[Element | Null] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openByClickOn: js.UndefOr[ReactElement] = js.undefined
  @JSName("children")
  def children_MPortalWithStateProps(params: PortalFunctionParams): ReactNode
}

object PortalWithStateProps {
  @scala.inline
  def apply(
    children: PortalFunctionParams => ReactNode,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    node: js.UndefOr[Null | Element] = js.undefined,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    openByClickOn: ReactElement = null,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined
  ): PortalWithStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalWithStateProps]
  }
}

