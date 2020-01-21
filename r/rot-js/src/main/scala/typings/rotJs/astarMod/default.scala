package typings.rotJs.astarMod

import typings.rotJs.pathPathMod.Options
import typings.rotJs.pathPathMod.PassableCallback
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

