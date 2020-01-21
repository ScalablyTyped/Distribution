package typings.reactFns.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[P] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ P, ReactNode]) | ReactNode] = js.undefined
  var component: js.UndefOr[ComponentType[P | Unit]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ P, ReactNode]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[P](
    children: (js.Function1[/* props */ P, ReactNode]) | ReactNode = null,
    component: ComponentType[P | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: /* props */ P => ReactNode = null
  ): SharedRenderProps[P] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[SharedRenderProps[P]]
  }
}

