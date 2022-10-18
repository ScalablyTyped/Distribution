package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.Store
import typings.reduxPersist.esCreateMigrateMod.MigrationConfig
import typings.reduxPersist.esCreateTransformMod.TransformConfig
import typings.reduxPersist.esPersistReducerMod.PersistPartial
import typings.reduxPersist.esTypesMod.MigrationManifest
import typings.reduxPersist.esTypesMod.PersistConfig
import typings.reduxPersist.esTypesMod.PersistMigrate
import typings.reduxPersist.esTypesMod.Persistoid
import typings.reduxPersist.esTypesMod.Persistor
import typings.reduxPersist.esTypesMod.PersistorOptions
import typings.reduxPersist.esTypesMod.Transform
import typings.reduxPersist.esTypesMod.TransformInbound
import typings.reduxPersist.esTypesMod.TransformOutbound
import typings.reduxPersist.reduxPersistStrings.persistColon
import typings.reduxPersist.reduxPersistStrings.persistSlashFLUSH
import typings.reduxPersist.reduxPersistStrings.persistSlashPAUSE
import typings.reduxPersist.reduxPersistStrings.persistSlashPERSIST
import typings.reduxPersist.reduxPersistStrings.persistSlashPURGE
import typings.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
object mod {
  
  @JSImport("redux-persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-persist", "DEFAULT_VERSION")
  @js.native
  val DEFAULT_VERSION: Double = js.native
  
  @JSImport("redux-persist", "FLUSH")
  @js.native
  val FLUSH: persistSlashFLUSH = js.native
  
  @JSImport("redux-persist", "KEY_PREFIX")
  @js.native
  val KEY_PREFIX: persistColon = js.native
  
  @JSImport("redux-persist", "PAUSE")
  @js.native
  val PAUSE: persistSlashPAUSE = js.native
  
  @JSImport("redux-persist", "PERSIST")
  @js.native
  val PERSIST: persistSlashPERSIST = js.native
  
  @JSImport("redux-persist", "PURGE")
  @js.native
  val PURGE: persistSlashPURGE = js.native
  
  @JSImport("redux-persist", "REGISTER")
  @js.native
  val REGISTER: persistSlashREGISTER = js.native
  
  @JSImport("redux-persist", "REHYDRATE")
  @js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  
  inline def createMigrate(migrations: MigrationManifest): PersistMigrate = ^.asInstanceOf[js.Dynamic].applyDynamic("createMigrate")(migrations.asInstanceOf[js.Any]).asInstanceOf[PersistMigrate]
  inline def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrate")(migrations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[PersistMigrate]
  
  inline def createPersistoid(config: PersistConfig[Any, Any, Any, Any]): Persistoid = ^.asInstanceOf[js.Dynamic].applyDynamic("createPersistoid")(config.asInstanceOf[js.Any]).asInstanceOf[Persistoid]
  
  inline def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")().asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any]).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  
  inline def getStoredState(config: PersistConfig[Any, Any, Any, Any]): js.Promise[js.UndefOr[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoredState")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Object]]]
  
  inline def persistCombineReducers[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], reducers: ReducersMapObject[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistCombineReducers")(config.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
  
  inline def persistReducer[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], baseReducer: Reducer[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistReducer")(config.asInstanceOf[js.Any], baseReducer.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
  
  inline def persistStore(store: Store[Any, AnyAction]): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: Null, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: Unit, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: PersistorOptions): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  
  inline def purgeStoredState[S](config: PersistConfig[S, Any, Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeStoredState")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
}
