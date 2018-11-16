package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeaderProps extends NavigationTransitionProps {
  var mode: HeaderMode
  var router: NavigationRouter[NavigationState, NavigationStackScreenOptions]
  var style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  def getScreenDetails(navigationScene: NavigationScene): NavigationScreenDetails[NavigationStackScreenOptions]
  def leftInterpolator(props: NavigationSceneRendererProps): js.Object
  def rightInterpolator(props: NavigationSceneRendererProps): js.Object
  def titleInterpolator(props: NavigationSceneRendererProps): js.Object
}

