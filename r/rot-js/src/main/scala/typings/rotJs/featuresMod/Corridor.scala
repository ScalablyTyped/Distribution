package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/map/features", "Corridor")
@js.native
class Corridor protected () extends Feature {
  def this(startX: Double, startY: Double, endX: Double, endY: Double) = this()
  
  var _endX: Double = js.native
  
  var _endY: Double = js.native
  
  var _endsWithAWall: Boolean = js.native
  
  var _startX: Double = js.native
  
  var _startY: Double = js.native
  
  def createPriorityWalls(priorityWallCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
}
/* static members */
@JSImport("rot-js/lib/map/features", "Corridor")
@js.native
object Corridor extends js.Object {
  
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: CorridorOptions): Corridor = js.native
}
