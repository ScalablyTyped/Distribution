package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayRecordSourceMod {
  
  @JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource")
  @js.native
  class RelayRecordSource () extends MutableRecordSource {
    def this(records: RecordMap) = this()
  }
  /* static members */
  object RelayRecordSource {
    
    @JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource.create")
    @js.native
    def create(): MutableRecordSource = js.native
    @JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource.create")
    @js.native
    def create(records: RecordMap): MutableRecordSource = js.native
  }
}
