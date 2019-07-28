package typings.reduxDashPersist

import typings.reduxDashPersist.esPersistStoreMod.BoostrappedCallback
import typings.reduxDashPersist.esTypesMod.Persistor
import typings.reduxDashPersist.esTypesMod.PersistorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistStore", JSImport.Namespace)
@js.native
object libPersistStoreMod extends js.Object {
  def persistStore(store: js.Any): Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: PersistorOptions, callback: BoostrappedCallback): Persistor = js.native
}

