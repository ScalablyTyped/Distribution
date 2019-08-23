package typings.relayDashCompiler.libGraphQLIRMod

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
    metadata: Metadata,
    name: String,
    value: ArgumentValue
  ): ObjectFieldValue = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, value = value)
  
    __obj.asInstanceOf[ObjectFieldValue]
  }
}

