package typings.reduxDashStorage.reduxDashStorageMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LOAD: String = js.native
  val SAVE: String = js.native
  def createLoader[TState](engine: StorageEngine): Loader[TState] = js.native
  def createMiddleware(engine: StorageEngine): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def reducer[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = js.native
  def reducer[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = js.native
}

