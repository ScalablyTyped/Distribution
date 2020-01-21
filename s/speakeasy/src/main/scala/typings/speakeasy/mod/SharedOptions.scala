package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedOptions extends js.Object {
  /**
    * Algorithm, defaults to sha1
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  /**
    * Key encoding, defaults to ascii
    */
  var encoding: js.UndefOr[Encoding] = js.undefined
}

object SharedOptions {
  @scala.inline
  def apply(algorithm: Algorithm = null, encoding: Encoding = null): SharedOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedOptions]
  }
}

