package typings.relayDashCompiler.libGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValue
  extends ArgumentValue
     with IR {
  var items: js.Array[ArgumentValue]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ListValue
  var loc: Location
  var metadata: Metadata
}

object ListValue {
  @scala.inline
  def apply(
    items: js.Array[ArgumentValue],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ListValue,
    loc: Location,
    metadata: Metadata
  ): ListValue = {
    val __obj = js.Dynamic.literal(items = items, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListValue]
  }
}

