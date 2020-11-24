package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/RelayRecordSource", JSImport.Namespace)
@js.native
object relayRecordSourceMod extends js.Object {
  
  @js.native
  class RelayRecordSource () extends MutableRecordSource {
    def this(records: RecordMap) = this()
  }
  /* static members */
  @js.native
  object RelayRecordSource extends js.Object {
    
    def create(): MutableRecordSource = js.native
    def create(records: RecordMap): MutableRecordSource = js.native
  }
}
