package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeState extends js.Object {
  var previousRoute: router5Lib.typesTypesBaseMod.State
  var route: router5Lib.typesTypesBaseMod.State
}

object SubscribeState {
  @scala.inline
  def apply(previousRoute: router5Lib.typesTypesBaseMod.State, route: router5Lib.typesTypesBaseMod.State): SubscribeState = {
    val __obj = js.Dynamic.literal(previousRoute = previousRoute, route = route)
  
    __obj.asInstanceOf[SubscribeState]
  }
}

