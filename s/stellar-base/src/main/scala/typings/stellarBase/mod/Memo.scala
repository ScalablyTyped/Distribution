package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.mod.MemoType.Hash
import typings.stellarBase.mod.MemoType.ID
import typings.stellarBase.mod.MemoType.None
import typings.stellarBase.mod.MemoType.Return
import typings.stellarBase.mod.MemoType.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected () extends StObject {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash | ID | Return | Text, value: String) = this()
  def this(`type`: Hash | Return, value: Buffer) = this()
  
  def toXDRObject(): typings.stellarBase.xdrMod.default.Memo = js.native
  
  var `type`: T = js.native
  
  var value: MemoValue | Buffer | String | Null = js.native
}
/* static members */
object Memo {
  
  @JSImport("stellar-base", "Memo.fromXDRObject")
  @js.native
  def fromXDRObject(memo: typings.stellarBase.xdrMod.default.Memo): Memo[MemoType] = js.native
  
  @JSImport("stellar-base", "Memo.hash")
  @js.native
  def hash(hash: String): Memo[Hash] = js.native
  
  @JSImport("stellar-base", "Memo.id")
  @js.native
  def id(id: String): Memo[ID] = js.native
  
  @JSImport("stellar-base", "Memo.none")
  @js.native
  def none(): Memo[None] = js.native
  
  @JSImport("stellar-base", "Memo.text")
  @js.native
  def text(text: String): Memo[Text] = js.native
  
  @JSImport("stellar-base", "Memo.return")
  @js.native
  def `return`(hash: String): Memo[Return] = js.native
}
