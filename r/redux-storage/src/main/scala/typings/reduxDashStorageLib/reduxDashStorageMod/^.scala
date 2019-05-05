package typings
package reduxDashStorageLib.reduxDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LOAD: java.lang.String = js.native
  val SAVE: java.lang.String = js.native
  def createLoader[TState](engine: StorageEngine): Loader[TState] = js.native
  def createMiddleware(engine: StorageEngine): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[java.lang.String]): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createMiddleware(
    engine: StorageEngine,
    actionBlacklist: js.Array[java.lang.String],
    actionWhitelist: js.Array[java.lang.String]
  ): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createMiddleware(
    engine: StorageEngine,
    actionBlacklist: js.Array[java.lang.String],
    actionWhitelist: ActionTypeCheckCallback
  ): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def reducer[TState](reducer: reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction]): reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction] = js.native
  def reducer[TState](reducer: reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction], merger: StateMerger): reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction] = js.native
}

