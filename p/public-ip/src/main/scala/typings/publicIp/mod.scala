package typings.publicIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get your public IP address - very fast!
  	In Node.js, it queries the DNS records of OpenDNS, Google DNS, and HTTPS services to determine your IP address. In browsers, it uses the excellent [icanhaz](https://github.com/major/icanhaz) and [ipify](https://ipify.org) services through HTTPS.
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
  @JSImport("public-ip", "v4")
  @js.native
  def v4(): CancelablePromise[String] = js.native
  @JSImport("public-ip", "v4")
  @js.native
  def v4(options: Options): CancelablePromise[String] = js.native
  
  /**
  	Get your public IP address - very fast!
  	In Node.js, it queries the DNS records of OpenDNS, Google DNS, and HTTPS services to determine your IP address. In browsers, it uses the excellent [icanhaz](https://github.com/major/icanhaz) and [ipify](https://ipify.org) services through HTTPS.
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
  @JSImport("public-ip", "v6")
  @js.native
  def v6(): CancelablePromise[String] = js.native
  @JSImport("public-ip", "v6")
  @js.native
  def v6(options: Options): CancelablePromise[String] = js.native
  
  /* Inlined std.Promise<T> & {cancel (): void} */
  @js.native
  trait CancelablePromise[T] extends StObject {
    
    def cancel(): Unit = js.native
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TResult](): js.Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[T] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackUrls(value: js.Array[String]): Self = StObject.set(x, "fallbackUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUrlsUndefined: Self = StObject.set(x, "fallbackUrls", js.undefined)
      
      @scala.inline
      def setFallbackUrlsVarargs(value: String*): Self = StObject.set(x, "fallbackUrls", js.Array(value :_*))
      
      @scala.inline
      def setOnlyHttps(value: Boolean): Self = StObject.set(x, "onlyHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyHttpsUndefined: Self = StObject.set(x, "onlyHttps", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
