package typings
package reactDashFnsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[P] extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[P | scala.Unit]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[P](
    children: (js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode = null,
    component: reactLib.reactMod.ReactNs.ComponentType[P | scala.Unit] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    render: /* props */ P => reactLib.reactMod.ReactNs.ReactNode = null
  ): SharedRenderProps[P] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[SharedRenderProps[P]]
  }
}

