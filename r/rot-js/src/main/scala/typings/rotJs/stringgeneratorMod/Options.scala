package typings.rotJs.stringgeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Order, default = 3 */
  var order: Double
  /** Prior value, default = 0.001 */
  var prior: Double
  /** Use word mode? */
  var words: Boolean
}

object Options {
  @scala.inline
  def apply(order: Double, prior: Double, words: Boolean): Options = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], prior = prior.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

