package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ecdhOptions extends js.Object {
  var data: js.UndefOr[Uint8Array] = js.undefined
  var hashfn: js.UndefOr[
    js.Function3[/* x */ Uint8Array, /* y */ Uint8Array, /* data */ Uint8Array, Uint8Array]
  ] = js.undefined
  var xbuf: js.UndefOr[Uint8Array] = js.undefined
  var ybuf: js.UndefOr[Uint8Array] = js.undefined
}

object ecdhOptions {
  @scala.inline
  def apply(
    data: Uint8Array = null,
    hashfn: (/* x */ Uint8Array, /* y */ Uint8Array, /* data */ Uint8Array) => Uint8Array = null,
    xbuf: Uint8Array = null,
    ybuf: Uint8Array = null
  ): ecdhOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (hashfn != null) __obj.updateDynamic("hashfn")(js.Any.fromFunction3(hashfn))
    if (xbuf != null) __obj.updateDynamic("xbuf")(xbuf.asInstanceOf[js.Any])
    if (ybuf != null) __obj.updateDynamic("ybuf")(ybuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ecdhOptions]
  }
}

