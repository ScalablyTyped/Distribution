package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typings.stellarBase.mod.xdr.PeerAddressIp

/* static members */
@JSImport("stellar-sdk", "xdr.PeerAddressIp")
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

