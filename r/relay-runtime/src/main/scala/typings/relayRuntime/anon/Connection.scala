package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  
  val mask: js.UndefOr[Boolean] = js.undefined
  
  val plural: js.UndefOr[Boolean] = js.undefined
  
  val refetch: js.UndefOr[ReaderRefetchMetadata] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value :_*))
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setPlural(value: Boolean): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setRefetch(value: ReaderRefetchMetadata): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    
    inline def setRefetchUndefined: Self = StObject.set(x, "refetch", js.undefined)
  }
}
