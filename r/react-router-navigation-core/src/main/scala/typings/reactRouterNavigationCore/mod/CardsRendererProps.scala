package typings.reactRouterNavigationCore.mod

import typings.reactRouterNavigationCore.AnonParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardsRendererProps extends js.Object {
  var cards: js.Array[Card] = js.native
  var navigationState: NavigationState[AnonParams] = js.native
  def onNavigateBack(): Boolean = js.native
  def onNavigateBack(routeKey: String): Boolean = js.native
}

