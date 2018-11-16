package typings
package reduxDashLocalstorageLib.reduxDashLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage", JSImport.Namespace)
@js.native
object reduxDashLocalstorageModMembers extends js.Object {
  val actionTypes: ActionTypes = js.native
  def default[A](): js.Any = js.native
  def default[A](storage: StorageAdapter[A]): js.Any = js.native
  def default[A](storage: StorageAdapter[A], key: java.lang.String): js.Any = js.native
  def default[A](storage: StorageAdapter[A], key: java.lang.String, callback: js.Function): js.Any = js.native
  def mergePersistedState(): js.Function1[
    /* next */ reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction], 
    reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction]
  ] = js.native
  def mergePersistedState(merge: js.Function2[/* initialState */ js.Any, /* persistentState */ js.Any, js.Any]): js.Function1[
    /* next */ reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction], 
    reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction]
  ] = js.native
  def transformState[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def transformState[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
}

