package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatParams extends Algorithm {
  var algorithmId: Uint8Array
  var hash: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  var partyUInfo: Uint8Array
  var partyVInfo: Uint8Array
  var privateInfo: js.UndefOr[Uint8Array] = js.undefined
  var publicInfo: js.UndefOr[Uint8Array] = js.undefined
}

object ConcatParams {
  @scala.inline
  def apply(
    algorithmId: Uint8Array,
    name: java.lang.String,
    partyUInfo: Uint8Array,
    partyVInfo: Uint8Array,
    hash: java.lang.String | Algorithm = null,
    privateInfo: Uint8Array = null,
    publicInfo: Uint8Array = null
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (privateInfo != null) __obj.updateDynamic("privateInfo")(privateInfo.asInstanceOf[js.Any])
    if (publicInfo != null) __obj.updateDynamic("publicInfo")(publicInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
}

