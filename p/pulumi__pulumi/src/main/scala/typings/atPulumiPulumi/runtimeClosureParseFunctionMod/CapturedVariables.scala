package typings.atPulumiPulumi.runtimeClosureParseFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturedVariables extends js.Object {
  var optional: CapturedVariableMap
  var required: CapturedVariableMap
}

object CapturedVariables {
  @scala.inline
  def apply(optional: CapturedVariableMap, required: CapturedVariableMap): CapturedVariables = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CapturedVariables]
  }
}

