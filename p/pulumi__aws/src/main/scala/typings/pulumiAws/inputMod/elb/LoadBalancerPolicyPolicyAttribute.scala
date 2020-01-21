package typings.pulumiAws.inputMod.elb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerPolicyPolicyAttribute extends js.Object {
  var name: js.UndefOr[Input[String]] = js.native
  var value: js.UndefOr[Input[String]] = js.native
}

object LoadBalancerPolicyPolicyAttribute {
  @scala.inline
  def apply(name: Input[String] = null, value: Input[String] = null): LoadBalancerPolicyPolicyAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
  }
}

