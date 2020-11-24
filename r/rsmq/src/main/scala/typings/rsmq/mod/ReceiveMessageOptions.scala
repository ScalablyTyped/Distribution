package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveMessageOptions extends BaseOptions {
  
  /**
  		 * *(Default: queue settings)*
  		 * The length of time, in seconds, that the received message will be invisible to others.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof ReceiveMessageOptions
  		 */
  var vt: js.UndefOr[Double] = js.native
}
object ReceiveMessageOptions {
  
  @scala.inline
  def apply(qname: String): ReceiveMessageOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageOptions]
  }
  
  @scala.inline
  implicit class ReceiveMessageOptionsOps[Self <: ReceiveMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setVt(value: Double): Self = this.set("vt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVt: Self = this.set("vt", js.undefined)
  }
}
