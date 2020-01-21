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
trait FetchOptions extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var xhr: js.UndefOr[Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(binary: js.UndefOr[Boolean] = js.undefined, xhr: js.UndefOr[Boolean] = js.undefined): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(xhr)) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

