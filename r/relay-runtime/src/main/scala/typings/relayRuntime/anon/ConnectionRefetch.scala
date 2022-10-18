package typings.relayRuntime.anon

import typings.relayRuntime.libHandlersConnectionConnectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.libUtilReaderNodeMod.ReaderRefetchMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionRefetch extends StObject {
  
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  
  val refetch: ReaderRefetchMetadata
}
object ConnectionRefetch {
  
  inline def apply(refetch: ReaderRefetchMetadata): ConnectionRefetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRefetch]
  }
  
  extension [Self <: ConnectionRefetch](x: Self) {
    
    inline def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value*))
    
    inline def setRefetch(value: ReaderRefetchMetadata): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
  }
}
