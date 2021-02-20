package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.InboundPeers
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TopologyResponseBody")
@js.native
class TopologyResponseBody protected ()
  extends typings.stellarBase.mod.xdr.TopologyResponseBody {
  def this(attributes: InboundPeers) = this()
}
object TopologyResponseBody {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TopologyResponseBody = js.native
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TopologyResponseBody = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TopologyResponseBody = js.native
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TopologyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TopologyResponseBody): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TopologyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TopologyResponseBody): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TopologyResponseBody.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TopologyResponseBody, io: Buffer): Unit = js.native
}
