package typings.rsocketTypes.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  def cancel(): Unit
  def request(n: Double): Unit
}

object ISubscription {
  @scala.inline
  def apply(cancel: () => Unit, request: Double => Unit): ISubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[ISubscription]
  }
}

