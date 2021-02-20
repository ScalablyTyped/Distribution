package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStats extends StObject {
  
  def bytesRead(): Uint64 = js.native
  def bytesRead(value: Uint64): Uint64 = js.native
  
  def bytesWritten(): Uint64 = js.native
  def bytesWritten(value: Uint64): Uint64 = js.native
  
  def duplicateFetchBytesRecv(): Uint64 = js.native
  def duplicateFetchBytesRecv(value: Uint64): Uint64 = js.native
  
  def duplicateFetchMessageRecv(): Uint64 = js.native
  def duplicateFetchMessageRecv(value: Uint64): Uint64 = js.native
  
  def duplicateFloodBytesRecv(): Uint64 = js.native
  def duplicateFloodBytesRecv(value: Uint64): Uint64 = js.native
  
  def duplicateFloodMessageRecv(): Uint64 = js.native
  def duplicateFloodMessageRecv(value: Uint64): Uint64 = js.native
  
  def id(): NodeId = js.native
  def id(value: NodeId): NodeId = js.native
  
  def messagesRead(): Uint64 = js.native
  def messagesRead(value: Uint64): Uint64 = js.native
  
  def messagesWritten(): Uint64 = js.native
  def messagesWritten(value: Uint64): Uint64 = js.native
  
  def secondsConnected(): Uint64 = js.native
  def secondsConnected(value: Uint64): Uint64 = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def uniqueFetchBytesRecv(): Uint64 = js.native
  def uniqueFetchBytesRecv(value: Uint64): Uint64 = js.native
  
  def uniqueFetchMessageRecv(): Uint64 = js.native
  def uniqueFetchMessageRecv(value: Uint64): Uint64 = js.native
  
  def uniqueFloodBytesRecv(): Uint64 = js.native
  def uniqueFloodBytesRecv(value: Uint64): Uint64 = js.native
  
  def uniqueFloodMessageRecv(): Uint64 = js.native
  def uniqueFloodMessageRecv(value: Uint64): Uint64 = js.native
  
  def versionStr(): String | Buffer = js.native
  def versionStr(value: String): String | Buffer = js.native
  def versionStr(value: Buffer): String | Buffer = js.native
}
