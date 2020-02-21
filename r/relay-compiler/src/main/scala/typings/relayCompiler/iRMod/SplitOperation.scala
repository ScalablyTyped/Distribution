package typings.relayCompiler.iRMod

import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.TypeID
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitOperation
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.SplitOperation
  var loc: Location
  var metadata: Metadata
  var name: String
  var parentSources: Set[String]
  var selections: js.Array[Selection]
  var `type`: TypeID
}

object SplitOperation {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID,
    metadata: Metadata = null
  ): SplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitOperation]
  }
}

