package typings.pulumiAws.quicksightGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of group
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * A description for the group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the group.
    */
  val groupName: js.UndefOr[Input[String]] = js.native
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: js.UndefOr[Input[String]] = js.native
}

object GroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    awsAccountId: Input[String] = null,
    description: Input[String] = null,
    groupName: Input[String] = null,
    namespace: Input[String] = null
  ): GroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
}

