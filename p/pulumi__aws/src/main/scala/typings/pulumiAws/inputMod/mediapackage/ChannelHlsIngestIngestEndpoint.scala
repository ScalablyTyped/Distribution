package typings.pulumiAws.inputMod.mediapackage

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHlsIngestIngestEndpoint extends js.Object {
  /**
    * The password
    */
  var password: js.UndefOr[Input[String]] = js.native
  /**
    * The URL
    */
  var url: js.UndefOr[Input[String]] = js.native
  /**
    * The username
    */
  var username: js.UndefOr[Input[String]] = js.native
}

object ChannelHlsIngestIngestEndpoint {
  @scala.inline
  def apply(): ChannelHlsIngestIngestEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
  }
  @scala.inline
  implicit class ChannelHlsIngestIngestEndpointOps[Self <: ChannelHlsIngestIngestEndpoint] (val x: Self) extends AnyVal {
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
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
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

