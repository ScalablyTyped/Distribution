package typings.relayDashCompiler.libCoreGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends ArgumentValue
     with IR {
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
    metadata: Metadata,
    value: js.Any
  ): Literal = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Literal]
  }
}

