package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Literal
  var loc: Location
  var metadata: Metadata
  var value: js.Any
}

object Literal {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Literal,
    loc: Location,
    value: js.Any,
    metadata: Metadata = null
  ): Literal = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, value = value)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

