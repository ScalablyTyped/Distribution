package typings
package reduxDashPersistLib.libPersistReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistReducer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def persistReducer[S, A /* <: reduxLib.reduxMod.Action[_] */](config: reduxDashPersistLib.esTypesMod.PersistConfig, baseReducer: reduxLib.reduxMod.Reducer[S, A]): reduxLib.reduxMod.Reducer[S with reduxDashPersistLib.esPersistReducerMod.PersistPartial, A] = js.native
}

