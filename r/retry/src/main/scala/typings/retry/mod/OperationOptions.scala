package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationOptions extends TimeoutsOptions {
  
  /**
    * Whether to retry forever.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum time (in milliseconds) that the retried operation is allowed to run.
    * @default Infinity
    */
  var maxRetryTime: js.UndefOr[Double] = js.native
  
  /**
    * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
    * @default false
    */
  var unref: js.UndefOr[Boolean] = js.native
}
object OperationOptions {
  
  @scala.inline
  def apply(): OperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOptions]
  }
  
  @scala.inline
  implicit class OperationOptionsOps[Self <: OperationOptions] (val x: Self) extends AnyVal {
    
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
    def setForever(value: Boolean): Self = this.set("forever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForever: Self = this.set("forever", js.undefined)
    
    @scala.inline
    def setMaxRetryTime(value: Double): Self = this.set("maxRetryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetryTime: Self = this.set("maxRetryTime", js.undefined)
    
    @scala.inline
    def setUnref(value: Boolean): Self = this.set("unref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnref: Self = this.set("unref", js.undefined)
  }
}
