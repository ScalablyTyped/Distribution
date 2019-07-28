package typings.atPulumiAws.iamGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupState extends js.Object {
  /**
    * The ARN assigned by AWS for this group.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path in which to create the group.
    */
  val path: js.UndefOr[Input[String]] = js.undefined
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.undefined
}

object GroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    uniqueId: Input[String] = null
  ): GroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
}

