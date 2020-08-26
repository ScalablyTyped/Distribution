package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  /**
  		 * The Queue name.
  		 * Maximum 160 characters; alphanumeric characters, hyphens (-), and underscores (_) are allowed.
  		 *
  		 * @type {string}
  		 * @memberof BaseQueueOptions
  		 */
  var qname: String = js.native
}

object BaseOptions {
  @scala.inline
  def apply(qname: String): BaseOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setQname(value: String): Self = this.set("qname", value.asInstanceOf[js.Any])
  }
  
}

