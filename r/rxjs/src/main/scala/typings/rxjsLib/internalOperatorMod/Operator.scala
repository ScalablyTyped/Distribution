package typings
package rxjsLib.internalOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R] extends js.Object {
  def call(subscriber: rxjsLib.internalSubscriberMod.Subscriber[R], source: js.Any): rxjsLib.internalTypesMod.TeardownLogic
}

object Operator {
  @scala.inline
  def apply[T, R](
    call: js.Function2[
      rxjsLib.internalSubscriberMod.Subscriber[R], 
      js.Any, 
      rxjsLib.internalTypesMod.TeardownLogic
    ]
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[Operator[T, R]]
  }
}

