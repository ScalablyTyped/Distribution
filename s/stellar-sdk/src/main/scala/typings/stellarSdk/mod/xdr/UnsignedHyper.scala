package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.UnsignedHyper")
@js.native
class UnsignedHyper protected ()
  extends typings.stellarBase.mod.xdr.UnsignedHyper {
  def this(low: Double, high: Double) = this()
}
object UnsignedHyper {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.MIN_VALUE")
  @js.native
  val MIN_VALUE: typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromBytes")
  @js.native
  def fromBytes(low: Double, high: Double): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromString")
  @js.native
  def fromString(input: String): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.UnsignedHyper): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.UnsignedHyper): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.UnsignedHyper.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.UnsignedHyper, io: Buffer): Unit = js.native
}
