package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.CreateAccountResult")
@js.native
class CreateAccountResult ()
  extends typings.stellarBase.xdrMod.default.CreateAccountResult
object CreateAccountResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.createAccountSuccess")
  @js.native
  def createAccountSuccess(): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSImport("stellar-base", "xdr.CreateAccountResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSImport("stellar-base", "xdr.CreateAccountResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.CreateAccountResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.CreateAccountResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateAccountResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult, io: Buffer): Unit = js.native
}
