package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShaderUtils {
  
  @JSImport("seen", "ShaderUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyAmbient(c: Color, light: Light): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAmbient")(c.asInstanceOf[js.Any], light.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDiffuse")(c.asInstanceOf[js.Any], light.asInstanceOf[js.Any], lightNormal.asInstanceOf[js.Any], surfaceNormal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyDiffuse(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDiffuse")(c.asInstanceOf[js.Any], light.asInstanceOf[js.Any], lightNormal.asInstanceOf[js.Any], surfaceNormal.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyDiffuseAndSpecular(c: Color, light: Light, lightNormal: Point, surfaceNormal: Point, material: Material): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDiffuseAndSpecular")(c.asInstanceOf[js.Any], light.asInstanceOf[js.Any], lightNormal.asInstanceOf[js.Any], surfaceNormal.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
