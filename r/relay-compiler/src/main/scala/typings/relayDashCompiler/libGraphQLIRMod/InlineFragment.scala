package typings.relayDashCompiler.libGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragment
  extends IR
     with Node
     with Selection {
  var directives: js.Array[Directive]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.InlineFragment
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
  var typeCondition: GraphQLCompositeType
}

object InlineFragment {
  @scala.inline
  def apply(
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.InlineFragment,
    loc: Location,
    metadata: Metadata,
    selections: js.Array[Selection],
    typeCondition: GraphQLCompositeType
  ): InlineFragment = {
    val __obj = js.Dynamic.literal(directives = directives, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], selections = selections, typeCondition = typeCondition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InlineFragment]
  }
}

