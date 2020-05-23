package typings.reduxDevtools

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.ElementClass
import typings.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IDevTools extends Instantiable0[ElementClass] {
    def instrument(): StoreEnhancer[js.Object, js.Object] = js.native
  }
  
  def createDevTools(el: ReactElement): IDevTools = js.native
  def persistState(debugSessionKey: String): StoreEnhancer[js.Object, js.Object] = js.native
  @js.native
  object default extends js.Object {
    def instrument(): js.Function1[/* opts */ js.Any, _] = js.native
  }
  
}

