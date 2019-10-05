package typings.atPulumiAws.redshiftSecurityGroupMod

import typings.atPulumiAws.typesInputMod.redshift.SecurityGroupIngress
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupArgs extends js.Object {
  /**
    * The description of the Redshift security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of ingress rules.
    */
  val ingress: Input[js.Array[Input[SecurityGroupIngress]]]
  /**
    * The name of the Redshift security group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object SecurityGroupArgs {
  @scala.inline
  def apply(
    ingress: Input[js.Array[Input[SecurityGroupIngress]]],
    description: Input[String] = null,
    name: Input[String] = null
  ): SecurityGroupArgs = {
    val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupArgs]
  }
}

