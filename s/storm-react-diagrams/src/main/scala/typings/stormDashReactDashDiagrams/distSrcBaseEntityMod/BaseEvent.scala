package typings.stormDashReactDashDiagrams.distSrcBaseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  def stopPropagation(): js.Any
}

object BaseEvent {
  @scala.inline
  def apply[T /* <: BaseEntity[BaseListener[_]] */](entity: BaseEntity[BaseListener[_]], firing: Boolean, id: String, stopPropagation: () => js.Any): BaseEvent[T] = {
    val __obj = js.Dynamic.literal(entity = entity, firing = firing, id = id, stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[BaseEvent[T]]
  }
}

