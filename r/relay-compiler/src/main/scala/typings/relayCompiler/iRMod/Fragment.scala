package typings.relayCompiler.iRMod

import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.CompositeTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node
     with VisitNode {
  var argumentDefinitions: js.Array[ArgumentDefinition]
  var directives: js.Array[Directive]
  var kind: typings.relayCompiler.relayCompilerStrings.Fragment
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
  var `type`: CompositeTypeID
}

object Fragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): Fragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
}

