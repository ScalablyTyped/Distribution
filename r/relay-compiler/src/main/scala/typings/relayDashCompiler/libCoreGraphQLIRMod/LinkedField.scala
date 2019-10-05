package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedField
  extends Field
     with IR
     with Node
     with Selection
     with VisitNode {
  var alias: String
  var args: js.Array[Argument]
  var directives: js.Array[Directive]
  var handles: js.UndefOr[js.Array[Handle]] = js.undefined
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.LinkedField
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
  var `type`: GraphQLOutputType
}

object LinkedField {
  @scala.inline
  def apply(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLOutputType,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): LinkedField = {
    val __obj = js.Dynamic.literal(alias = alias, args = args, directives = directives, kind = kind, loc = loc, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedField]
  }
}

