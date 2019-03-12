package typings
package slateDashHtmlDashSerializerLib.slateDashHtmlDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var defaultBlock: slateLib.slateMod.BlockProperties = js.native
  var rules: js.Array[Rule] = js.native
  def deserialize(html: java.lang.String): slateLib.slateMod.Value = js.native
  def deserialize(html: java.lang.String, options: slateDashHtmlDashSerializerLib.Anon_False): slateLib.slateMod.Value = js.native
  def deserialize(html: java.lang.String, options: slateDashHtmlDashSerializerLib.Anon_ToJSON): slateLib.slateMod.ValueJSON = js.native
  /* protected */ def deserializeElement(element: stdLib.HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[stdLib.HTMLElement]): js.Array[slateLib.slateMod.Node] = js.native
  /* protected */ def deserializeMark(mark: slateLib.slateMod.Mark): js.Array[slateLib.slateMod.Node] = js.native
  /* protected */ def parseHtml(html: java.lang.String): stdLib.HTMLElement = js.native
  def serialize(value: slateLib.slateMod.Value): java.lang.String = js.native
  def serialize(value: slateLib.slateMod.Value, options: slateDashHtmlDashSerializerLib.Anon_FalseRender): js.Array[stdLib.Element] = js.native
  def serialize(value: slateLib.slateMod.Value, options: slateDashHtmlDashSerializerLib.Anon_Render): java.lang.String = js.native
  /* protected */ def serializeLeaf(leaf: slateLib.slateMod.Leaf): java.lang.String = js.native
  /* protected */ def serializeNode(node: slateLib.slateMod.Node): java.lang.String = js.native
  /* protected */ def serializeString(string: java.lang.String): java.lang.String = js.native
}

