package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist", JSImport.Namespace)
@js.native
object reduxDashPersistMod extends js.Object {
  val DEFAULT_VERSION: scala.Double = js.native
  val FLUSH: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/FLUSH` = js.native
  val KEY_PREFIX: reduxDashPersistLib.reduxDashPersistLibStrings.`persist:` = js.native
  val PAUSE: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/PAUSE` = js.native
  val PERSIST: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/PERSIST` = js.native
  val PURGE: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/PURGE` = js.native
  val REGISTER: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/REGISTER` = js.native
  val REHYDRATE: reduxDashPersistLib.reduxDashPersistLibStrings.`persist/REHYDRATE` = js.native
  def createMigrate(migrations: reduxDashPersistLib.esTypesMod.MigrationManifest): reduxDashPersistLib.esCreateMigrateMod.MigrationDispatch = js.native
  def createMigrate(
    migrations: reduxDashPersistLib.esTypesMod.MigrationManifest,
    config: reduxDashPersistLib.esCreateMigrateMod.MigrationConfig
  ): reduxDashPersistLib.esCreateMigrateMod.MigrationDispatch = js.native
  def createPersistoid(config: reduxDashPersistLib.esTypesMod.PersistConfig): reduxDashPersistLib.esTypesMod.Persistoid = js.native
  def createTransform[S, R](
    inbound: reduxDashPersistLib.esCreateTransformMod.TransformIn[S, R],
    outbound: reduxDashPersistLib.esCreateTransformMod.TransformOut[R, S]
  ): reduxDashPersistLib.esCreateTransformMod.Transform[S, R] = js.native
  def createTransform[S, R](
    inbound: reduxDashPersistLib.esCreateTransformMod.TransformIn[S, R],
    outbound: reduxDashPersistLib.esCreateTransformMod.TransformOut[R, S],
    config: stdLib.Pick[
      reduxDashPersistLib.esTypesMod.PersistConfig, 
      reduxDashPersistLib.reduxDashPersistLibStrings.whitelist | reduxDashPersistLib.reduxDashPersistLibStrings.blacklist
    ]
  ): reduxDashPersistLib.esCreateTransformMod.Transform[S, R] = js.native
  def createWebStorage(`type`: java.lang.String): reduxDashPersistLib.esTypesMod.WebStorage = js.native
  def getStoredState(config: reduxDashPersistLib.esTypesMod.PersistConfig): js.Promise[_ | scala.Unit] = js.native
  def persistCombineReducers[S](
    config: reduxDashPersistLib.esTypesMod.PersistConfig,
    reducers: reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]
  ): reduxLib.reduxMod.Reducer[S with reduxDashPersistLib.esTypesMod.PersistedState, reduxLib.reduxMod.AnyAction] = js.native
  def persistReducer[S, A /* <: reduxLib.reduxMod.Action[_] */](config: reduxDashPersistLib.esTypesMod.PersistConfig, baseReducer: reduxLib.reduxMod.Reducer[S, A]): reduxLib.reduxMod.Reducer[S with reduxDashPersistLib.esPersistReducerMod.PersistPartial, A] = js.native
  def persistStore(store: js.Any): reduxDashPersistLib.esTypesMod.Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: reduxDashPersistLib.esTypesMod.PersistorOptions): reduxDashPersistLib.esTypesMod.Persistor = js.native
  def persistStore(
    store: js.Any,
    persistorOptions: reduxDashPersistLib.esTypesMod.PersistorOptions,
    callback: reduxDashPersistLib.esPersistStoreMod.BoostrappedCallback
  ): reduxDashPersistLib.esTypesMod.Persistor = js.native
  def purgeStoredState(config: reduxDashPersistLib.esTypesMod.PersistConfig): js.Any = js.native
}

