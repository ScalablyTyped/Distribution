package typings.relayCompiler.iRMod

import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.TypeID
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitOperation
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.SplitOperation = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var name: String = js.native
  var parentSources: Set[String] = js.native
  var selections: js.Array[Selection] = js.native
  var `type`: TypeID = js.native
}

object SplitOperation {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID
  ): SplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitOperation]
  }
  @scala.inline
  implicit class SplitOperationOps[Self <: SplitOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.SplitOperation): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentSources(value: Set[String]): Self = this.set("parentSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

