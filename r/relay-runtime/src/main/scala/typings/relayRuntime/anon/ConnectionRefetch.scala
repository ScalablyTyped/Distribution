package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionRefetch extends js.Object {
  
  val connection: js.Array[ConnectionMetadata] = js.native
  
  val refetch: ReaderRefetchMetadataconn = js.native
}
object ConnectionRefetch {
  
  @scala.inline
  def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): ConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRefetch]
  }
  
  @scala.inline
  implicit class ConnectionRefetchOps[Self <: ConnectionRefetch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionVarargs(value: ConnectionMetadata*): Self = this.set("connection", js.Array(value :_*))
    
    @scala.inline
    def setConnection(value: js.Array[ConnectionMetadata]): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefetch(value: ReaderRefetchMetadataconn): Self = this.set("refetch", value.asInstanceOf[js.Any])
  }
}
