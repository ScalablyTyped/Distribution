package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSize extends js.Object {
  var gridSize: Double
  var id: String
  var links: js.Array[Labels]
  var nodes: js.Array[Ports]
  var offsetX: Double
  var offsetY: Double
  var zoom: Double
}

object GridSize {
  @scala.inline
  def apply(
    gridSize: Double,
    id: String,
    links: js.Array[Labels],
    nodes: js.Array[Ports],
    offsetX: Double,
    offsetY: Double,
    zoom: Double
  ): GridSize = {
    val __obj = js.Dynamic.literal(gridSize = gridSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSize]
  }
}

