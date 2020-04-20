package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityOptions extends BaseOptions {
  /**
  		 * message id to modify.
  		 *
  		 * @type {string}
  		 * @memberof DeleteMessageOptions
  		 */
  var id: String
  /**
  		 * The length of time, in seconds, that this message will not be visible.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof ChangeMessageVisibilityOptions
  		 */
  var vt: Double
}

object ChangeMessageVisibilityOptions {
  @scala.inline
  def apply(id: String, qname: String, vt: Double): ChangeMessageVisibilityOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityOptions]
  }
}

