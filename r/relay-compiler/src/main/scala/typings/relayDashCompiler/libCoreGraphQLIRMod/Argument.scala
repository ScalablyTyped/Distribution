package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument
  extends IR
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Argument
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: js.UndefOr[GraphQLInputType] = js.undefined
  var value: ArgumentValue
}

object Argument {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): Argument = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, name = name, value = value)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
}

