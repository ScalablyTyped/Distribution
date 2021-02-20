package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typings.stellarBase.mod.xdr.PeerAddressIp
object PeerAddressIp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.iPv4")
  @js.native
  def iPv4(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.iPv6")
  @js.native
  def iPv6(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PeerAddressIp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp, io: Buffer): Unit = js.native
}
