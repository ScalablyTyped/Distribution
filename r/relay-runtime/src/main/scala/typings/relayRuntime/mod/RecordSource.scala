package typings.relayRuntime.mod

import typings.relayRuntime.relayRecordSourceMod.RelayRecordSource
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RecordSource")
@js.native
class RecordSource () extends RelayRecordSource {
  def this(records: RecordMap) = this()
}

/* static members */
@JSImport("relay-runtime", "RecordSource")
@js.native
object RecordSource extends js.Object {
  def create(): MutableRecordSource = js.native
  def create(records: RecordMap): MutableRecordSource = js.native
}

