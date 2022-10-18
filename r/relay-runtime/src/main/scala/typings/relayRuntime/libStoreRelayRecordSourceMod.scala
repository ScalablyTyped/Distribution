package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libStoreRelayRecordStateMod.RecordState
import typings.relayRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.libStoreRelayStoreTypesMod.Record
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordMap
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayRecordSourceMod {
  
  @JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource")
  @js.native
  open class RelayRecordSource ()
    extends StObject
       with MutableRecordSource {
    def this(records: RecordMap) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(dataID: DataID): Unit = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    /* CompleteClass */
    override def get[T /* <: js.Object */](dataID: DataID): js.UndefOr[Record[T] | Null] = js.native
    
    /* CompleteClass */
    override def getRecordIDs(): js.Array[DataID] = js.native
    
    /* CompleteClass */
    override def getStatus(dataID: DataID): RecordState = js.native
    
    /* CompleteClass */
    override def has(dataID: DataID): Boolean = js.native
    
    /* CompleteClass */
    override def remove(dataID: DataID): Unit = js.native
    
    /* CompleteClass */
    override def set(dataID: DataID, record: Record[js.Object]): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
    
    /* CompleteClass */
    override def toJSON(): StringDictionary[Record[js.Object]] = js.native
  }
  /* static members */
  object RelayRecordSource {
    
    @JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MutableRecordSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MutableRecordSource]
    inline def create(records: RecordMap): MutableRecordSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(records.asInstanceOf[js.Any]).asInstanceOf[MutableRecordSource]
  }
}
