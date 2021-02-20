package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Memo")
@js.native
class Memo ()
  extends typings.stellarBase.xdrMod.xdr.Memo
object Memo {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-base/types/xdr", "default.Memo.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-base/types/xdr", "default.Memo.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Memo): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.memoHash")
  @js.native
  def memoHash(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.memoId")
  @js.native
  def memoId(value: typings.stellarBase.xdrMod.xdr.Uint64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.memoNone")
  @js.native
  def memoNone(): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.memoReturn")
  @js.native
  def memoReturn(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.memoText")
  @js.native
  def memoText(value: String): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-base/types/xdr", "default.Memo.memoText")
  @js.native
  def memoText(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Memo): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Memo.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Memo.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Memo.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Memo, io: Buffer): Unit = js.native
}
