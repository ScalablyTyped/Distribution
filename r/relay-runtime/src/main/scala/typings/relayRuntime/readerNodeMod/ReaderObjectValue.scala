package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderObjectValue extends ReaderArgument {
  val fields: js.Array[ReaderArgument]
  val kind: String
   // 'ObjectValue';
  val name: String
}

object ReaderObjectValue {
  @scala.inline
  def apply(fields: js.Array[ReaderArgument], kind: String, name: String): ReaderObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderObjectValue]
  }
}

