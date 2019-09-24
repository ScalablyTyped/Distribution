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
    metadata: Metadata,
    selections: js.Array[Selection]
  ): ClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], selections = selections)
  
    __obj.asInstanceOf[ClientExtension]
  }
}

