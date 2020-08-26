package typings.rotJs.stringgeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Order, default = 3 */
  var order: Double = js.native
  /** Prior value, default = 0.001 */
  var prior: Double = js.native
  /** Use word mode? */
  var words: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(order: Double, prior: Double, words: Boolean): Options = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], prior = prior.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrior(value: Double): Self = this.set("prior", value.asInstanceOf[js.Any])
    @scala.inline
    def setWords(value: Boolean): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

