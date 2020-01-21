package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.List
import typings.slate.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "NodeFactory")
@js.native
object NodeFactory extends js.Object {
  def create(attrs: Node): Node = js.native
  def create(attrs: NodeJSON): Node = js.native
  def create(attrs: NodeProperties): Node = js.native
  def createList(): List[Node] = js.native
  def createList(elements: js.Array[Node | NodeJSON | NodeProperties]): List[Node] = js.native
  def createList(elements: List[Node | NodeJSON | NodeProperties]): List[Node] = js.native
  def createProperties(): NodeProperties = js.native
  def createProperties(attrs: String): NodeProperties = js.native
  def createProperties(attrs: AnonData): NodeProperties = js.native
  def createProperties(attrs: Block): NodeProperties = js.native
  def createProperties(attrs: Inline): NodeProperties = js.native
  def fromJS(value: StringDictionary[js.Any]): NodeJSON = js.native
  def fromJSON(value: StringDictionary[js.Any]): NodeJSON = js.native
  def isNode(maybeNode: js.Any): /* is slate.slate.Node */ Boolean = js.native
  def isNodeList(maybeNodeList: js.Any): /* is immutable.Immutable.List<slate.slate.Node> */ Boolean = js.native
}

