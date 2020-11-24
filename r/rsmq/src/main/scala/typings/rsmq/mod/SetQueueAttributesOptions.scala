package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetQueueAttributesOptions extends BaseOptions {
  
  /**
  		 * The time in seconds that the delivery of all new messages in the queue will be delayed.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var delay: js.UndefOr[Double] = js.native
  
  /**
  		 * The maximum message size in bytes.
  		 * Allowed values: 1024-65536 and -1 (for unlimited size)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var maxsize: js.UndefOr[Double] = js.native
  
  /**
  		 * The length of time, in seconds,
  		 * that a message received from a queue will be invisible to other receiving components
  		 * when they ask to receive messages.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var vt: js.UndefOr[Double] = js.native
}
object SetQueueAttributesOptions {
  
  @scala.inline
  def apply(qname: String): SetQueueAttributesOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetQueueAttributesOptions]
  }
  
  @scala.inline
  implicit class SetQueueAttributesOptionsOps[Self <: SetQueueAttributesOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setMaxsize(value: Double): Self = this.set("maxsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxsize: Self = this.set("maxsize", js.undefined)
    
    @scala.inline
    def setVt(value: Double): Self = this.set("vt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVt: Self = this.set("vt", js.undefined)
  }
}
