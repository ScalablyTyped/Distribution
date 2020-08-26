package typings.publicIp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  val fallbackUrls: js.UndefOr[js.Array[String]] = js.native
  /**
  		Use a HTTPS check using the [icanhazip.com](https://github.com/major/icanhaz) service instead of the DNS query. [ipify.org](https://www.ipify.org) is used as a fallback if `icanhazip.com` fails. This check is much more secure and tamper-proof, but also a lot slower. __This option is only available in the Node.js version__. The default behaviour is to check aginst DNS before using HTTPS fallback. If set to `true`, it will _only_ check against HTTPS.
  		@default false
  		*/
  val onlyHttps: js.UndefOr[Boolean] = js.native
  /**
  		The time in milliseconds until a request is considered timed out.
  		@default 5000
  		*/
  val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFallbackUrlsVarargs(value: String*): Self = this.set("fallbackUrls", js.Array(value :_*))
    @scala.inline
    def setFallbackUrls(value: js.Array[String]): Self = this.set("fallbackUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackUrls: Self = this.set("fallbackUrls", js.undefined)
    @scala.inline
    def setOnlyHttps(value: Boolean): Self = this.set("onlyHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyHttps: Self = this.set("onlyHttps", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

