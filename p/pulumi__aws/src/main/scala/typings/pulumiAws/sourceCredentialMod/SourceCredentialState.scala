package typings.pulumiAws.sourceCredentialMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceCredentialState extends js.Object {
  /**
    * The ARN of Source Credential.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
    */
  val authType: js.UndefOr[Input[String]] = js.native
  /**
    * The source provider used for this project.
    */
  val serverType: js.UndefOr[Input[String]] = js.native
  /**
    * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
    */
  val token: js.UndefOr[Input[String]] = js.native
  /**
    * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
    */
  val userName: js.UndefOr[Input[String]] = js.native
}

object SourceCredentialState {
  @scala.inline
  def apply(): SourceCredentialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCredentialState]
  }
  @scala.inline
  implicit class SourceCredentialStateOps[Self <: SourceCredentialState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAuthType(value: Input[String]): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    @scala.inline
    def setServerType(value: Input[String]): Self = this.set("serverType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
    @scala.inline
    def setToken(value: Input[String]): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

