package typings.router5.routerMod

import typings.router5.baseMod.State
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
    val __obj = js.Dynamic.literal(previousRoute = previousRoute.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeState]
  }
}

