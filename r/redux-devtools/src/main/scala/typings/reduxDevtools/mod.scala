package typings.reduxDevtools

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.ElementClass
import typings.redux.mod.StoreEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("redux-devtools", "default.instrument")
    @js.native
    def instrument(): js.Function1[/* opts */ js.Any, _] = js.native
  }
  
  @JSImport("redux-devtools", "createDevTools")
  @js.native
  def createDevTools(el: ReactElement): IDevTools = js.native
  
  @JSImport("redux-devtools", "persistState")
  @js.native
  def persistState(debugSessionKey: String): StoreEnhancer[js.Object, js.Object] = js.native
  
  @js.native
  trait IDevTools extends Instantiable0[ElementClass] {
    
    def instrument(): StoreEnhancer[js.Object, js.Object] = js.native
  }
}
