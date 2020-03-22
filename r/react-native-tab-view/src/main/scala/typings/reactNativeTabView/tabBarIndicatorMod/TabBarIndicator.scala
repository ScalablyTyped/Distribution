package typings.reactNativeTabView.tabBarIndicatorMod

import typings.react.mod.Component
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarIndicator[T /* <: Route */]
  extends Component[Props[T], js.Object, js.Any] {
  var fadeInIndicator: js.Any = js.native
  var getTranslateX: js.Any = js.native
  var getWidth: js.Any = js.native
  var isIndicatorShown: js.Any = js.native
  var opacity: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabBarIndicator(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabBarIndicator(): Unit = js.native
}

