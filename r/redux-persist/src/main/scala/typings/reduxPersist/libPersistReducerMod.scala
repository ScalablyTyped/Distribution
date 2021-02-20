package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxPersist.persistReducerMod.PersistPartial
import typings.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersistReducerMod {
  
  @JSImport("redux-persist/lib/persistReducer", JSImport.Default)
  @js.native
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
}
