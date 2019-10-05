package typings.atPulumiAws.typesInputMod.mediapackage

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHlsIngestIngestEndpoint extends js.Object {
  /**
    * The password
    */
  var password: js.UndefOr[Input[String]] = js.undefined
  /**
    * The URL
    */
  var url: js.UndefOr[Input[String]] = js.undefined
  /**
    * The username
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}

object ChannelHlsIngestIngestEndpoint {
  @scala.inline
  def apply(password: Input[String] = null, url: Input[String] = null, username: Input[String] = null): ChannelHlsIngestIngestEndpoint = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
  }
}

