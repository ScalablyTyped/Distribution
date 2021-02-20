package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.Hyper")
@js.native
class Hyper protected ()
  extends typings.stellarBase.xdrMod.default.Hyper {
  def this(low: Double, high: Double) = this()
}
object Hyper {
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.MIN_VALUE")
  @js.native
  val MIN_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.fromBytes")
  @js.native
  def fromBytes(low: Double, high: Double): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.fromString")
  @js.native
  def fromString(input: String): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSImport("stellar-base", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSImport("stellar-base", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Hyper): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Hyper): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Hyper.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Hyper, io: Buffer): Unit = js.native
}
