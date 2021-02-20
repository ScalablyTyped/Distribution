package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Code
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Error")
@js.native
class Error protected ()
  extends typings.stellarBase.xdrMod.xdr.Error {
  def this(attributes: Code) = this()
}
object Error {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Error = js.native
  @JSImport("stellar-base/types/xdr", "default.Error.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Error = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Error = js.native
  @JSImport("stellar-base/types/xdr", "default.Error.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Error = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Error): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Error = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Error): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Error.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Error.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Error.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Error, io: Buffer): Unit = js.native
}
