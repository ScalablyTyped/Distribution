package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Hint
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.DecoratedSignature")
@js.native
class DecoratedSignature protected ()
  extends typings.stellarBase.mod.xdr.DecoratedSignature {
  def this(attributes: Hint) = this()
}
object DecoratedSignature {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.DecoratedSignature): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.DecoratedSignature): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DecoratedSignature.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.DecoratedSignature, io: Buffer): Unit = js.native
}
