package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  offsetX  :number,   offsetY  :number} */
trait BaseEventDiagramModeloffs extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var offsetX: Double
  var offsetY: Double
  def stopPropagation(): js.Any
}

object BaseEventDiagramModeloffs {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    offsetX: Double,
    offsetY: Double,
    stopPropagation: () => js.Any
  ): BaseEventDiagramModeloffs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[BaseEventDiagramModeloffs]
  }
}

