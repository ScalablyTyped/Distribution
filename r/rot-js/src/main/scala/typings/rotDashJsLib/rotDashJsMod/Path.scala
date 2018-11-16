package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Path")
@js.native
class Path protected () extends js.Object {
  def this(toX: scala.Double, toY: scala.Double, passableCallback: PassableCallback) = this()
  def this(toX: scala.Double, toY: scala.Double, passableCallback: PassableCallback, options: PathOptions) = this()
  def compute(fromX: scala.Double, fromY: scala.Double, callback: PathCallback): scala.Unit = js.native
}

