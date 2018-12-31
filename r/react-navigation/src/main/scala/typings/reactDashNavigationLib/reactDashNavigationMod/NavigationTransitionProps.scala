package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTransitionProps extends js.Object {
  var index: scala.Double
  // The layout of the screen container
  var layout: NavigationLayout
  // The destination navigation state of the transition
  var navigation: NavigationScreenProp[NavigationState, NavigationParams]
  // The progressive index of the transitioner's navigation state.
  var position: AnimatedValue
  // The value that represents the progress of the transition when navigation
  // state changes from one to another. Its numberic value will range from 0
  // to 1.
  //  progress.__getAnimatedValue() < 1 : transtion is happening.
  //  progress.__getAnimatedValue() == 1 : transtion completes.
  var progress: AnimatedValue
  // The active scene, corresponding to the route at
  // `navigation.state.routes[navigation.state.index]`. When rendering
  // NavigationSceneRendererPropsIndex, the scene does not refer to the active
  // scene, but instead the scene that is being rendered. The index always
  // is the index of the scene
  var scene: NavigationScene
  // All the scenes of the transitioner.
  var scenes: js.Array[NavigationScene]
  var screenProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

