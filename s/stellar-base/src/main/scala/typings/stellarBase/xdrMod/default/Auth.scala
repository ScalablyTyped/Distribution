package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Unused
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Auth")
@js.native
class Auth protected ()
  extends typings.stellarBase.xdrMod.xdr.Auth {
  def this(attributes: Unused) = this()
}
object Auth {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Auth = js.native
  @JSImport("stellar-base/types/xdr", "default.Auth.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Auth = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Auth = js.native
  @JSImport("stellar-base/types/xdr", "default.Auth.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Auth = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Auth): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Auth = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Auth): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Auth.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Auth.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Auth.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Auth, io: Buffer): Unit = js.native
}
