package typings.reduxPersist

import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxPersist.typesMod.Persistor
import typings.reduxPersist.typesMod.PersistorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersistStoreMod {
  
  @JSImport("redux-persist/lib/persistStore", JSImport.Default)
  @js.native
  def default(store: Store[_, AnyAction]): Persistor = js.native
  @JSImport("redux-persist/lib/persistStore", JSImport.Default)
  @js.native
  def default(store: Store[_, AnyAction], persistorOptions: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Persistor = js.native
  @JSImport("redux-persist/lib/persistStore", JSImport.Default)
  @js.native
  def default(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  @JSImport("redux-persist/lib/persistStore", JSImport.Default)
  @js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  @JSImport("redux-persist/lib/persistStore", JSImport.Default)
  @js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
}
