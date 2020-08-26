package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typings.stellarBase.xdrMod.default.PeerAddressIp

/* static members */
@JSImport("stellar-base", "xdr.PeerAddressIp")
@js.native
object PeerAddressIp extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  def iPv4(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  def iPv6(value: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PeerAddressIp, io: Buffer): Unit = js.native
}

