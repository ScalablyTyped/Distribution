package typings.reduxDashPersist

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.reduxDashPersist.esTypesMod.Persistor
import typings.reduxDashPersist.esTypesMod.PersistorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistStore", JSImport.Namespace)
@js.native
object esPersistStoreMod extends js.Object {
  def default(store: Store[_, AnyAction]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
}

