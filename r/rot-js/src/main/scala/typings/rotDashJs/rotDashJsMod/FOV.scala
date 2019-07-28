package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
class FOV protected () extends js.Object {
  def this(lightPassesCallback: LightPassesCallback) = this()
  def this(lightPassesCallback: LightPassesCallback, options: FOVOptions) = this()
  def compute(x: Double, y: Double, R: Double, callback: FOVCallback): Unit = js.native
}

