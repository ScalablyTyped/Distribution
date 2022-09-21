package typings.snowflakeSdk.mod

import typings.snowflakeSdk.snowflakeSdkStrings.DEBUG
import typings.snowflakeSdk.snowflakeSdkStrings.ERROR
import typings.snowflakeSdk.snowflakeSdkStrings.INFO
import typings.snowflakeSdk.snowflakeSdkStrings.TRACE
import typings.snowflakeSdk.snowflakeSdkStrings.WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureOptions extends StObject {
  
  var insecureConnect: js.UndefOr[Boolean] = js.undefined
  
  var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG | TRACE] = js.undefined
  
  /**
    * ### Related Docs
    * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#choosing-fail-open-or-fail-close-mode Choosing `Fail-Open` or `Fail-Close` Mode}
    */
  var ocspFailOpen: js.UndefOr[Boolean] = js.undefined
}
object ConfigureOptions {
  
  inline def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  extension [Self <: ConfigureOptions](x: Self) {
    
    inline def setInsecureConnect(value: Boolean): Self = StObject.set(x, "insecureConnect", value.asInstanceOf[js.Any])
    
    inline def setInsecureConnectUndefined: Self = StObject.set(x, "insecureConnect", js.undefined)
    
    inline def setLogLevel(value: ERROR | WARN | INFO | DEBUG | TRACE): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setOcspFailOpen(value: Boolean): Self = StObject.set(x, "ocspFailOpen", value.asInstanceOf[js.Any])
    
    inline def setOcspFailOpenUndefined: Self = StObject.set(x, "ocspFailOpen", js.undefined)
  }
}
