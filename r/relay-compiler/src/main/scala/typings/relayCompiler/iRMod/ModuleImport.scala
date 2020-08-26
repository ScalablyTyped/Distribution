package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleImport
  extends IR
     with Node
     with Selection
     with VisitNode {
  var documentName: String = js.native
  var id: String = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.ModuleImport = js.native
  var loc: Location = js.native
  var module: String = js.native
  var name: String = js.native
  var selections: js.Array[Selection] = js.native
}

object ModuleImport {
  @scala.inline
  def apply(
    documentName: String,
    id: String,
    kind: typings.relayCompiler.relayCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): ModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImport]
  }
  @scala.inline
  implicit class ModuleImportOps[Self <: ModuleImport] (val x: Self) extends AnyVal {
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
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.ModuleImport): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
  }
  
}

