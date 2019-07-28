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

