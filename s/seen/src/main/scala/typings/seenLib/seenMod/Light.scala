package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Light")
@js.native
class Light protected () extends Transformable {
  def this(`type`: seenLib.seenLibStrings.ambient) = this()
  def this(`type`: seenLib.seenLibStrings.directional) = this()
  def this(`type`: seenLib.seenLibStrings.point) = this()
  def this(`type`: seenLib.seenLibStrings.ambient, options: LightOptions) = this()
  def this(`type`: seenLib.seenLibStrings.directional, options: LightOptions) = this()
  def this(`type`: seenLib.seenLibStrings.point, options: LightOptions) = this()
  var color: Color = js.native
  var defaults: LightOptions = js.native
  var enabled: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var intensity: scala.Double = js.native
  var normal: Point = js.native
  var point: Point = js.native
  var `type`: java.lang.String = js.native
  def render(): scala.Unit = js.native
}

