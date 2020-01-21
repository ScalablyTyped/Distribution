package typings.slateHtmlSerializer.mod

import typings.slate.mod.BlockProperties
import typings.slate.mod.Leaf
import typings.slate.mod.Mark
import typings.slate.mod.Node
import typings.slate.mod.Value
import typings.slate.mod.ValueJSON
import typings.slateHtmlSerializer.AnonFalse
import typings.slateHtmlSerializer.AnonFalseRender
import typings.slateHtmlSerializer.AnonRender
import typings.slateHtmlSerializer.AnonToJSON
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var defaultBlock: BlockProperties = js.native
  var rules: js.Array[Rule] = js.native
  def deserialize(html: String): Value = js.native
  def deserialize(html: String, options: AnonFalse): Value = js.native
  def deserialize(html: String, options: AnonToJSON): ValueJSON = js.native
  /* protected */ def deserializeElement(element: HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
  /* protected */ def deserializeMark(mark: Mark): js.Array[Node] = js.native
  /* protected */ def parseHtml(html: String): HTMLElement = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: AnonFalseRender): js.Array[Element] = js.native
  def serialize(value: Value, options: AnonRender): String = js.native
  /* protected */ def serializeLeaf(leaf: Leaf): String = js.native
  /* protected */ def serializeNode(node: Node): String = js.native
  /* protected */ def serializeString(string: String): String = js.native
}

