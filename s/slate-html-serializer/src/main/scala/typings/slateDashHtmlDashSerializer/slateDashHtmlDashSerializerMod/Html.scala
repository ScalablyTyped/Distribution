package typings.slateDashHtmlDashSerializer.slateDashHtmlDashSerializerMod

import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Leaf
import typings.slate.slateMod.Mark
import typings.slate.slateMod.Node
import typings.slate.slateMod.Value
import typings.slate.slateMod.ValueJSON
import typings.slateDashHtmlDashSerializer.Anon_False
import typings.slateDashHtmlDashSerializer.Anon_FalseRender
import typings.slateDashHtmlDashSerializer.Anon_Render
import typings.slateDashHtmlDashSerializer.Anon_ToJSON
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
  def deserialize(html: String, options: Anon_False): Value = js.native
  def deserialize(html: String, options: Anon_ToJSON): ValueJSON = js.native
  /* protected */ def deserializeElement(element: HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
  /* protected */ def deserializeMark(mark: Mark): js.Array[Node] = js.native
  /* protected */ def parseHtml(html: String): HTMLElement = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: Anon_FalseRender): js.Array[Element] = js.native
  def serialize(value: Value, options: Anon_Render): String = js.native
  /* protected */ def serializeLeaf(leaf: Leaf): String = js.native
  /* protected */ def serializeNode(node: Node): String = js.native
  /* protected */ def serializeString(string: String): String = js.native
}

