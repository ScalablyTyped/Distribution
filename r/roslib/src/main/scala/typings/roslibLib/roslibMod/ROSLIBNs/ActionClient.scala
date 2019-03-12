package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionClient extends js.Object {
  /**
  		 * Cancel all goals associated with this ActionClient.
  		 */
  def cancel(): scala.Unit
}

object ActionClient {
  @scala.inline
  def apply(cancel: () => scala.Unit): ActionClient = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[ActionClient]
  }
}

