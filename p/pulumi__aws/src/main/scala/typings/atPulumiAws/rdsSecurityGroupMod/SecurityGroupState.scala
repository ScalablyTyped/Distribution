package typings.atPulumiAws.rdsSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CidrSecurityGroupId
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupState extends js.Object {
  /**
    * The arn of the DB security group.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the DB security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of ingress rules.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[Anon_CidrSecurityGroupId]]]] = js.undefined
  /**
    * The name of the DB security group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object SecurityGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    ingress: Input[js.Array[Input[Anon_CidrSecurityGroupId]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): SecurityGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupState]
  }
}

