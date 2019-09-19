package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.CompilerContextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node {
  var argumentDefinitions: js.Array[ArgumentDefinition]
  var directives: js.Array[Directive]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Fragment
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
  var `type`: GraphQLCompositeType
}

object Fragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Fragment,
    loc: Location,
    metadata: Metadata,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLCompositeType
  ): Fragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, directives = directives, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
}

