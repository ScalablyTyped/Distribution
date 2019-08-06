package typings.atPulumiAws.codebuildSourceCredentialMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceCredentialState extends js.Object {
  /**
    * The ARN of Source Credential.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
    */
  val authType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The source provider used for this project.
    */
  val serverType: js.UndefOr[Input[String]] = js.undefined
  /**
    * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
    */
  val token: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
    */
  val userName: js.UndefOr[Input[String]] = js.undefined
}

object SourceCredentialState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    authType: Input[String] = null,
    serverType: Input[String] = null,
    token: Input[String] = null,
    userName: Input[String] = null
  ): SourceCredentialState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCredentialState]
  }
}

