package typings
package stompjsLib.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var id: java.lang.String
  def unsubscribe(): scala.Unit
}

object Subscription {
  @scala.inline
  def apply(id: java.lang.String, unsubscribe: () => scala.Unit): Subscription = {
    val __obj = js.Dynamic.literal(id = id, unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Subscription]
  }
}

