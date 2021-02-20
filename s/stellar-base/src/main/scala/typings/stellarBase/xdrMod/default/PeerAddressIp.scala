package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typings.stellarBase.xdrMod.xdr.PeerAddressIp
object PeerAddressIp {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.iPv4")
  @js.native
  def iPv4(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.iPv6")
  @js.native
  def iPv6(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerAddressIp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp, io: Buffer): Unit = js.native
}
