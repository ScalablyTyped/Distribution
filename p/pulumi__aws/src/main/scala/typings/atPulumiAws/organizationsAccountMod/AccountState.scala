package typings.atPulumiAws.organizationsAccountMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountState extends js.Object {
  /**
    * The ARN for this account.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
    */
  val email: js.UndefOr[Input[String]] = js.undefined
  /**
    * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
    */
  val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.undefined
  val joinedMethod: js.UndefOr[Input[String]] = js.undefined
  val joinedTimestamp: js.UndefOr[Input[String]] = js.undefined
  /**
    * A friendly name for the member account.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
    */
  val parentId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignore_changes`](https://www.terraform.io/docs/configuration/resources.html#ignore_changes) is used.
    */
  val roleName: js.UndefOr[Input[String]] = js.undefined
  val status: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object AccountState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    email: Input[String] = null,
    iamUserAccessToBilling: Input[String] = null,
    joinedMethod: Input[String] = null,
    joinedTimestamp: Input[String] = null,
    name: Input[String] = null,
    parentId: Input[String] = null,
    roleName: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AccountState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (iamUserAccessToBilling != null) __obj.updateDynamic("iamUserAccessToBilling")(iamUserAccessToBilling.asInstanceOf[js.Any])
    if (joinedMethod != null) __obj.updateDynamic("joinedMethod")(joinedMethod.asInstanceOf[js.Any])
    if (joinedTimestamp != null) __obj.updateDynamic("joinedTimestamp")(joinedTimestamp.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountState]
  }
}

