package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNameEnabledBoolean extends js.Object {
  var attributeName: Input[String]
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_AttributeNameEnabledBoolean {
  @scala.inline
  def apply(attributeName: Input[String], enabled: Input[Boolean] = null): Anon_AttributeNameEnabledBoolean = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributeNameEnabledBoolean]
  }
}

