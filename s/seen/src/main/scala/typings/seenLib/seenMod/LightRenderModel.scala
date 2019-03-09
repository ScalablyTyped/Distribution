package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "LightRenderModel")
@js.native
class LightRenderModel protected () extends js.Object {
  def this(light: Light, transform: Matrix) = this()
  var colorIntensity: Color = js.native
  var intensity: scala.Double = js.native
  var normal: Point = js.native
  var origin: Point = js.native
  var point: Point = js.native
  var `type`: java.lang.String = js.native
}

