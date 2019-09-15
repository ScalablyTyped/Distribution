package typings.atReachRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.atReachRouter.atReachRouterMod.Location] {
  override val component: String | js.Object = js.constructorOf[typings.atReachRouter.atReachRouterMod.Location].asInstanceOf[String | js.Object]
  def apply(): BuildingComponent[tag.type, typings.atReachRouter.atReachRouterMod.Location] = {
    val __obj = js.Dynamic.literal()
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocationProps
}

