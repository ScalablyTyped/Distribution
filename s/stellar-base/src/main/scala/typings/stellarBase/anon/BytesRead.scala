package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesRead extends StObject {
  
  var bytesRead: Uint64 = js.native
  
  var bytesWritten: Uint64 = js.native
  
  var duplicateFetchBytesRecv: Uint64 = js.native
  
  var duplicateFetchMessageRecv: Uint64 = js.native
  
  var duplicateFloodBytesRecv: Uint64 = js.native
  
  var duplicateFloodMessageRecv: Uint64 = js.native
  
  var id: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  
  var messagesRead: Uint64 = js.native
  
  var messagesWritten: Uint64 = js.native
  
  var secondsConnected: Uint64 = js.native
  
  var uniqueFetchBytesRecv: Uint64 = js.native
  
  var uniqueFetchMessageRecv: Uint64 = js.native
  
  var uniqueFloodBytesRecv: Uint64 = js.native
  
  var uniqueFloodMessageRecv: Uint64 = js.native
  
  var versionStr: String | Buffer = js.native
}
object BytesRead {
  
  @scala.inline
  def apply(
    bytesRead: Uint64,
    bytesWritten: Uint64,
    duplicateFetchBytesRecv: Uint64,
    duplicateFetchMessageRecv: Uint64,
    duplicateFloodBytesRecv: Uint64,
    duplicateFloodMessageRecv: Uint64,
    id: typings.stellarBase.xdrMod.xdr.NodeId,
    messagesRead: Uint64,
    messagesWritten: Uint64,
    secondsConnected: Uint64,
    uniqueFetchBytesRecv: Uint64,
    uniqueFetchMessageRecv: Uint64,
    uniqueFloodBytesRecv: Uint64,
    uniqueFloodMessageRecv: Uint64,
    versionStr: String | Buffer
  ): BytesRead = {
    val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any], duplicateFetchBytesRecv = duplicateFetchBytesRecv.asInstanceOf[js.Any], duplicateFetchMessageRecv = duplicateFetchMessageRecv.asInstanceOf[js.Any], duplicateFloodBytesRecv = duplicateFloodBytesRecv.asInstanceOf[js.Any], duplicateFloodMessageRecv = duplicateFloodMessageRecv.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messagesRead = messagesRead.asInstanceOf[js.Any], messagesWritten = messagesWritten.asInstanceOf[js.Any], secondsConnected = secondsConnected.asInstanceOf[js.Any], uniqueFetchBytesRecv = uniqueFetchBytesRecv.asInstanceOf[js.Any], uniqueFetchMessageRecv = uniqueFetchMessageRecv.asInstanceOf[js.Any], uniqueFloodBytesRecv = uniqueFloodBytesRecv.asInstanceOf[js.Any], uniqueFloodMessageRecv = uniqueFloodMessageRecv.asInstanceOf[js.Any], versionStr = versionStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
  
  @scala.inline
  implicit class BytesReadMutableBuilder[Self <: BytesRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesRead(value: Uint64): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Uint64): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFetchBytesRecv(value: Uint64): Self = StObject.set(x, "duplicateFetchBytesRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFetchMessageRecv(value: Uint64): Self = StObject.set(x, "duplicateFetchMessageRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFloodBytesRecv(value: Uint64): Self = StObject.set(x, "duplicateFloodBytesRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFloodMessageRecv(value: Uint64): Self = StObject.set(x, "duplicateFloodMessageRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesRead(value: Uint64): Self = StObject.set(x, "messagesRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesWritten(value: Uint64): Self = StObject.set(x, "messagesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsConnected(value: Uint64): Self = StObject.set(x, "secondsConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueFetchBytesRecv(value: Uint64): Self = StObject.set(x, "uniqueFetchBytesRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueFetchMessageRecv(value: Uint64): Self = StObject.set(x, "uniqueFetchMessageRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueFloodBytesRecv(value: Uint64): Self = StObject.set(x, "uniqueFloodBytesRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueFloodMessageRecv(value: Uint64): Self = StObject.set(x, "uniqueFloodMessageRecv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStr(value: String | Buffer): Self = StObject.set(x, "versionStr", value.asInstanceOf[js.Any])
  }
}
