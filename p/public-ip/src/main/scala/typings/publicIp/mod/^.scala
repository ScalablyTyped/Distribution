package typings.publicIp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("public-ip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Get your public IP address - very fast!
  	In Node.js, it queries the DNS records of OpenDNS which has an entry with your IP address. In browsers, it uses the excellent [icanhaz](https://github.com/major/icanhaz) service through HTTPS.
  	@returns Your public IPv4 address. A `.cancel()` method is available on the promise, which can be used to cancel the request.
  	@throws On error or timeout.
  	@example
  	```
  	import publicIp = require('public-ip');
  	(async () => {
  		console.log(await publicIp.v4());
  		//=> '46.5.21.123'
  	})();
  	```
  	*/
  def v4(): CancelablePromise[String] = js.native
  def v4(options: Options): CancelablePromise[String] = js.native
  /**
  	Get your public IP address - very fast!
  	In Node.js, it queries the DNS records of OpenDNS which has an entry with your IP address. In browsers, it uses the excellent [icanhaz](https://github.com/major/icanhaz) service through HTTPS.
  	@returns Your public IPv6 address. A `.cancel()` method is available on the promise, which can be used to cancel the request.
  	@throws On error or timeout.
  	@example
  	```
  	import publicIp = require('public-ip');
  	(async () => {
  		console.log(await publicIp.v6());
  		//=> 'fe80::200:f8ff:fe21:67cf'
  	})();
  	```
  	*/
  def v6(): CancelablePromise[String] = js.native
  def v6(options: Options): CancelablePromise[String] = js.native
}

