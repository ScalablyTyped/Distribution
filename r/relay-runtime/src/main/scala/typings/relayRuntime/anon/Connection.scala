package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.native
  
  val mask: js.UndefOr[Boolean] = js.native
  
  val plural: js.UndefOr[Boolean] = js.native
  
  val refetch: js.UndefOr[ReaderRefetchMetadata] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setPlural(value: Boolean): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    @scala.inline
    def setRefetch(value: ReaderRefetchMetadata): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefetchUndefined: Self = StObject.set(x, "refetch", js.undefined)
  }
}
