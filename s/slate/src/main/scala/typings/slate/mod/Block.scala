package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Block")
@js.native
class Block ()
  extends BaseNode
     with Node {
  @JSName("nodes")
  var nodes_Block: List[Block | Text | Inline] = js.native
  @JSName("object")
  var object_Block: block = js.native
  def toJS(): BlockJSON = js.native
  def toJSON(): BlockJSON = js.native
}

/* static members */
@JSImport("slate", "Block")
@js.native
object Block extends js.Object {
  def create(properties: String): Block = js.native
  def create(properties: Block): Block = js.native
  def create(properties: BlockJSON): Block = js.native
  def create(properties: BlockProperties): Block = js.native
  def createList(): List[Block] = js.native
  def createList(array: js.Array[BlockProperties | BlockJSON | Block | String]): List[Block] = js.native
  def createList(array: List[BlockProperties | BlockJSON | Block | String]): List[Block] = js.native
  def fromJS(properties: Block): Block = js.native
  def fromJS(properties: BlockJSON): Block = js.native
  def fromJS(properties: BlockProperties): Block = js.native
  def fromJSON(properties: Block): Block = js.native
  def fromJSON(properties: BlockJSON): Block = js.native
  def fromJSON(properties: BlockProperties): Block = js.native
  def isBlock(maybeBlock: js.Any): /* is slate.slate.Block */ Boolean = js.native
  def isBlockList(maybeBlockList: js.Any): /* is immutable.Immutable.List<slate.slate.Block> */ Boolean = js.native
}

