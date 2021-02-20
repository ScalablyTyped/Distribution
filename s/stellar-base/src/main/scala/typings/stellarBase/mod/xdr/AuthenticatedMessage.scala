package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.AuthenticatedMessage")
@js.native
class AuthenticatedMessage ()
  extends typings.stellarBase.xdrMod.default.AuthenticatedMessage
object AuthenticatedMessage {
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AuthenticatedMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AuthenticatedMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AuthenticatedMessage, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.AuthenticatedMessage.0")
  @js.native
  def `0`(value: typings.stellarBase.xdrMod.xdr.AuthenticatedMessageV0): typings.stellarBase.xdrMod.xdr.AuthenticatedMessage = js.native
}
