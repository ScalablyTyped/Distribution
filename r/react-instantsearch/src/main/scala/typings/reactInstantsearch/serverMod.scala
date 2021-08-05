package typings.reactInstantsearch

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-instantsearch/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findResultsState(App: ComponentType[js.Any], props: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findResultsState")(App.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
