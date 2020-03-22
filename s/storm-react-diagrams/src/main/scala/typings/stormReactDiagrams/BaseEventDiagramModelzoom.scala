package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  zoom  :number} */
trait BaseEventDiagramModelzoom extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var zoom: Double
  def stopPropagation(): js.Any
}

object BaseEventDiagramModelzoom {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    stopPropagation: () => js.Any,
    zoom: Double
  ): BaseEventDiagramModelzoom = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseEventDiagramModelzoom]
  }
}

