package typings.ssh2SftpClient.mod

import typings.ssh2.mod.ConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends ConnectConfig {
  
  var retries: js.UndefOr[Double] = js.native
  
  var retry_factor: js.UndefOr[Double] = js.native
  
  var retry_minTimeout: js.UndefOr[Double] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetry_factor(value: Double): Self = this.set("retry_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry_factor: Self = this.set("retry_factor", js.undefined)
    
    @scala.inline
    def setRetry_minTimeout(value: Double): Self = this.set("retry_minTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry_minTimeout: Self = this.set("retry_minTimeout", js.undefined)
  }
}
