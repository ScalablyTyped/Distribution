package typings.pulumiAws.elasticacheSecurityGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupArgs extends js.Object {
  /**
    * description for the cache security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name for the cache security group. This value is stored as a lowercase string.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * List of EC2 security group names to be
    * authorized for ingress to the cache security group
    */
  val securityGroupNames: Input[js.Array[Input[String]]] = js.native
}

object SecurityGroupArgs {
  @scala.inline
  def apply(
    securityGroupNames: Input[js.Array[Input[String]]],
    description: Input[String] = null,
    name: Input[String] = null
  ): SecurityGroupArgs = {
    val __obj = js.Dynamic.literal(securityGroupNames = securityGroupNames.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupArgs]
  }
}

