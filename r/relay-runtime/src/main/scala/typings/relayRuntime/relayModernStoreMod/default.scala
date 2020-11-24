package typings.relayRuntime.relayModernStoreMod

import typings.relayRuntime.anon.GcReleaseBufferSize
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Default)
@js.native
class default protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
}
