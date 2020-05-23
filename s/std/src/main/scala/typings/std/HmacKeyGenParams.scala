package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyGenParams extends Algorithm {
  var hash: HashAlgorithmIdentifier
  var length: js.UndefOr[Double] = js.undefined
}

object HmacKeyGenParams {
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String, length: js.UndefOr[Double] = js.undefined): HmacKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyGenParams]
  }
}

