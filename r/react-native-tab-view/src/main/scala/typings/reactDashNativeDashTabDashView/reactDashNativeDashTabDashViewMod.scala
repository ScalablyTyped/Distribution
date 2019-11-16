package typings.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarMod.default
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view", JSImport.Namespace)
@js.native
object reactDashNativeDashTabDashViewMod extends js.Object {
  @js.native
  class TabBar[T /* <: Route */] () extends default[T]
  
  @js.native
  class TabView[T /* <: Route */] ()
    extends typings.reactDashNativeDashTabDashView.libTypescriptSrcTabViewMod.default[T]
  
  def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ T, Element] = js.native
  /* static members */
  @js.native
  object TabBar extends js.Object {
    var defaultProps: Anon_GetAccessibilityLabel = js.native
  }
  
  /* static members */
  @js.native
  object TabView extends js.Object {
    var defaultProps: Anon_GestureHandlerProps = js.native
  }
  
}

