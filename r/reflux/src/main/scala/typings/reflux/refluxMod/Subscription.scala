package typings.reflux.refluxMod

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
    val __obj = js.Dynamic.literal(listenable = listenable.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Subscription]
  }
}

