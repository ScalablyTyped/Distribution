package typings.stellarSdk.mod

import typings.node.Buffer
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.MemoType.Hash
import typings.stellarBase.mod.MemoType.ID
import typings.stellarBase.mod.MemoType.None
import typings.stellarBase.mod.MemoType.Return
import typings.stellarBase.mod.MemoType.Text
import typings.stellarBase.mod.MemoValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typings.stellarBase.mod.Memo[T] {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash | ID | Return | Text, value: String) = this()
  def this(`type`: Hash | Return, value: Buffer) = this()
}
/* static members */
object Memo {
  
  @JSImport("stellar-sdk", "Memo.fromXDRObject")
  @js.native
  def fromXDRObject(memo: typings.stellarBase.xdrMod.default.Memo): typings.stellarBase.mod.Memo[MemoType] = js.native
  
  @JSImport("stellar-sdk", "Memo.hash")
  @js.native
  def hash(hash: String): typings.stellarBase.mod.Memo[Hash] = js.native
  
  @JSImport("stellar-sdk", "Memo.id")
  @js.native
  def id(id: String): typings.stellarBase.mod.Memo[ID] = js.native
  
  @JSImport("stellar-sdk", "Memo.none")
  @js.native
  def none(): typings.stellarBase.mod.Memo[None] = js.native
  
  @JSImport("stellar-sdk", "Memo.text")
  @js.native
  def text(text: String): typings.stellarBase.mod.Memo[Text] = js.native
  
  @JSImport("stellar-sdk", "Memo.return")
  @js.native
  def `return`(hash: String): typings.stellarBase.mod.Memo[Return] = js.native
}
