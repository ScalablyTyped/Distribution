package typings.atPulumiAws.typesOutputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerPolicyPolicyAttribute extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object LoadBalancerPolicyPolicyAttribute {
  @scala.inline
  def apply(name: String = null, value: String = null): LoadBalancerPolicyPolicyAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
  }
}

