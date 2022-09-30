package typings.snapchatLensStudio.global

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProceduralTextureProvider {
  
  @JSGlobal("ProceduralTextureProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a new, blank Texture Provider using the passed in dimensions and Colorspace. The ProceduralTextureProvider can be accessed through the control property on the returned texture. */
  inline def create(width: Double, height: Double, colorspace: typings.snapchatLensStudio.Colorspace): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], colorspace.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  /** Creates a new Procedural Texture based on the passed in texture. The ProceduralTextureProvider can be accessed through the control property on the returned texture. */
  inline def createFromTexture(texture: Texture): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Texture]
}
