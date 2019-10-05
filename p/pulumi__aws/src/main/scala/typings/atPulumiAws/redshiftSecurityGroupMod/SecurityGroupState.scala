package typings.atPulumiAws.redshiftSecurityGroupMod

import typings.atPulumiAws.typesInputMod.redshift.SecurityGroupIngress
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupState extends js.Object {
  /**
    * The description of the Redshift security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of ingress rules.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[SecurityGroupIngress]]]] = js.undefined
  /**
    * The name of the Redshift security group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object SecurityGroupState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    ingress: Input[js.Array[Input[SecurityGroupIngress]]] = null,
    name: Input[String] = null
  ): SecurityGroupState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupState]
  }
}

