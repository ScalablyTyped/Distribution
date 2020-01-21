package typings.pulumiAws.roleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The policy that grants an entity permission to assume the role.
    */
  val assumeRolePolicy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * The creation date of the IAM role.
    */
  val createDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
    */
  val forceDetachPolicies: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
    */
  val maxSessionDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the role. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the role.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the IAM role
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object RoleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    assumeRolePolicy: Input[String | PolicyDocument] = null,
    createDate: Input[String] = null,
    description: Input[String] = null,
    forceDetachPolicies: Input[Boolean] = null,
    maxSessionDuration: Input[Double] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    permissionsBoundary: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uniqueId: Input[String] = null
  ): RoleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (assumeRolePolicy != null) __obj.updateDynamic("assumeRolePolicy")(assumeRolePolicy.asInstanceOf[js.Any])
    if (createDate != null) __obj.updateDynamic("createDate")(createDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDetachPolicies != null) __obj.updateDynamic("forceDetachPolicies")(forceDetachPolicies.asInstanceOf[js.Any])
    if (maxSessionDuration != null) __obj.updateDynamic("maxSessionDuration")(maxSessionDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (permissionsBoundary != null) __obj.updateDynamic("permissionsBoundary")(permissionsBoundary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleState]
  }
}

