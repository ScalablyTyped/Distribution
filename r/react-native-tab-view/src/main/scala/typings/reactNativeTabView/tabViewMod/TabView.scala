package typings.reactNativeTabView.tabViewMod

import typings.react.mod.Component
import typings.reactNativeTabView.anon.Layout
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabView[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  var handleLayout: js.Any = js.native
  var jumpToIndex: js.Any = js.native
  @JSName("state")
  var state_TabView: Layout = js.native
}

