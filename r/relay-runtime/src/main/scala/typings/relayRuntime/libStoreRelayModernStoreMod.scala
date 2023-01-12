package typings.relayRuntime

import typings.relayRuntime.anon.GcReleaseBufferSize
import typings.relayRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.libStoreRelayStoreTypesMod.Store
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayModernStoreMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RelayModernStore {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
  }
  
  trait InvalidationState extends StObject {
    
    var dataIDs: js.Array[DataID]
    
    var invalidations: Map[DataID, js.UndefOr[Double | Null]]
  }
  object InvalidationState {
    
    inline def apply(dataIDs: js.Array[DataID], invalidations: Map[DataID, js.UndefOr[Double | Null]]): InvalidationState = {
      val __obj = js.Dynamic.literal(dataIDs = dataIDs.asInstanceOf[js.Any], invalidations = invalidations.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidationState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidationState] (val x: Self) extends AnyVal {
      
      inline def setDataIDs(value: js.Array[DataID]): Self = StObject.set(x, "dataIDs", value.asInstanceOf[js.Any])
      
      inline def setDataIDsVarargs(value: DataID*): Self = StObject.set(x, "dataIDs", js.Array(value*))
      
      inline def setInvalidations(value: Map[DataID, js.UndefOr[Double | Null]]): Self = StObject.set(x, "invalidations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayModernStore
    extends StObject
       with Store {
    
    def scheduleGC(): Unit = js.native
    
    def toJSON(): Any = js.native
  }
}
