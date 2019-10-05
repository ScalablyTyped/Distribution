package typings.relayDashCompiler.libCoreGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldValue extends IR {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.ObjectFieldValue
  var loc: Location
  var metadata: Metadata
  var name: String
  var value: ArgumentValue
}

object ObjectFieldValue {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.ObjectFieldValue,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null
  ): ObjectFieldValue = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, name = name, value = value)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldValue]
  }
}

