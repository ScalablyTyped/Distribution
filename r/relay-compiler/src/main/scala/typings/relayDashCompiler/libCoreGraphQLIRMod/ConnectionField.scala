package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionField
  extends Field
     with IR
     with Node
     with Selection
     with VisitNode {
  var alias: String
  var args: js.Array[Argument]
  var directives: js.Array[Directive]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ConnectionField
  var label: String
  var loc: Location
  var metadata: Metadata
  var name: String
  var resolver: String
  var selections: js.Array[Selection]
  var `type`: GraphQLOutputType
}

object ConnectionField {
  @scala.inline
  def apply(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ConnectionField,
    label: String,
    loc: Location,
    name: String,
    resolver: String,
    selections: js.Array[Selection],
    `type`: GraphQLOutputType,
    metadata: Metadata = null
  ): ConnectionField = {
    val __obj = js.Dynamic.literal(alias = alias, args = args, directives = directives, kind = kind, label = label, loc = loc, name = name, resolver = resolver, selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionField]
  }
}

