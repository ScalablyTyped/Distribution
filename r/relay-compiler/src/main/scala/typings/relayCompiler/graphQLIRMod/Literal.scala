package typings.relayCompiler.graphQLIRMod

import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.Literal
  var loc: Location
  var metadata: Metadata
  var value: js.Any
}

object Literal {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Literal,
    loc: Location,
    value: js.Any,
    metadata: Metadata = null
  ): Literal = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

