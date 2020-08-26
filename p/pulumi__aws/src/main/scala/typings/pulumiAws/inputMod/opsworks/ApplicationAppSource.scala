package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAppSource extends js.Object {
  /**
    * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[Input[String]] = js.native
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[Input[String]] = js.native
  /**
    * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[Input[String]] = js.native
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: Input[String] = js.native
  /**
    * The URL where the app resource can be found.
    */
  var url: js.UndefOr[Input[String]] = js.native
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[Input[String]] = js.native
}

object ApplicationAppSource {
  @scala.inline
  def apply(`type`: Input[String]): ApplicationAppSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppSource]
  }
  @scala.inline
  implicit class ApplicationAppSourceOps[Self <: ApplicationAppSource] (val x: Self) extends AnyVal {
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRevision(value: Input[String]): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setSshKey(value: Input[String]): Self = this.set("sshKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshKey: Self = this.set("sshKey", js.undefined)
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

