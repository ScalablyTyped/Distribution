package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarField
  extends Field
     with IR
     with Selection
     with VisitNode {
  var alias: String
  var args: js.Array[Argument]
  var directives: js.Array[Directive]
  var handles: js.UndefOr[js.Array[Handle]] = js.undefined
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ScalarField
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: ScalarFieldType
}

object ScalarField {
  @scala.inline
  def apply(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ScalarField,
    loc: Location,
    metadata: Metadata,
    name: String,
    `type`: ScalarFieldType,
    handles: js.Array[Handle] = null
  ): ScalarField = {
    val __obj = js.Dynamic.literal(alias = alias, args = args, directives = directives, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles)
    __obj.asInstanceOf[ScalarField]
  }
}

