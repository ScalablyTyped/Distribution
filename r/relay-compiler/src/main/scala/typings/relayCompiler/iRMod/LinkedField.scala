package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.LinkedFieldTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedField
  extends Field
     with IR
     with Node
     with Selection
     with VisitNode {
  var alias: String
  var args: js.Array[Argument]
  var connection: Boolean
  var directives: js.Array[Directive]
  var handles: js.UndefOr[js.Array[Handle]] = js.undefined
  var kind: typings.relayCompiler.relayCompilerStrings.LinkedField
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
  var `type`: LinkedFieldTypeID
}

object LinkedField {
  @scala.inline
  def apply(
    alias: String,
    args: js.Array[Argument],
    connection: Boolean,
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: LinkedFieldTypeID,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): LinkedField = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedField]
  }
}

