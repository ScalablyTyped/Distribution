package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridSize extends js.Object {
  var gridSize: Double
  var id: String
  var links: js.Array[Anon_Extras]
  var nodes: js.Array[Anon_ExtrasId]
  var offsetX: Double
  var offsetY: Double
  var zoom: Double
}

object Anon_GridSize {
  @scala.inline
  def apply(
    gridSize: Double,
    id: String,
    links: js.Array[Anon_Extras],
    nodes: js.Array[Anon_ExtrasId],
    offsetX: Double,
    offsetY: Double,
    zoom: Double
  ): Anon_GridSize = {
    val __obj = js.Dynamic.literal(gridSize = gridSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GridSize]
  }
}

