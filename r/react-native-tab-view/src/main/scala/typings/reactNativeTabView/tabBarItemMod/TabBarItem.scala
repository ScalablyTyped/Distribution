package typings.reactNativeTabView.tabBarItemMod

import typings.react.mod.Component
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarItem[T /* <: Route */]
  extends Component[Props[T], js.Object, js.Any] {
  var getActiveOpacity: js.Any = js.native
  var getInactiveOpacity: js.Any = js.native
}

