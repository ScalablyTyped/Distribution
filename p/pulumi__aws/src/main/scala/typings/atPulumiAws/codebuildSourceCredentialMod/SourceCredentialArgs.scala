package typings.atPulumiAws.codebuildSourceCredentialMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceCredentialArgs extends js.Object {
  /**
    * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
    */
  val authType: Input[String]
  /**
    * The source provider used for this project.
    */
  val serverType: Input[String]
  /**
    * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
    */
  val token: Input[String]
  /**
    * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
    */
  val userName: js.UndefOr[Input[String]] = js.undefined
}

object SourceCredentialArgs {
  @scala.inline
  def apply(
    authType: Input[String],
    serverType: Input[String],
    token: Input[String],
    userName: Input[String] = null
  ): SourceCredentialArgs = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCredentialArgs]
  }
}

