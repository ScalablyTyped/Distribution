package typings.rotDashJs.libPathDijkstraMod

import typings.rotDashJs.libPathPathMod.Options
import typings.rotDashJs.libPathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path/dijkstra", JSImport.Default)
@js.native
class default protected () extends Dijkstra {
  def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
}

