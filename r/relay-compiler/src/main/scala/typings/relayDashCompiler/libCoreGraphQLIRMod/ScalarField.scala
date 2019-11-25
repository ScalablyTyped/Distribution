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
    name: String,
    `type`: ScalarFieldType,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): ScalarField = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarField]
  }
}

