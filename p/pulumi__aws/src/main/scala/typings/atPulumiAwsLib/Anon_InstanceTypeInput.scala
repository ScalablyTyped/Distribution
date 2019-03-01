package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstanceTypeInput extends js.Object {
  var instanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_InstanceTypeInput {
  @scala.inline
  def apply(instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_InstanceTypeInput = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InstanceTypeInput]
  }
}

