package typings.relayRuntime.anon

import typings.relayRuntime.libHandlersConnectionConnectionHandlerMod.ConnectionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refetch extends StObject {
  
  val connection: js.Array[ConnectionMetadata]
  
  val refetch: ReaderRefetchMetadataconn
}
object Refetch {
  
  inline def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): Refetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refetch]
  }
  
  extension [Self <: Refetch](x: Self) {
    
    inline def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value*))
    
    inline def setRefetch(value: ReaderRefetchMetadataconn): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
  }
}
