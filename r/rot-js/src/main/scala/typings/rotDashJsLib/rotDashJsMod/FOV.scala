package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
class FOV protected () extends js.Object {
  def this(lightPassesCallback: LightPassesCallback) = this()
  def this(lightPassesCallback: LightPassesCallback, options: FOVOptions) = this()
  def compute(x: scala.Double, y: scala.Double, R: scala.Double, callback: FOVCallback): scala.Unit = js.native
}

