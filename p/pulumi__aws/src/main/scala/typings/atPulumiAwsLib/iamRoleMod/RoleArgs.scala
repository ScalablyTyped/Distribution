package typings
package atPulumiAwsLib.iamRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleArgs extends js.Object {
  /**
    * The policy that grants an entity permission to assume the role.
    */
  val assumeRolePolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  /**
    * The description of the role.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
    */
  val forceDetachPolicies: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
    */
  val maxSessionDuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The name of the role. If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The path to the role.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Key-value mapping of tags for the IAM role
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object RoleArgs {
  @scala.inline
  def apply(
    assumeRolePolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDetachPolicies: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    maxSessionDuration: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    path: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    permissionsBoundary: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): RoleArgs = {
    val __obj = js.Dynamic.literal(assumeRolePolicy = assumeRolePolicy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDetachPolicies != null) __obj.updateDynamic("forceDetachPolicies")(forceDetachPolicies.asInstanceOf[js.Any])
    if (maxSessionDuration != null) __obj.updateDynamic("maxSessionDuration")(maxSessionDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (permissionsBoundary != null) __obj.updateDynamic("permissionsBoundary")(permissionsBoundary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleArgs]
  }
}

