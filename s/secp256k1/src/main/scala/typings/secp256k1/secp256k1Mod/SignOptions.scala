package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[Buffer] = js.undefined
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ Buffer, 
      /* privateKey */ Buffer, 
      /* algo */ Buffer | Null, 
      /* data */ Buffer | Null, 
      /* attempt */ Double, 
      Buffer
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: Buffer = null,
    noncefn: (/* message */ Buffer, /* privateKey */ Buffer, /* algo */ Buffer | Null, /* data */ Buffer | Null, /* attempt */ Double) => Buffer = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5(noncefn))
    __obj.asInstanceOf[SignOptions]
  }
}

