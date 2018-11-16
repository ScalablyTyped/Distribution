package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Lighting")
@js.native
class Lighting protected () extends js.Object {
  def this(reflectivityCallback: ReflectivityCallback) = this()
  def this(reflectivityCallback: ReflectivityCallback, options: LightingOptions) = this()
  def clearLights(): scala.Unit = js.native
  def compute(lightingCallback: LightingCallback): this.type = js.native
  def reset(): this.type = js.native
  def setFOV(fov: FOV): this.type = js.native
  def setLight(x: scala.Double, y: scala.Double, color: java.lang.String): this.type = js.native
  def setLight(x: scala.Double, y: scala.Double, color: js.Tuple3[scala.Double, scala.Double, scala.Double]): this.type = js.native
  def setOptions(options: LightingOptions): this.type = js.native
}

