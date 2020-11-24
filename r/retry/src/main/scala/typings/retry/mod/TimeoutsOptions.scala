package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutsOptions extends CreateTimeoutOptions {
  
  /**
    * The maximum amount of times to retry the operation.
    * @default 10
    */
  var retries: js.UndefOr[Double] = js.native
}
object TimeoutsOptions {
  
  @scala.inline
  def apply(): TimeoutsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutsOptions]
  }
  
  @scala.inline
  implicit class TimeoutsOptionsOps[Self <: TimeoutsOptions] (val x: Self) extends AnyVal {
    
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
  }
}
