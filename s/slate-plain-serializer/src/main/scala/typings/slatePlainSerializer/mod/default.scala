package typings.slatePlainSerializer.mod

import typings.slate.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-plain-serializer", JSImport.Default)
@js.native
object default extends js.Object {
  def deserialize(string: String): Value = js.native
  def deserialize(string: String, options: DeserializeOptions): Value = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: SerializeOptions): String = js.native
}

