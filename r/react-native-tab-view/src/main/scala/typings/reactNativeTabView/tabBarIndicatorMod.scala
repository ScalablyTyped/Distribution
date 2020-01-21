package typings.reactNativeTabView

import typings.react.mod.Component
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view/lib/typescript/src/TabBarIndicator", JSImport.Namespace)
@js.native
object tabBarIndicatorMod extends js.Object {
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
  
  @js.native
  class default[T /* <: Route */] () extends TabBarIndicator[T]
  
  type GetTabWidth = js.Function1[/* index */ Double, Double]
  type Props[T /* <: Route */] = SceneRendererProps with AnonGetTabWidth[T]
}

