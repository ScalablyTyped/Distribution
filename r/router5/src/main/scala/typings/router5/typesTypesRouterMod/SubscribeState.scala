package typings.router5.typesTypesRouterMod

import typings.router5.typesTypesBaseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeState extends js.Object {
  var previousRoute: State
  var route: State
}

object SubscribeState {
  @scala.inline
  def apply(previousRoute: State, route: State): SubscribeState = {
    val __obj = js.Dynamic.literal(previousRoute = previousRoute, route = route)
  
    __obj.asInstanceOf[SubscribeState]
  }
}

