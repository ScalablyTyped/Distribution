package typings.stormReactDiagrams.baseEntityMod

import typings.stormReactDiagrams.anon.Locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseListener[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] with Locked, Unit]] = js.native
}

object BaseListener {
  @scala.inline
  def apply[/* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[typings.stormReactDiagrams.baseEntityMod.BaseListener[_]] */ T](): BaseListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseListener[T]]
  }
  @scala.inline
  implicit class BaseListenerOps[Self <: BaseListener[_], /* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[typings.stormReactDiagrams.baseEntityMod.BaseListener[_]] */ T] (val x: Self with BaseListener[T]) extends AnyVal {
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
    def setLockChanged(value: /* event */ BaseEvent[T] with Locked => Unit): Self = this.set("lockChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLockChanged: Self = this.set("lockChanged", js.undefined)
  }
  
}

