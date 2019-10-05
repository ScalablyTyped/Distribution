package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Path")
@js.native
class Path protected () extends js.Object {
  def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
  def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PathOptions) = this()
  def compute(fromX: Double, fromY: Double, callback: PathCallback): Unit = js.native
}

@JSImport("rot-js", "Path")
@js.native
object Path extends js.Object {
  @js.native
  class AStar () extends Path
  
  @js.native
  class Dijkstra () extends Path
  
}

