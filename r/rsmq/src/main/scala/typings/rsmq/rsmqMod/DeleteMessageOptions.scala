package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageOptions extends BaseOptions {
  /**
  		 * message id to delete.
  		 *
  		 * @type {string}
  		 * @memberof DeleteMessageOptions
  		 */
  var id: String
}

object DeleteMessageOptions {
  @scala.inline
  def apply(id: String, qname: String): DeleteMessageOptions = {
    val __obj = js.Dynamic.literal(id = id, qname = qname)
  
    __obj.asInstanceOf[DeleteMessageOptions]
  }
}

