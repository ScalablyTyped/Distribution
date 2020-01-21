package typings.slateBase64Serializer

import typings.slate.mod.Node
import typings.slate.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-base64-serializer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def deserialize(string: String): Value = js.native
  def deserialize(string: String, options: js.Object): Value = js.native
  def deserializeNode(string: String): Node = js.native
  def deserializeNode(string: String, options: js.Object): Node = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: js.Object): String = js.native
  def serializeNode(node: Node): String = js.native
  def serializeNode(node: Node, options: js.Object): String = js.native
}

