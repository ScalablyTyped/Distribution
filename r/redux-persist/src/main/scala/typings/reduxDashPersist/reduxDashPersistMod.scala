package typings.reduxDashPersist

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import typings.redux.reduxMod.Store
import typings.reduxDashPersist.esCreateMigrateMod.MigrationConfig
import typings.reduxDashPersist.esCreateTransformMod.TransformConfig
import typings.reduxDashPersist.esPersistReducerMod.PersistPartial
import typings.reduxDashPersist.esTypesMod.MigrationManifest
import typings.reduxDashPersist.esTypesMod.PersistConfig
import typings.reduxDashPersist.esTypesMod.PersistMigrate
import typings.reduxDashPersist.esTypesMod.Persistoid
import typings.reduxDashPersist.esTypesMod.Persistor
import typings.reduxDashPersist.esTypesMod.PersistorOptions
import typings.reduxDashPersist.esTypesMod.Transform
import typings.reduxDashPersist.esTypesMod.TransformInbound
import typings.reduxDashPersist.esTypesMod.TransformOutbound
import typings.reduxDashPersist.reduxDashPersistStrings.persistColon
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashFLUSH
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashPAUSE
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashPERSIST
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashPURGE
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashREGISTER
import typings.reduxDashPersist.reduxDashPersistStrings.persistSlashREHYDRATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
@JSImport("redux-persist", JSImport.Namespace)
@js.native
object reduxDashPersistMod extends js.Object {
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

