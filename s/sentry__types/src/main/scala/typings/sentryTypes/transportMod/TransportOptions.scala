package typings.sentryTypes.transportMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.dsnMod.DsnLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportOptions extends js.Object {
  
  /** HTTPS proxy certificates path */
  var caCerts: js.UndefOr[String] = js.native
  
  /** Sentry DSN */
  var dsn: DsnLike = js.native
  
  /** Fetch API init parameters */
  var fetchParameters: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Define custom headers */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Set a HTTP proxy that should be used for outbound requests. */
  var httpProxy: js.UndefOr[String] = js.native
  
  /** Set a HTTPS proxy that should be used for outbound requests. */
  var httpsProxy: js.UndefOr[String] = js.native
}
object TransportOptions {
  
  @scala.inline
  def apply(dsn: DsnLike): TransportOptions = {
    val __obj = js.Dynamic.literal(dsn = dsn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
  
  @scala.inline
  implicit class TransportOptionsOps[Self <: TransportOptions] (val x: Self) extends AnyVal {
    
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
    def setDsn(value: DsnLike): Self = this.set("dsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCerts(value: String): Self = this.set("caCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCerts: Self = this.set("caCerts", js.undefined)
    
    @scala.inline
    def setFetchParameters(value: StringDictionary[String]): Self = this.set("fetchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchParameters: Self = this.set("fetchParameters", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpProxy: Self = this.set("httpProxy", js.undefined)
    
    @scala.inline
    def setHttpsProxy(value: String): Self = this.set("httpsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsProxy: Self = this.set("httpsProxy", js.undefined)
  }
}
