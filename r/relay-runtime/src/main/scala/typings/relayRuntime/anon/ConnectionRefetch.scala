package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionRefetch extends StObject {
  
  val connection: js.Array[ConnectionMetadata]
  
  val refetch: ReaderRefetchMetadataconn
}
object ConnectionRefetch {
  
  inline def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): ConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRefetch]
  }
  
  extension [Self <: ConnectionRefetch](x: Self) {
    
    inline def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value*))
    
    inline def setRefetch(value: ReaderRefetchMetadataconn): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
  }
}
