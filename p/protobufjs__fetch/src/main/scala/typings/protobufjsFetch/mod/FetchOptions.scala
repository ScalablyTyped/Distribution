package typings.protobufjsFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options as used by {@link util.fetch}.
  * @typedef FetchOptions
  * @type {Object}
  * @property {boolean} [binary=false] Whether expecting a binary response
  * @property {boolean} [xhr=false] If `true`, forces the use of XMLHttpRequest
  */
@js.native
trait FetchOptions extends js.Object {
  var binary: js.UndefOr[Boolean] = js.native
  var xhr: js.UndefOr[Boolean] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

