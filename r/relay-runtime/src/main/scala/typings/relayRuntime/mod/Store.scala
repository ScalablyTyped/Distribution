package typings.relayRuntime.mod

import typings.relayRuntime.anon.GcReleaseBufferSize
import typings.relayRuntime.relayModernStoreMod.RelayModernStore
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
}

