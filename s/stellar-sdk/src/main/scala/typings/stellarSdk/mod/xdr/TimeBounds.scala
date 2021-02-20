package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.MaxTime
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TimeBounds")
@js.native
class TimeBounds protected ()
  extends typings.stellarBase.mod.xdr.TimeBounds {
  def this(attributes: MaxTime) = this()
}
object TimeBounds {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  @JSImport("stellar-sdk", "xdr.TimeBounds.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  @JSImport("stellar-sdk", "xdr.TimeBounds.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TimeBounds): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TimeBounds): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TimeBounds.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TimeBounds.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TimeBounds.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TimeBounds, io: Buffer): Unit = js.native
}
