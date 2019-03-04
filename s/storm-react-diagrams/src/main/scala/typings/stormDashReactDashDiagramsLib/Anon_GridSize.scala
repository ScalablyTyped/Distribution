package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridSize extends js.Object {
  var gridSize: scala.Double
  var id: java.lang.String
  var links: js.Array[Anon_Extras]
  var nodes: js.Array[Anon_ExtrasId]
  var offsetX: scala.Double
  var offsetY: scala.Double
  var zoom: scala.Double
}

object Anon_GridSize {
  @scala.inline
  def apply(
    gridSize: scala.Double,
    id: java.lang.String,
    links: js.Array[Anon_Extras],
    nodes: js.Array[Anon_ExtrasId],
    offsetX: scala.Double,
    offsetY: scala.Double,
    zoom: scala.Double
  ): Anon_GridSize = {
    val __obj = js.Dynamic.literal(gridSize = gridSize, id = id, links = links, nodes = nodes, offsetX = offsetX, offsetY = offsetY, zoom = zoom)
  
    __obj.asInstanceOf[Anon_GridSize]
  }
}

