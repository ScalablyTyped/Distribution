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

@js.native
trait Root
  extends CompilerContextDocument
     with Definition
     with IR
     with Node
     with VisitNode {
  var argumentDefinitions: js.Array[LocalArgumentDefinition] = js.native
  var directives: js.Array[Directive] = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.Root = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
  var name: String = js.native
  var operation: query | mutation | subscription = js.native
  var selections: Selection = js.native
  var `type`: CompositeTypeID = js.native
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
    `type`: CompositeTypeID
  ): Root = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  @scala.inline
  implicit class RootOps[Self <: Root] (val x: Self) extends AnyVal {
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
    def setArgumentDefinitionsVarargs(value: LocalArgumentDefinition*): Self = this.set("argumentDefinitions", js.Array(value :_*))
    @scala.inline
    def setArgumentDefinitions(value: js.Array[LocalArgumentDefinition]): Self = this.set("argumentDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.Root): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: query | mutation | subscription): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelections(value: Selection): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CompositeTypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

