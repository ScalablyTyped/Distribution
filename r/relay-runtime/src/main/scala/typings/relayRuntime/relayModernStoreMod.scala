package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.ReaderSelector
import typings.relayRuntime.relayStoreTypesMod.Snapshot
import typings.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Namespace)
@js.native
object relayModernStoreMod extends js.Object {
  @js.native
  class RelayModernStore protected () extends Store {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: AnonGcReleaseBufferSize) = this()
    def lookup(selector: ReaderSelector): Snapshot = js.native
    def toJSON(): js.Any = js.native
  }
  
}

