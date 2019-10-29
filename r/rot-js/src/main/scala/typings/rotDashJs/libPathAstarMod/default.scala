package typings.rotDashJs.libPathAstarMod

import typings.rotDashJs.libPathPathMod.Options
import typings.rotDashJs.libPathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path/astar", JSImport.Default)
@js.native
class default protected () extends AStar {
  def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
  def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
}

