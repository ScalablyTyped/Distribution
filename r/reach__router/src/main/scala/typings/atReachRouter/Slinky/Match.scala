package typings.atReachRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.MatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.atReachRouter.atReachRouterMod.Match[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.atReachRouter.atReachRouterMod.Match[js.Any]].asInstanceOf[String | js.Object]
  def apply[TParams](path: String): BuildingComponent[tag.type, typings.atReachRouter.atReachRouterMod.Match[js.Any]] = {
    val __obj = js.Dynamic.literal(path = path)
  
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.atReachRouter.atReachRouterMod.Match[js.Any]]]
  }
  type Props = MatchProps[js.Any]
}

