package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.PromptProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Prompt
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Prompt] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Prompt].asInstanceOf[String | js.Object]
  def apply(
    message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Prompt] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PromptProps
}

