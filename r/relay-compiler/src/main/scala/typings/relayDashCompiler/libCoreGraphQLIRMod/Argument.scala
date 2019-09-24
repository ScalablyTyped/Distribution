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
    metadata: Metadata,
    name: String,
    value: ArgumentValue,
    `type`: GraphQLInputType = null
  ): Argument = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
}

