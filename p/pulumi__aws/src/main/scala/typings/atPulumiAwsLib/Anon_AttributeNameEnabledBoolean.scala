package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNameEnabledBoolean extends js.Object {
  var attributeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_AttributeNameEnabledBoolean {
  @scala.inline
  def apply(
    attributeName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_AttributeNameEnabledBoolean = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributeNameEnabledBoolean]
  }
}

