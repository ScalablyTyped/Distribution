package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainer
  extends reactLib.reactMod.ComponentClass[
      (NavigationContainerProps[js.Object, js.Object]) with (NavigationNavigatorProps[_, js.Object]), 
      reactLib.reactMod.ComponentState
    ] {
  var navigationOptions: js.Any = js.native
  var router: NavigationRouter[_, _] = js.native
  var screenProps: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var state: reactDashNavigationLib.Anon_Nav = js.native
}

