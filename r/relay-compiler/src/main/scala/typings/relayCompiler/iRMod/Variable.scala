package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.Variable
  var loc: Location
  var `type`: js.UndefOr[TypeID] = js.undefined
  var variableName: String
}

object Variable {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

