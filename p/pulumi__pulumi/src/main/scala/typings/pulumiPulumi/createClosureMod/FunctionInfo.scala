package typings.pulumiPulumi.createClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionInfo extends ObjectInfo {
  var capturedValues: PropertyMap
  var code: String
  var name: js.UndefOr[String] = js.undefined
  var paramCount: Double
  var usesNonLexicalThis: Boolean
}

object FunctionInfo {
  @scala.inline
  def apply(
    capturedValues: PropertyMap,
    code: String,
    env: PropertyMap,
    paramCount: Double,
    usesNonLexicalThis: Boolean,
    name: String = null,
    proto: Entry = null
  ): FunctionInfo = {
    val __obj = js.Dynamic.literal(capturedValues = capturedValues.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], paramCount = paramCount.asInstanceOf[js.Any], usesNonLexicalThis = usesNonLexicalThis.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionInfo]
  }
}

