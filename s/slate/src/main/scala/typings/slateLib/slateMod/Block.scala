package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Block")
@js.native
class Block ()
  extends BaseNode[org.scalablytyped.runtime.StringDictionary[js.Any]]
     with _Node {
  @JSName("nodes")
  var nodes_Block: immutableLib.immutableMod.List[Block | Text | Inline] = js.native
  @JSName("object")
  var object_Block: slateLib.slateLibStrings.block = js.native
  def toJSON(): BlockJSON = js.native
}

/* static members */
@JSImport("slate", "Block")
@js.native
object Block extends js.Object {
  def create(properties: java.lang.String): slateLib.slateMod.Block = js.native
  def create(properties: slateLib.slateMod.Block): slateLib.slateMod.Block = js.native
  def create(properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Block = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Block] = js.native
  def createList(array: js.Array[slateLib.slateMod.Block | slateLib.slateMod.BlockProperties | java.lang.String]): immutableLib.immutableMod.List[slateLib.slateMod.Block] = js.native
  def fromJS(properties: slateLib.slateMod.Block): slateLib.slateMod.Block = js.native
  def fromJS(properties: slateLib.slateMod.BlockJSON): slateLib.slateMod.Block = js.native
  def fromJSON(properties: slateLib.slateMod.Block): slateLib.slateMod.Block = js.native
  def fromJSON(properties: slateLib.slateMod.BlockJSON): slateLib.slateMod.Block = js.native
  def isBlock(maybeBlock: js.Any): /* is slate.slate.Block */ scala.Boolean = js.native
  def isBlockList(maybeBlockList: js.Any): /* is immutable.immutable.List<slate.slate.Block> */ scala.Boolean = js.native
}

