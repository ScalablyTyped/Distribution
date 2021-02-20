package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Memo")
@js.native
class Memo ()
  extends typings.stellarBase.mod.xdr.Memo
object Memo {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-sdk", "xdr.Memo.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-sdk", "xdr.Memo.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Memo): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.memoHash")
  @js.native
  def memoHash(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.memoId")
  @js.native
  def memoId(value: typings.stellarBase.xdrMod.xdr.Uint64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.memoNone")
  @js.native
  def memoNone(): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.memoReturn")
  @js.native
  def memoReturn(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.memoText")
  @js.native
  def memoText(value: String): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSImport("stellar-sdk", "xdr.Memo.memoText")
  @js.native
  def memoText(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Memo): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Memo.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Memo.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Memo.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Memo, io: Buffer): Unit = js.native
}
