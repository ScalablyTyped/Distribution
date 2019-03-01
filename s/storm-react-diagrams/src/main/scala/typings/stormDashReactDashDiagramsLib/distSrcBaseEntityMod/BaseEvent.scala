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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("firing")(firing)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[BaseEvent[T]]
  }
}

