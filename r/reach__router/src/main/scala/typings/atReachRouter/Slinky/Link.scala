package typings.atReachRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.LinkGetProps
import typings.atReachRouter.atReachRouterMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.atReachRouter.atReachRouterMod.Link[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.atReachRouter.atReachRouterMod.Link[js.Any]].asInstanceOf[String | js.Object]
  def apply[TState](
    getProps: /* props */ LinkGetProps => js.Object = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    to: String = null
  ): BuildingComponent[tag.type, typings.atReachRouter.atReachRouterMod.Link[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.atReachRouter.atReachRouterMod.Link[js.Any]]]
  }
  type Props = LinkProps[js.Any]
}

