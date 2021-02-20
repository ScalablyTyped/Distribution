package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends BrowserOptions {
  
  /**
    * A browser url to connect to, in format `http://${host}:${port}`.
    * Use interchangeably with browserWSEndpoint to let Puppeteer fetch it from metadata endpoint.
    */
  var browserURL: js.UndefOr[String] = js.native
  
  /** A browser websocket endpoint to connect to. */
  var browserWSEndpoint: js.UndefOr[String] = js.native
  
  /**
    * **Experimental** Specify a custom transport object for Puppeteer to use.
    */
  var transport: js.UndefOr[ConnectionTransport] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserURL(value: String): Self = StObject.set(x, "browserURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserURLUndefined: Self = StObject.set(x, "browserURL", js.undefined)
    
    @scala.inline
    def setBrowserWSEndpoint(value: String): Self = StObject.set(x, "browserWSEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserWSEndpointUndefined: Self = StObject.set(x, "browserWSEndpoint", js.undefined)
    
    @scala.inline
    def setTransport(value: ConnectionTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
