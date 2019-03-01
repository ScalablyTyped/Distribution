package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var listenable: Listenable
  var stop: js.Function
}

object Subscription {
  @scala.inline
  def apply(listenable: Listenable, stop: js.Function): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listenable")(listenable)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Subscription]
  }
}

