package typings.relayDashCompiler.libCoreGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImport
  extends IR
     with Node
     with Selection {
  var documentName: String
  var id: String
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ModuleImport
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
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): ModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName, id = id, kind = kind, loc = loc, module = module, name = name, selections = selections)
  
    __obj.asInstanceOf[ModuleImport]
  }
}

