package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "ShaderUtils")
@js.native
object ShaderUtils extends js.Object {
  def applyAmbient(c: Color, light: Light): Unit = js.native
  def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point): Unit = js.native
  def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = js.native
  def applyDiffuseAndSpecular(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = js.native
}

