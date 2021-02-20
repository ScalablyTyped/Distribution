package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.BytesRead
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PeerStats")
@js.native
class PeerStats protected ()
  extends typings.stellarBase.xdrMod.xdr.PeerStats {
  def this(attributes: BytesRead) = this()
}
object PeerStats {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PeerStats = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PeerStats = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PeerStats): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PeerStats = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PeerStats): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PeerStats, io: Buffer): Unit = js.native
}
