package typings.reduxPersist

import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxPersist.typesMod.Persistor
import typings.reduxPersist.typesMod.PersistorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistStoreMod {
  
  @JSImport("redux-persist/es/persistStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(store: Store[js.Any, AnyAction]): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  @scala.inline
  def default(store: Store[js.Any, AnyAction], persistorOptions: Null, callback: js.Function0[js.Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  @scala.inline
  def default(store: Store[js.Any, AnyAction], persistorOptions: Unit, callback: js.Function0[js.Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  @scala.inline
  def default(store: Store[js.Any, AnyAction], persistorOptions: PersistorOptions): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  @scala.inline
  def default(
    store: Store[js.Any, AnyAction],
    persistorOptions: PersistorOptions,
    callback: js.Function0[js.Any]
  ): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
}
