package typings.reduxPersist.persistReducerMod

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/persistReducer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
}
