package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "ShaderUtils")
@js.native
object ShaderUtils extends js.Object {
  def applyAmbient(c: seenLib.seenMod.Color, light: seenLib.seenMod.Light): scala.Unit = js.native
  def applyDiffuse(
    c: seenLib.seenMod.Color,
    light: seenLib.seenMod.Light,
    lightNormal: seenLib.seenMod.Point,
    surfaceNormal: seenLib.seenMod.Point
  ): scala.Unit = js.native
  def applyDiffuse(
    c: seenLib.seenMod.Color,
    light: seenLib.seenMod.Light,
    lightNormal: seenLib.seenMod.Point,
    surfaceNormal: seenLib.seenMod.Point,
    material: seenLib.seenMod.Material
  ): scala.Unit = js.native
  def applyDiffuseAndSpecular(
    c: seenLib.seenMod.Color,
    light: seenLib.seenMod.Light,
    lightNormal: seenLib.seenMod.Point,
    surfaceNormal: seenLib.seenMod.Point,
    material: seenLib.seenMod.Material
  ): scala.Unit = js.native
}

