package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticUpdater extends js.Object {
  @JSName("optimisticUpdater")
  var optimisticUpdater_Original: SelectorStoreUpdater[js.Object] = js.native
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object] = js.native
  def optimisticUpdater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit = js.native
  def updater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit = js.native
}

