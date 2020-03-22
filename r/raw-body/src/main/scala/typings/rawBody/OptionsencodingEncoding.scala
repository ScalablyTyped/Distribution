package typings.rawBody

import typings.rawBody.mod.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raw-body.raw-body.Options & {  encoding  :raw-body.raw-body.Encoding} */
trait OptionsencodingEncoding extends js.Object {
  /**
    * The encoding to use to decode the body into a string. By default, a
    * `Buffer` instance will be returned when no encoding is specified. Most
    * likely, you want `utf-8`, so setting encoding to `true` will decode as
    * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
    */
  var encoding: js.UndefOr[(Encoding | Null) with Encoding] = js.undefined
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

object OptionsencodingEncoding {
  @scala.inline
  def apply(
    encoding: (Encoding | Null) with Encoding = null,
    length: Double | String = null,
    limit: Double | String = null
  ): OptionsencodingEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsencodingEncoding]
  }
}

