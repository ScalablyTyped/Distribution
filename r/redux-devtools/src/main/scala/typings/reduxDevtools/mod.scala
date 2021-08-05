package typings.reduxDevtools

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.ElementClass
import typings.redux.mod.StoreEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("redux-devtools", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def instrument(): js.Function1[/* opts */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("instrument")().asInstanceOf[js.Function1[/* opts */ js.Any, js.Any]]
  }
  
  inline def createDevTools(el: ReactElement): IDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("createDevTools")(el.asInstanceOf[js.Any]).asInstanceOf[IDevTools]
  
  inline def persistState(debugSessionKey: String): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(debugSessionKey.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  
  @js.native
  trait IDevTools
    extends StObject
       with Instantiable0[ElementClass] {
    
    def instrument(): StoreEnhancer[js.Object, js.Object] = js.native
  }
}
