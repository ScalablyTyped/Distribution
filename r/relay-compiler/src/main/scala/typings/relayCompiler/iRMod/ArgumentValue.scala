package typings.relayCompiler.iRMod

import typings.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayCompiler.iRMod.ListValue
  - typings.relayCompiler.iRMod.Literal
  - typings.relayCompiler.iRMod.ObjectValue
  - typings.relayCompiler.iRMod.Variable
*/
trait ArgumentValue extends js.Object

object ArgumentValue {
  @scala.inline
  def ListValue(
    items: js.Array[ArgumentValue],
    kind: typings.relayCompiler.relayCompilerStrings.ListValue,
    loc: Location,
    metadata: Metadata = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Literal(kind: typings.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def ObjectValue(
    fields: js.Array[ObjectFieldValue],
    kind: typings.relayCompiler.relayCompilerStrings.ObjectValue,
    loc: Location
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Variable(
    kind: typings.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
}

