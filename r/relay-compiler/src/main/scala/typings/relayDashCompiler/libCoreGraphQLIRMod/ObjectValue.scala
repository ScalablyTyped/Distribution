package typings.relayDashCompiler.libCoreGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValue
  extends ArgumentValue
     with IR {
  var fields: js.Array[ObjectFieldValue]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ObjectValue
  var loc: Location
  var metadata: Metadata
}

object ObjectValue {
  @scala.inline
  def apply(
    fields: js.Array[ObjectFieldValue],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ObjectValue,
    loc: Location,
    metadata: Metadata = null
  ): ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, loc = loc)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
}

