package typings.reactDashPortal.reactDashPortalMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
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
    node: Element = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    openByClickOn: ReactElement = null,
    ref: LegacyRef[js.Any] = null
  ): PortalWithStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalWithStateProps]
  }
}

