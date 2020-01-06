package typings.atPulumiAws.iotRoleAliasMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAliasState extends js.Object {
  /**
    * The name of the role alias.
    */
  val alias: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN assigned by AWS to this role alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
    */
  val credentialDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The identity of the role to which the alias refers.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object RoleAliasState {
  @scala.inline
  def apply(
    alias: Input[String] = null,
    arn: Input[String] = null,
    credentialDuration: Input[Double] = null,
    roleArn: Input[String] = null
  ): RoleAliasState = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (credentialDuration != null) __obj.updateDynamic("credentialDuration")(credentialDuration.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAliasState]
  }
}

