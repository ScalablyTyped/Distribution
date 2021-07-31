package typings.reactNavigation.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNavigation.anon.Nav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainer
  extends StObject
     with ComponentClass[
      (NavigationContainerProps[js.Object, js.Object, js.Any]) & (NavigationNavigatorProps[js.Any, js.Object, js.Any]), 
      ComponentState
    ] {
  
  var navigationOptions: js.Any = js.native
  
  var router: NavigationRouter[js.Any, js.Any] = js.native
  
  var screenProps: js.Any = js.native
  
  var state: Nav = js.native
}
