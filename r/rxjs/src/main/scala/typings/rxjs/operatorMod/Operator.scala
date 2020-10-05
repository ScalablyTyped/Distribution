package typings.rxjs.operatorMod

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operator[T, R] extends js.Object {
  def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
}

object Operator {
  @scala.inline
  def apply[T, R](call: (Subscriber[R], js.Any) => TeardownLogic): Operator[T, R] = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
    __obj.asInstanceOf[Operator[T, R]]
  }
  @scala.inline
  implicit class OperatorOps[Self <: Operator[_, _], T, R] (val x: Self with (Operator[T, R])) extends AnyVal {
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
    def setCall(value: (Subscriber[R], js.Any) => TeardownLogic): Self = this.set("call", js.Any.fromFunction2(value))
  }
  
}

