package typings.relayRuntime

import typings.relayRuntime.anon.GcReleaseBufferSize
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.Store
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernStoreMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Default)
  @js.native
  class default protected ()
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
    
    @scala.inline
    def apply(dataIDs: js.Array[DataID], invalidations: Map[DataID, js.UndefOr[Double | Null]]): InvalidationState = {
      val __obj = js.Dynamic.literal(dataIDs = dataIDs.asInstanceOf[js.Any], invalidations = invalidations.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidationState]
    }
    
    @scala.inline
    implicit class InvalidationStateMutableBuilder[Self <: InvalidationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataIDs(value: js.Array[DataID]): Self = StObject.set(x, "dataIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIDsVarargs(value: DataID*): Self = StObject.set(x, "dataIDs", js.Array(value :_*))
      
      @scala.inline
      def setInvalidations(value: Map[DataID, js.UndefOr[Double | Null]]): Self = StObject.set(x, "invalidations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayModernStore
    extends StObject
       with Store {
    
    def scheduleGC(): Unit = js.native
    
    def toJSON(): js.Any = js.native
  }
}
