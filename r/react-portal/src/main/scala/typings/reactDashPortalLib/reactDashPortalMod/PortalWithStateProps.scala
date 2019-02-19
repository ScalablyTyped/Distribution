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
  var node: js.UndefOr[reactLib.Element | scala.Null] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var openByClickOn: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  @JSName("children")
  def children_MPortalWithStateProps(params: PortalFunctionParams): reactLib.reactMod.ReactNs.ReactNode
}

