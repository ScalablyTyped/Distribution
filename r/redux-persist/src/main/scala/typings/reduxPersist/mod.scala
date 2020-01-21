package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.Store
import typings.reduxPersist.createMigrateMod.MigrationConfig
import typings.reduxPersist.createTransformMod.TransformConfig
import typings.reduxPersist.persistReducerMod.PersistPartial
import typings.reduxPersist.reduxPersistStrings.persistColon
import typings.reduxPersist.reduxPersistStrings.persistSlashFLUSH
import typings.reduxPersist.reduxPersistStrings.persistSlashPAUSE
import typings.reduxPersist.reduxPersistStrings.persistSlashPERSIST
import typings.reduxPersist.reduxPersistStrings.persistSlashPURGE
import typings.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistConfig
import typings.reduxPersist.typesMod.PersistMigrate
import typings.reduxPersist.typesMod.Persistoid
import typings.reduxPersist.typesMod.Persistor
import typings.reduxPersist.typesMod.PersistorOptions
import typings.reduxPersist.typesMod.Transform
import typings.reduxPersist.typesMod.TransformInbound
import typings.reduxPersist.typesMod.TransformOutbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
@JSImport("redux-persist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_VERSION: Double = js.native
  val FLUSH: persistSlashFLUSH = js.native
  val KEY_PREFIX: persistColon = js.native
  val PAUSE: persistSlashPAUSE = js.native
  val PERSIST: persistSlashPERSIST = js.native
  val PURGE: persistSlashPURGE = js.native
  val REGISTER: persistSlashREGISTER = js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  def createMigrate(migrations: MigrationManifest): PersistMigrate = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  def createPersistoid(config: PersistConfig[_, _, _, _]): Persistoid = js.native
  def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def getStoredState(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
  def persistCombineReducers[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistReducer[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistStore(store: Store[_, AnyAction]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
  def purgeStoredState[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}

