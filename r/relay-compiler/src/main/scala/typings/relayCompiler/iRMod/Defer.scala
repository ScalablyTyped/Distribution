package typings.relayCompiler.iRMod

import typings.relayCompiler.anon.FragmentTypeCondition
import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defer
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null
  var kind: typings.relayCompiler.relayCompilerStrings.Defer
  var label: String
  var loc: Location
  var metadata: js.UndefOr[FragmentTypeCondition | Null] = js.undefined
  var selections: js.Array[Selection]
}

object Defer {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: js.UndefOr[Null | FragmentTypeCondition] = js.undefined
  ): Defer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defer]
  }
}

