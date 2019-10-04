package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticUpdateFunction extends OptimisticUpdate {
  @JSName("storeUpdater")
  var storeUpdater_Original: StoreUpdater = js.native
  def storeUpdater(store: RecordSourceProxy): Unit = js.native
}

