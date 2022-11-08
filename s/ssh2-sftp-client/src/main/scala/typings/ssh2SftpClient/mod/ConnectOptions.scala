package typings.ssh2SftpClient.mod

import typings.ssh2.mod.ConnectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions
  extends StObject
     with ConnectConfig {
  
  var retries: js.UndefOr[Double] = js.undefined
  
  var retry_factor: js.UndefOr[Double] = js.undefined
  
  var retry_minTimeout: js.UndefOr[Double] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  extension [Self <: ConnectOptions](x: Self) {
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setRetry_factor(value: Double): Self = StObject.set(x, "retry_factor", value.asInstanceOf[js.Any])
    
    inline def setRetry_factorUndefined: Self = StObject.set(x, "retry_factor", js.undefined)
    
    inline def setRetry_minTimeout(value: Double): Self = StObject.set(x, "retry_minTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetry_minTimeoutUndefined: Self = StObject.set(x, "retry_minTimeout", js.undefined)
  }
}
