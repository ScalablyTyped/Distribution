package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGridSize extends js.Object {
  var gridSize: Double
  var id: String
  var links: js.Array[AnonExtras]
  var nodes: js.Array[AnonExtrasId]
  var offsetX: Double
  var offsetY: Double
  var zoom: Double
}

object AnonGridSize {
  @scala.inline
  def apply(
    gridSize: Double,
    id: String,
    links: js.Array[AnonExtras],
    nodes: js.Array[AnonExtrasId],
    offsetX: Double,
    offsetY: Double,
    zoom: Double
  ): AnonGridSize = {
    val __obj = js.Dynamic.literal(gridSize = gridSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGridSize]
  }
}

