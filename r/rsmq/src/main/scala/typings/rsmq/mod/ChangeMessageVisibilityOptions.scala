package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeMessageVisibilityOptions extends BaseOptions {
  
  /**
  		 * message id to modify.
  		 *
  		 * @type {string}
  		 * @memberof DeleteMessageOptions
  		 */
  var id: String = js.native
  
  /**
  		 * The length of time, in seconds, that this message will not be visible.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof ChangeMessageVisibilityOptions
  		 */
  var vt: Double = js.native
}
object ChangeMessageVisibilityOptions {
  
  @scala.inline
  def apply(id: String, qname: String, vt: Double): ChangeMessageVisibilityOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityOptions]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityOptionsOps[Self <: ChangeMessageVisibilityOptions] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVt(value: Double): Self = this.set("vt", value.asInstanceOf[js.Any])
  }
}
