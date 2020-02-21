package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[Uint8Array] = js.undefined
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ Uint8Array, 
      /* privateKey */ Uint8Array, 
      /* algo */ Uint8Array | Null, 
      /* data */ Uint8Array | Null, 
      /* attempt */ Double, 
      Uint8Array
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: Uint8Array = null,
    noncefn: (/* message */ Uint8Array, /* privateKey */ Uint8Array, /* algo */ Uint8Array | Null, /* data */ Uint8Array | Null, /* attempt */ Double) => Uint8Array = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5(noncefn))
    __obj.asInstanceOf[SignOptions]
  }
}

