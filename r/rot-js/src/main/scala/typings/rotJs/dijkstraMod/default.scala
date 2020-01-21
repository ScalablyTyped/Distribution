package typings.rotJs.dijkstraMod

import typings.rotJs.pathPathMod.Options
import typings.rotJs.pathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path/dijkstra", JSImport.Default)
@js.native
class default protected () extends Dijkstra {
  def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
}

