package typings.reactInstantsearchDom

import typings.react.mod.ComponentType
import typings.reactInstantsearchDom.anon.PickInstantSearchPropswid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-instantsearch-dom/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findResultsState[TProps /* <: PickInstantSearchPropswid */](App: ComponentType[TProps], props: TProps): js.Promise[js.UndefOr[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findResultsState")(App.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Any]]]
}
