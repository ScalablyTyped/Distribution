package typings.sipJs.publisherOptionsMod

import typings.sipJs.anon.FromTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherOptions extends js.Object {
  /** @deprecated TODO: provide alternative. */
  var body: js.UndefOr[String] = js.native
  /** @deprecated TODO: provide alternative. */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Expire value for the published event.
    * @defaultValue 3600
    */
  var expires: js.UndefOr[Double] = js.native
  /**
    * Array of extra headers added to the PUBLISH request message.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromTag] = js.native
  /**
    * If set true, UA will gracefully unpublish for the event on UA close.
    * @defaultValue true
    */
  var unpublishOnClose: js.UndefOr[Boolean] = js.native
}

object PublisherOptions {
  @scala.inline
  def apply(): PublisherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherOptions]
  }
  @scala.inline
  implicit class PublisherOptionsOps[Self <: PublisherOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setParams(value: FromTag): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setUnpublishOnClose(value: Boolean): Self = this.set("unpublishOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpublishOnClose: Self = this.set("unpublishOnClose", js.undefined)
  }
  
}

