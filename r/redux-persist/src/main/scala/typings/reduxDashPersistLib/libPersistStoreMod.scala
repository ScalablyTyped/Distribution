package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistStore", JSImport.Namespace)
@js.native
object libPersistStoreMod extends js.Object {
  def persistStore(store: js.Any): reduxDashPersistLib.esTypesMod.Persistor = js.native
  def persistStore(store: js.Any, persistorOptions: reduxDashPersistLib.esTypesMod.PersistorOptions): reduxDashPersistLib.esTypesMod.Persistor = js.native
  def persistStore(
    store: js.Any,
    persistorOptions: reduxDashPersistLib.esTypesMod.PersistorOptions,
    callback: reduxDashPersistLib.esPersistStoreMod.BoostrappedCallback
  ): reduxDashPersistLib.esTypesMod.Persistor = js.native
}

