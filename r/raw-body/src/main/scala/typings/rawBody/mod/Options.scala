package typings.rawBody.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The encoding to use to decode the body into a string. By default, a
    * `Buffer` instance will be returned when no encoding is specified. Most
    * likely, you want `utf-8`, so setting encoding to `true` will decode as
    * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
    */
  var encoding: js.UndefOr[Encoding | Null] = js.undefined
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[Double | String | Null] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var limit: js.UndefOr[Double | String | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: js.UndefOr[Null | Encoding] = js.undefined,
    length: js.UndefOr[Null | Double | String] = js.undefined,
    limit: js.UndefOr[Null | Double | String] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

