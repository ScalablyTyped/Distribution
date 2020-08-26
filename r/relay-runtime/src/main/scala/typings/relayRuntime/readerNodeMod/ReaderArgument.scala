package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderLiteral
  - typings.relayRuntime.readerNodeMod.ReaderVariable
  - typings.relayRuntime.readerNodeMod.ReaderObjectValue
  - typings.relayRuntime.readerNodeMod.ReaderListValue
*/
trait ReaderArgument extends js.Object

object ReaderArgument {
  @scala.inline
  def ReaderLiteral(kind: String, name: String, value: js.Any): ReaderArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgument]
  }
  @scala.inline
  def ReaderVariable(kind: String, name: String, variableName: String): ReaderArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgument]
  }
  @scala.inline
  def ReaderObjectValue(fields: js.Array[ReaderArgument], kind: String, name: String): ReaderArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgument]
  }
  @scala.inline
  def ReaderListValue(items: js.Array[ReaderArgument | Null], kind: String, name: String): ReaderArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderArgument]
  }
}

