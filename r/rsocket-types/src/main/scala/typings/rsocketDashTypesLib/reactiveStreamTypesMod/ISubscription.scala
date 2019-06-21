package typings
package rsocketDashTypesLib.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  def cancel(): scala.Unit
  def request(n: scala.Double): scala.Unit
}

object ISubscription {
  @scala.inline
  def apply(cancel: () => scala.Unit, request: scala.Double => scala.Unit): ISubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[ISubscription]
  }
}

