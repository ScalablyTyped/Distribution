package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderListValue extends ReaderArgument {
  val items: js.Array[ReaderArgument | Null]
  val kind: String
   // 'ListValue';
  val name: String
}

object ReaderListValue {
  @scala.inline
  def apply(items: js.Array[ReaderArgument | Null], kind: String, name: String): ReaderListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderListValue]
  }
}

