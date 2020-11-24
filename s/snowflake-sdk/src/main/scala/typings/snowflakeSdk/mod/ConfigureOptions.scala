package typings.snowflakeSdk.mod

import typings.snowflakeSdk.snowflakeSdkStrings.DEBUG
import typings.snowflakeSdk.snowflakeSdkStrings.ERROR
import typings.snowflakeSdk.snowflakeSdkStrings.INFO
import typings.snowflakeSdk.snowflakeSdkStrings.TRACE
import typings.snowflakeSdk.snowflakeSdkStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureOptions extends js.Object {
  
  var insecureConnect: js.UndefOr[Boolean] = js.native
  
  var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG | TRACE] = js.native
  
  /**
    * ### Related Docs
    * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#choosing-fail-open-or-fail-close-mode Choosing `Fail-Open` or `Fail-Close` Mode}
    */
  var ocspFailOpen: js.UndefOr[Boolean] = js.native
}
object ConfigureOptions {
  
  @scala.inline
  def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    
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
    def setInsecureConnect(value: Boolean): Self = this.set("insecureConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureConnect: Self = this.set("insecureConnect", js.undefined)
    
    @scala.inline
    def setLogLevel(value: ERROR | WARN | INFO | DEBUG | TRACE): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOcspFailOpen(value: Boolean): Self = this.set("ocspFailOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcspFailOpen: Self = this.set("ocspFailOpen", js.undefined)
  }
}
