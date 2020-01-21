package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.Record
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayRecordSource", JSImport.Namespace)
@js.native
object relayRecordSourceMod extends js.Object {
  @js.native
  class RelayRecordSource () extends MutableRecordSource {
    def this(records: RecordMap) = this()
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def delete(dataID: DataID): Unit = js.native
    /* CompleteClass */
    override def get(dataID: DataID): js.UndefOr[Record | Null] = js.native
    /* CompleteClass */
    override def getRecordIDs(): js.Array[DataID] = js.native
    /* CompleteClass */
    override def getStatus(dataID: DataID): RecordState = js.native
    /* CompleteClass */
    override def has(dataID: DataID): Boolean = js.native
    /* CompleteClass */
    override def remove(dataID: DataID): Unit = js.native
    /* CompleteClass */
    override def set(dataID: DataID, record: Record): Unit = js.native
    /* CompleteClass */
    override def size(): Double = js.native
    /* CompleteClass */
    override def toJSON(): StringDictionary[Record] = js.native
  }
  
  /* static members */
  @js.native
  object RelayRecordSource extends js.Object {
    def create(): MutableRecordSource = js.native
    def create(records: RecordMap): MutableRecordSource = js.native
  }
  
}

