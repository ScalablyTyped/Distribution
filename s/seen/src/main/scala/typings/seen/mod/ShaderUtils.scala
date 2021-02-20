package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShaderUtils {
  
  @JSImport("seen", "ShaderUtils.applyAmbient")
  @js.native
  def applyAmbient(c: Color, light: Light): Unit = js.native
  
  @JSImport("seen", "ShaderUtils.applyDiffuse")
  @js.native
  def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point): Unit = js.native
  @JSImport("seen", "ShaderUtils.applyDiffuse")
  @js.native
  def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = js.native
  
  @JSImport("seen", "ShaderUtils.applyDiffuseAndSpecular")
  @js.native
  def applyDiffuseAndSpecular(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = js.native
}
