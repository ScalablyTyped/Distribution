package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Material")
@js.native
class Material () extends js.Object {
  def this(color: Color) = this()
  def this(color: Color, options: MaterialOptions) = this()
  var color: Color = js.native
  var defaults: MaterialOptions = js.native
  var metallic: scala.Boolean = js.native
  var shader: Shader = js.native
  var specularColor: Color = js.native
  var specularExponent: scala.Double = js.native
  def render(): Color = js.native
  def render(lights: js.Array[Light]): Color = js.native
  def render(lights: js.Array[Light], shader: Shader): Color = js.native
  def render(lights: js.Array[Light], shader: Shader, renderData: RenderModel): Color = js.native
}

/* static members */
@JSImport("seen", "Material")
@js.native
object Material extends js.Object {
  def create(): seenLib.seenMod.Material = js.native
  def create(value: java.lang.String): seenLib.seenMod.Material = js.native
  def create(value: seenLib.seenMod.Color): seenLib.seenMod.Material = js.native
  def create(value: seenLib.seenMod.Material): seenLib.seenMod.Material = js.native
}

