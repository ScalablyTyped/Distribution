package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationId")
@js.native
class OperationId ()
  extends typings.stellarBase.mod.xdr.OperationId
/* static members */
@JSImport("stellar-sdk", "xdr.OperationId")
@js.native
object OperationId extends js.Object {
  
  def envelopeTypeOpId(value: typings.stellarBase.xdrMod.xdr.OperationIdId): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationId): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationId = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationId): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.OperationId, io: Buffer): Unit = js.native
}
