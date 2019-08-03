package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.slate.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "NodeFactory")
@js.native
object NodeFactoryNs extends js.Object {
  def create(attrs: Node): Node = js.native
  def create(attrs: NodeJSON): Node = js.native
  def create(attrs: NodeProperties): Node = js.native
  def createList(): List[Node] = js.native
  def createList(elements: js.Array[Node | NodeJSON | NodeProperties]): List[Node] = js.native
  def createList(elements: List[Node | NodeJSON | NodeProperties]): List[Node] = js.native
  def createProperties(): NodeProperties = js.native
  def createProperties(attrs: String): NodeProperties = js.native
  def createProperties(attrs: Anon_Data): NodeProperties = js.native
  def createProperties(attrs: Block): NodeProperties = js.native
  def createProperties(attrs: Inline): NodeProperties = js.native
  def fromJS(value: StringDictionary[js.Any]): NodeJSON = js.native
  def fromJSON(value: StringDictionary[js.Any]): NodeJSON = js.native
  def isNode(maybeNode: js.Any): /* is slate.slate.Node */ Boolean = js.native
  def isNodeList(maybeNodeList: js.Any): /* is immutable.immutable.List<slate.slate.Node> */ Boolean = js.native
}

