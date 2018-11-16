package typings
package reduxDashPersistLib.esPersistReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistReducer", JSImport.Namespace)
@js.native
object esPersistReducerModMembers extends js.Object {
  def persistReducer[S, A /* <: reduxLib.reduxMod.Action[_] */](config: reduxDashPersistLib.esTypesMod.PersistConfig, baseReducer: reduxLib.reduxMod.Reducer[S, A]): reduxLib.reduxMod.Reducer[S with PersistPartial, A] = js.native
}

