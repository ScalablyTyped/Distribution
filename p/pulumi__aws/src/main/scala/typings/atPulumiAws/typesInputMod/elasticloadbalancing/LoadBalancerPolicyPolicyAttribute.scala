package typings.atPulumiAws.typesInputMod.elasticloadbalancing

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerPolicyPolicyAttribute extends js.Object {
  var name: js.UndefOr[Input[String]] = js.undefined
  var value: js.UndefOr[Input[String]] = js.undefined
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

