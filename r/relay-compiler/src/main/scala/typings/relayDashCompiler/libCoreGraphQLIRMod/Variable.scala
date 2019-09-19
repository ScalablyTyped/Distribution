package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends ArgumentValue
     with IR {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Variable
  var loc: Location
  var metadata: Metadata
  var `type`: js.UndefOr[GraphQLInputType] = js.undefined
  var variableName: String
}

object Variable {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Variable,
    loc: Location,
    metadata: Metadata,
    variableName: String,
    `type`: GraphQLInputType = null
  ): Variable = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], variableName = variableName)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

