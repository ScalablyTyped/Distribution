package typings.stormReactDiagrams.baseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEvent[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var entity: BaseEntity[BaseListener[_]] = js.native
  var firing: Boolean = js.native
  var id: String = js.native
  def stopPropagation(): js.Any = js.native
}

object BaseEvent {
  @scala.inline
  def apply[/* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[typings.stormReactDiagrams.baseEntityMod.BaseListener[_]] */ T](entity: BaseEntity[BaseListener[_]], firing: Boolean, id: String, stopPropagation: () => js.Any): BaseEvent[T] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEvent[T]]
  }
  @scala.inline
  implicit class BaseEventOps[Self <: BaseEvent[_], /* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[typings.stormReactDiagrams.baseEntityMod.BaseListener[_]] */ T] (val x: Self with BaseEvent[T]) extends AnyVal {
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
    def setEntity(value: BaseEntity[BaseListener[_]]): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiring(value: Boolean): Self = this.set("firing", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

