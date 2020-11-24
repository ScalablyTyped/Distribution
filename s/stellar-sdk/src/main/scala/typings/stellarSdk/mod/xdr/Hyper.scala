package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Hyper")
@js.native
class Hyper protected ()
  extends typings.stellarBase.mod.xdr.Hyper {
  def this(low: Double, high: Double) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.Hyper")
@js.native
object Hyper extends js.Object {
  
  val MAX_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  val MIN_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  def fromBytes(low: Double, high: Double): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  def fromString(input: String): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.Hyper): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Hyper): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.Hyper, io: Buffer): Unit = js.native
}
