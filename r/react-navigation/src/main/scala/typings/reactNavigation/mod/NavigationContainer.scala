package typings.reactNavigation.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNavigation.anon.Nav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainer
  extends ComponentClass[
      (NavigationContainerProps[js.Object, js.Object, _]) with (NavigationNavigatorProps[_, js.Object, _]), 
      ComponentState
    ] {
  var navigationOptions: js.Any = js.native
  var router: NavigationRouter[_, _] = js.native
  var screenProps: js.Any = js.native
  var state: Nav = js.native
}

