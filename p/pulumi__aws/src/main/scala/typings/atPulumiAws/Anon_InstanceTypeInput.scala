package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstanceTypeInput extends js.Object {
  var instanceType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_InstanceTypeInput {
  @scala.inline
  def apply(instanceType: Input[String] = null): Anon_InstanceTypeInput = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InstanceTypeInput]
  }
}

