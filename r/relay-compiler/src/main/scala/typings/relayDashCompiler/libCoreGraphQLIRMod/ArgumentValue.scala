package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ListValue
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Literal
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ObjectValue
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Variable
*/
trait ArgumentValue extends js.Object

object ArgumentValue {
  @scala.inline
  def ListValue(
    items: js.Array[ArgumentValue],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ListValue,
    loc: Location,
    metadata: Metadata = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Literal(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Literal,
    loc: Location,
    value: js.Any,
    metadata: Metadata = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def ObjectValue(
    fields: js.Array[ObjectFieldValue],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ObjectValue,
    loc: Location,
    metadata: Metadata = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Variable(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
}

