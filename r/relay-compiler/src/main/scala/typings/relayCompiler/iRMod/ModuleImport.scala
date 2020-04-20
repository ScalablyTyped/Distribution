package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImport
  extends IR
     with Node
     with Selection
     with VisitNode {
  var documentName: String
  var id: String
  var kind: typings.relayCompiler.relayCompilerStrings.ModuleImport
  var loc: Location
  var module: String
  var name: String
  var selections: js.Array[Selection]
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
}

