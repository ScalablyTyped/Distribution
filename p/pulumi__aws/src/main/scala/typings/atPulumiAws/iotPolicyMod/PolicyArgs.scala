package typings.atPulumiAws.iotPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyArgs extends js.Object {
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val policy: Input[String]
}

object PolicyArgs {
  @scala.inline
  def apply(policy: Input[String], name: Input[String] = null): PolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

