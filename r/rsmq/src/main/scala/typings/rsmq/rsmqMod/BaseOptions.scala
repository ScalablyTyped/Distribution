package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  		 * The Queue name.
  		 * Maximum 160 characters; alphanumeric characters, hyphens (-), and underscores (_) are allowed.
  		 *
  		 * @type {string}
  		 * @memberof BaseQueueOptions
  		 */
  var qname: String
}

object BaseOptions {
  @scala.inline
  def apply(qname: String): BaseOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseOptions]
  }
}

