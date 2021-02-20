package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.HmacSha256Key")
@js.native
class HmacSha256Key protected ()
  extends typings.stellarBase.xdrMod.default.HmacSha256Key {
  def this(attributes: Key) = this()
}
object HmacSha256Key {
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSImport("stellar-base", "xdr.HmacSha256Key.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSImport("stellar-base", "xdr.HmacSha256Key.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.HmacSha256Key.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.HmacSha256Key.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.HmacSha256Key.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key, io: Buffer): Unit = js.native
}
