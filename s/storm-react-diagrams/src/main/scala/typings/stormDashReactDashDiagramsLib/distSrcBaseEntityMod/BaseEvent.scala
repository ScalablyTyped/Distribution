package typings
package stormDashReactDashDiagramsLib.distSrcBaseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: scala.Boolean
  var id: java.lang.String
  def stopPropagation(): js.Any
}

object BaseEvent {
  @scala.inline
  def apply[T /* <: BaseEntity[BaseListener[_]] */](
    entity: BaseEntity[BaseListener[_]],
    firing: scala.Boolean,
    id: java.lang.String,
    stopPropagation: js.Function0[js.Any]
  ): BaseEvent[T] = {
    val __obj = js.Dynamic.literal(entity = entity, firing = firing, id = id, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[BaseEvent[T]]
  }
}

