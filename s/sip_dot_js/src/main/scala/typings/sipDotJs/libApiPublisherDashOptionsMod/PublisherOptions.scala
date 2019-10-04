package typings.sipDotJs.libApiPublisherDashOptionsMod

import typings.sipDotJs.Anon_FromDisplayNameFromTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherOptions extends js.Object {
  /** @deprecated TODO: provide alternative. */
  var body: js.UndefOr[String] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * Expire value for the published event.
    * @defaultValue 3600
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * Array of extra headers added to the PUBLISH request message.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[Anon_FromDisplayNameFromTag] = js.undefined
  /**
    * If set true, UA will gracefully unpublish for the event on UA close.
    * @defaultValue true
    */
  var unpublishOnClose: js.UndefOr[Boolean] = js.undefined
}

object PublisherOptions {
  @scala.inline
  def apply(
    body: String = null,
    contentType: String = null,
    expires: Int | Double = null,
    extraHeaders: js.Array[String] = null,
    params: Anon_FromDisplayNameFromTag = null,
    unpublishOnClose: js.UndefOr[Boolean] = js.undefined
  ): PublisherOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(unpublishOnClose)) __obj.updateDynamic("unpublishOnClose")(unpublishOnClose)
    __obj.asInstanceOf[PublisherOptions]
  }
}

