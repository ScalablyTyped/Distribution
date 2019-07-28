package typings.reduxDashPersist

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import typings.reduxDashPersist.esCreateMigrateMod.MigrationConfig
import typings.reduxDashPersist.esCreateMigrateMod.MigrationDispatch
import typings.reduxDashPersist.esCreateTransformMod.Transform
import typings.reduxDashPersist.esCreateTransformMod.TransformIn
import typings.reduxDashPersist.esCreateTransformMod.TransformOut
import typings.reduxDashPersist.esPersistReducerMod.PersistPartial
import typings.reduxDashPersist.esPersistStoreMod.BoostrappedCallback
import typings.reduxDashPersist.esTypesMod.MigrationManifest
import typings.reduxDashPersist.esTypesMod.PersistConfig
import typings.reduxDashPersist.esTypesMod.PersistedState
import typings.reduxDashPersist.esTypesMod.Persistoid
import typings.reduxDashPersist.esTypesMod.Persistor
import typings.reduxDashPersist.esTypesMod.PersistorOptions
import typings.reduxDashPersist.esTypesMod.WebStorage
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/FLUSH`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/PAUSE`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/PERSIST`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/PURGE`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/REGISTER`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist/REHYDRATE`
import typings.reduxDashPersist.reduxDashPersistStrings.`persist:`
import typings.reduxDashPersist.reduxDashPersistStrings.blacklist
import typings.reduxDashPersist.reduxDashPersistStrings.whitelist
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist", JSImport.Namespace)
@js.native
object reduxDashPersistMod extends js.Object {
  val DEFAULT_VERSION: Double = js.native
  val FLUSH: `persist/FLUSH` = js.native
  val KEY_PREFIX: `persist:` = js.native
  val PAUSE: `persist/PAUSE` = js.native
  val PERSIST: `persist/PERSIST` = js.native
  val PURGE: `persist/PURGE` = js.native
  val REGISTER: `persist/REGISTER` = js.native
  val REHYDRATE: `persist/REHYDRATE` = js.native
  def createMigrate(migrations: MigrationManifest): MigrationDispatch = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): MigrationDispatch = js.native
  def createPersistoid(config: PersistConfig): Persistoid = js.native
  def createTransform[S, R](inbound: TransformIn[S, R], outbound: TransformOut[R, S]): Transform[S, R] = js.native
  def createTransform[S, R](
    inbound: TransformIn[S, R],
    outbound: TransformOut[R, S],
    config: Pick[PersistConfig, whitelist | blacklist]
  ): Transform[S, R] = js.native
  def createWebStorage(`type`: String): WebStorage = js.native
  def getStoredState(config: PersistConfig): js.Promise[_ | Unit] = js.native
  def persistCombineReducers[S](config: PersistConfig, reducers: ReducersMapObject[_, Action[_]]): Reducer[S with PersistedState, AnyAction] = js.native
  def persistReducer[S, A /* <: Action[_] */](config: PersistConfig, baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistStore(store: js.Any): Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: PersistorOptions, callback: BoostrappedCallback): Persistor = js.native
  def purgeStoredState(config: PersistConfig): js.Any = js.native
}

