package typings.relayCompiler.iRMod

import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.relayCompilerStrings.mutation
import typings.relayCompiler.relayCompilerStrings.query
import typings.relayCompiler.relayCompilerStrings.subscription
import typings.relayCompiler.schemaMod.CompositeTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root
  extends CompilerContextDocument
     with Definition
     with IR
     with Node
     with VisitNode {
  var argumentDefinitions: js.Array[LocalArgumentDefinition]
  var directives: js.Array[Directive]
  var kind: typings.relayCompiler.relayCompilerStrings.Root
  var loc: Location
  var metadata: Metadata
  var name: String
  var operation: query | mutation | subscription
  var selections: Selection
  var `type`: CompositeTypeID
}

object Root {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): Root = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

