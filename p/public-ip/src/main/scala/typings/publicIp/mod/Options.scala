package typings.publicIp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Use a HTTPS check using the [icanhazip.com](https://github.com/major/icanhaz) service instead of the DNS query. This check is much more secure and tamper-proof, but also a lot slower. **This option is only available in the Node.js version**.
  		@default false
  		*/
  val https: js.UndefOr[Boolean] = js.undefined
  /**
  		The time in milliseconds until a request is considered timed out.
  		@default 5000
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(https: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

