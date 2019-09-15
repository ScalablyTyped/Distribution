package typings.atReachRouter.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.ServerLocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ServerLocation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.atReachRouter.atReachRouterMod.ServerLocation] {
  override val component: String | js.Object = js.constructorOf[typings.atReachRouter.atReachRouterMod.ServerLocation].asInstanceOf[String | js.Object]
  def apply(url: String): BuildingComponent[tag.type, typings.atReachRouter.atReachRouterMod.ServerLocation] = {
    val __obj = js.Dynamic.literal(url = url)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ServerLocationProps
}

