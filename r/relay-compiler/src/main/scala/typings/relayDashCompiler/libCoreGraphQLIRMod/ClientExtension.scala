package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientExtension
  extends IR
     with Node
     with Selection
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ClientExtension
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
}

object ClientExtension {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): ClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientExtension]
  }
}

