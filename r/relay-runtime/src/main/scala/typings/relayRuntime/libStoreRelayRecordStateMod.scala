package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayRecordStateMod {
  
  @JSImport("relay-runtime/lib/store/RelayRecordState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RelayRecordState & String] = js.native
    
    /* "EXISTENT" */ val EXISTENT: typings.relayRuntime.libStoreRelayRecordStateMod.RelayRecordState.EXISTENT & String = js.native
    
    /* "NONEXISTENT" */ val NONEXISTENT: typings.relayRuntime.libStoreRelayRecordStateMod.RelayRecordState.NONEXISTENT & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typings.relayRuntime.libStoreRelayRecordStateMod.RelayRecordState.UNKNOWN & String = js.native
  }
  
  @js.native
  sealed trait RelayRecordState extends StObject
  @JSImport("relay-runtime/lib/store/RelayRecordState", "RelayRecordState")
  @js.native
  object RelayRecordState extends StObject {
    
    /**
      * Record exists (either fetched from the server or produced by a local,
      * optimistic update).
      */
    @js.native
    sealed trait EXISTENT
      extends StObject
         with RelayRecordState
    
    /**
      * Record is known not to exist (either as the result of a mutation, or
      * because the server returned `null` when queried for the record).
      */
    @js.native
    sealed trait NONEXISTENT
      extends StObject
         with RelayRecordState
    
    /**
      * Record State is unknown because it has not yet been fetched from the
      * server.
      */
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with RelayRecordState
  }
  
  type RecordState = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RelayRecordState * / any */ String
}
