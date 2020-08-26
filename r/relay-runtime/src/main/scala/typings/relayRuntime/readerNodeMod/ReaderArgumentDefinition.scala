package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderLocalArgument
  - typings.relayRuntime.readerNodeMod.ReaderRootArgument
*/
trait ReaderArgumentDefinition extends js.Object

object ReaderArgumentDefinition {
  @scala.inline
  def ReaderLocalArgument(defaultValue: js.Any, kind: String, name: String): ReaderArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgumentDefinition]
  }
  @scala.inline
  def ReaderRootArgument(kind: String, name: String): ReaderArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgumentDefinition]
  }
}

