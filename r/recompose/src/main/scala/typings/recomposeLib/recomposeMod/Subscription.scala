package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): scala.Unit
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: js.Function0[scala.Unit]): Subscription = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[Subscription]
  }
}

