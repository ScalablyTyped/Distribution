package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLocalArgument extends ReaderArgumentDefinition {
  val defaultValue: js.Any
  val kind: String
   // 'LocalArgument';
  val name: String
  val `type`: String
}

object ReaderLocalArgument {
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String, `type`: String): ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLocalArgument]
  }
}

