package typings.reactDashNavigation.reactDashNavigationMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashNavigation.Anon_Nav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainer
  extends ComponentClass[
      (NavigationContainerProps[js.Object, js.Object]) with (NavigationNavigatorProps[_, js.Object]), 
      ComponentState
    ] {
  var navigationOptions: js.Any = js.native
  var router: NavigationRouter[_, _] = js.native
  var screenProps: StringDictionary[js.Any] = js.native
  var state: Anon_Nav = js.native
}

