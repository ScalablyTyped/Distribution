package typings.saslDigestMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var genNonce: js.UndefOr[js.Function0[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(genNonce: () => Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (genNonce != null) __obj.updateDynamic("genNonce")(js.Any.fromFunction0(genNonce))
    __obj.asInstanceOf[Options]
  }
}

