package typings.seen.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "LightRenderModel")
@js.native
class LightRenderModel protected () extends js.Object {
  def this(light: Light, transform: Matrix) = this()
  var colorIntensity: Color = js.native
  var intensity: Double = js.native
  var normal: Point = js.native
  var origin: Point = js.native
  var point: Point = js.native
  var `type`: String = js.native
}

