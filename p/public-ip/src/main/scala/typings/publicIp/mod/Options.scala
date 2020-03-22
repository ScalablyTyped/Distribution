package typings.publicIp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Add your own custom HTTPS endpoints to get the public IP from. They will only be used if everything else fails. Any service used as fallback _must_ return the IP as a plain string.
  		@default []
  		@example
  		```
  		import publicIp = require('public-ip');
  		(async () => {
  			await publicIp.v6({
  				fallbackUrls: [
  					'https://ifconfig.co/ip'
  				]
  			});
  		})();
  		```
  		*/
  val fallbackUrls: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		Use a HTTPS check using the [icanhazip.com](https://github.com/major/icanhaz) service instead of the DNS query. [ipify.org](https://www.ipify.org) is used as a fallback if `icanhazip.com` fails. This check is much more secure and tamper-proof, but also a lot slower. __This option is only available in the Node.js version__. The default behaviour is to check aginst DNS before using HTTPS fallback. If set to `true`, it will _only_ check against HTTPS.
  		@default false
  		*/
  val onlyHttps: js.UndefOr[Boolean] = js.undefined
  /**
  		The time in milliseconds until a request is considered timed out.
  		@default 5000
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fallbackUrls: js.Array[String] = null,
    onlyHttps: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fallbackUrls != null) __obj.updateDynamic("fallbackUrls")(fallbackUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyHttps)) __obj.updateDynamic("onlyHttps")(onlyHttps.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

