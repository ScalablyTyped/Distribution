package typings
package reactDashPortalLib.reactDashPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalWithStateProps
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var node: js.UndefOr[stdLib.Element | scala.Null] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var openByClickOn: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  @JSName("children")
  def children_MPortalWithStateProps(params: PortalFunctionParams): reactLib.reactMod.ReactNs.ReactNode
}

object PortalWithStateProps {
  @scala.inline
  def apply(
    children: PortalFunctionParams => reactLib.reactMod.ReactNs.ReactNode,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    node: stdLib.Element = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    openByClickOn: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null
  ): PortalWithStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalWithStateProps]
  }
}

