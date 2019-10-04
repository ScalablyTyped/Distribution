package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptimisticUpdater extends js.Object {
  @JSName("optimisticUpdater")
  var optimisticUpdater_Original: SelectorStoreUpdater[js.Object] = js.native
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object] = js.native
  def optimisticUpdater(store: RecordSourceSelectorProxy, data: js.Object): Unit = js.native
  def updater(store: RecordSourceSelectorProxy, data: js.Object): Unit = js.native
}

